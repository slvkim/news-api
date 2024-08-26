package org.mikyegresl.data.network.interceptor

import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import okhttp3.Interceptor
import okhttp3.Response
import org.mikyegresl.data.network.config.NetworkConfigProvider

internal class HeaderInterceptor(
    private val configProvider: NetworkConfigProvider,
): Interceptor {

    companion object {
        private const val API_KEY_NAME = "x-api-key"
    }
    private val mutex = Mutex()
    private suspend fun getApiKeySynchronous(): String =
        mutex.withLock { configProvider.apiKey }
    private fun getApiKey(): String = configProvider.apiKey

    override fun intercept(chain: Interceptor.Chain): Response = chain.run {
        val apiKey = getApiKey()
        proceed(
            request()
                .newBuilder()
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .addHeader(API_KEY_NAME, apiKey)
                .build()
        )
    }
}
