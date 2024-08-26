package org.mikyegresl.newsaggregator.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import org.mikyegresl.data.network.NetworkClient
import org.mikyegresl.data.network.config.NetworkConfigProvider
import org.mikyegresl.data.network.news.NewsApi
import org.mikyegresl.data.network.news.NewsRemoteDataSource
import org.mikyegresl.data.network.news.NewsRemoteDataSourceImpl
import org.mikyegresl.newsaggregator.config.AppConfigProvider
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object NetworkModule {

    @Provides
    @Singleton
    fun provideNetworkConfigProvider(): NetworkConfigProvider =
        AppConfigProvider()

    @Provides
    @Singleton
    fun provideNetworkClient(configProvider: NetworkConfigProvider): NetworkClient =
        NetworkClient(configProvider = configProvider)

    @Provides
    @Singleton
    fun provideNewsApiService(networkClient: NetworkClient): NewsApi =
        networkClient.newsApi

    @Provides
    @Singleton
    fun provideNewsRemoteDataSource(api: NewsApi): NewsRemoteDataSource =
        NewsRemoteDataSourceImpl(api)
}