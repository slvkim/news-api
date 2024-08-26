package org.mikyegresl.data.network.news

import retrofit2.http.GET
import retrofit2.http.Query
import java.net.URLEncoder

interface NewsApi {

    //TODO: searchIn, domains, sortBy need to be extracted to separate models. Using like this for brevity.
    @GET("v2/everything")
    suspend fun getTopHeadlines(
//        @Query("country") country: String,
        @Query("searchIn") searchIn: String = "title,content,description",
        @Query("sortBy") sortBy: String = "popularity",
        //TODO: extension function for compatibility as getParcelableCompat()
        @Query("q") q: String = URLEncoder.encode("bitcoin"),
//        @Query("from") from: String,
//        @Query("to") to: String,
//        @Query("pageSize") pageSize: Int,
//        @Query("page") page: Int
    ): ApiResponse<NewsDto>
}