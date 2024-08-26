package org.mikyegresl.data.network.news

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.mikyegresl.data.network.common.NetworkStatusDto

@Serializable
class ApiResponse<T>(
    @SerialName("status")
    val statusDto: NetworkStatusDto? = null,
    @SerialName("totalResults")
    val totalItems: Int? = null,
    @SerialName("articles")
    val data: List<T>? = null,
    @SerialName("code")
    val errorCode: Int? = null,
    @SerialName("message")
    val errorMessage: String? = null
)

@Serializable
class NewsDto(
    @SerialName("author")
    val author: String? = null,
    @SerialName("title")
    val title: String? = null,
    @SerialName("description")
    val description: String? = null,
    @SerialName("content")
    val content: String? = null,
    @SerialName("url")
    val url: String? = null,
    @SerialName("urlToImage")
    val imgUrl: String? = null,
    @SerialName("publishedAt")
    val publishedAt: String? = null,
)