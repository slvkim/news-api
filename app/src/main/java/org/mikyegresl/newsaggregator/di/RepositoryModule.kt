package org.mikyegresl.newsaggregator.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import org.mikyegresl.domain.business.news.NewsRepository
import org.mikyegresl.domain.business.news.NewsRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindNewsRepository(
        repositoryImpl: NewsRepositoryImpl
    ): NewsRepository
}