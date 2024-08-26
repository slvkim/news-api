package org.mikyegresl.data.network.news

import org.mikyegresl.data.network.common.ApiResult
import org.mikyegresl.data.network.common.processNetworkRequest

interface NewsRemoteDataSource {

    suspend fun getTopHeadlines(
        country: String,
        from: String,
        to: String,
//        pageSize: Int,
//        page: Int
    ): ApiResult<NewsDto>
}

class NewsRemoteDataSourceImpl(
    private val newsApi: NewsApi
) : NewsRemoteDataSource {

    override suspend fun getTopHeadlines(
        country: String,
        from: String,
        to: String,
//        pageSize: Int,
//        page: Int
    ): ApiResult<NewsDto> {
        //TODO: spend more research on which dates to pass for optimization
        return processNetworkRequest {
            newsApi.getTopHeadlines(
//                country,
//                from = from,
//                to = to,
//                pageSize = pageSize,
//                page = page
            )
        }
    }
}