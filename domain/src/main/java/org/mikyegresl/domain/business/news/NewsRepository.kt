package org.mikyegresl.domain.business.news

import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    suspend fun fetchNews(
        country: Country = Country.US
    )

    suspend fun saveNews(news: List<News>)

    fun observeNews(): Flow<List<News>>
}