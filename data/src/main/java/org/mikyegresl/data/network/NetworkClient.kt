package org.mikyegresl.data.network

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.mikyegresl.data.network.config.NetworkConfigProvider
import org.mikyegresl.data.network.interceptor.HeaderInterceptor
import org.mikyegresl.data.network.news.NewsApi
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit

class NetworkClient(
    private val configProvider: NetworkConfigProvider
) {
    private val headerInterceptor by lazy {
        HeaderInterceptor(
            configProvider = configProvider
        )
    }
    private val loggingInterceptor by lazy {
        HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
    }

    private val okHttpClient by lazy {
        OkHttpClient.Builder().apply {
            connectTimeout(CONNECT_TIMEOUT_SEC, TimeUnit.SECONDS)
            readTimeout(READ_TIMEOUT_SEC, TimeUnit.SECONDS)
            writeTimeout(WRITE_TIMEOUT_SEC, TimeUnit.SECONDS)
            if (configProvider.isDebug) {
                addNetworkInterceptor(loggingInterceptor)
            }
            addNetworkInterceptor(headerInterceptor)
        }.build()
    }

    private val retrofitClient by lazy {
        Retrofit.Builder().apply {
            baseUrl(configProvider.baseUrl)
            addConverterFactory(json.asConverterFactory("application/json".toMediaType()))
            client(okHttpClient)
        }.build()
    }

    val newsApi: NewsApi by lazy { retrofitClient.create(NewsApi::class.java) }

    companion object {
        const val CONNECT_TIMEOUT_SEC = 60L
        const val READ_TIMEOUT_SEC = 30L
        const val WRITE_TIMEOUT_SEC = 15L

        val json = Json { ignoreUnknownKeys = true }
    }
}