package org.mikyegresl.domain.business.news

data class News(
    val author: String,
    val title: String,
    val description: String,
    val content: String,
    val url: String,
    val imgUrl: String,
    val publishedAt: String
)
