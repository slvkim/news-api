package org.mikyegresl.domain.business.news

import android.util.Log
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.mikyegresl.data.cache.news.NewsDao
import org.mikyegresl.data.network.common.fold
import org.mikyegresl.data.network.news.NewsRemoteDataSource
import org.mikyegresl.domain.common.EMPTY_STRING
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(
    private val remoteDataSource: NewsRemoteDataSource,
    private val dao: NewsDao
) : NewsRepository {

    private val outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
    private val inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssX")

    override suspend fun fetchNews(
        country: Country,
    ) {
        val today = LocalDateTime.now()

        remoteDataSource.getTopHeadlines(
            country = country.toString(),
            from = today.minusDays(1).format(outputFormatter),
            to = today.format(outputFormatter),
            //TODO: do pagination
//            pageSize = pageSize,
//            page = page
        ).fold(
            onError = { errorMessage ->
                //TODO: more elegant way to propagate error message. E.g., doing fold in ViewModel but converting to final domain model here
                throw Exception(errorMessage)
            },
            onSuccess = { dto ->
                val news = dto.map { newsDto ->
                    val publishedAt = runCatching {
                        LocalDateTime.parse(
                            newsDto.publishedAt,
                            inputFormatter
                        ).format(outputFormatter)
                    }.getOrElse {
                        EMPTY_STRING
                    }
                    newsDto.toNews(publishedAt)
                }
                saveNews(news)
            }
        )
    }

    override suspend fun saveNews(news: List<News>) {
        val entities = news.map { it.toNewsEntity() }
        dao.insertNews(entities)
    }

    override fun observeNews(): Flow<List<News>> =
        dao.getAllNews().map { it.map { it.toNews() } }

    companion object {
        private const val DEFAULT_PAGE_SIZE = 20
    }
}