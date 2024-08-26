package org.mikyegresl.data.cache.news

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "news")
data class NewsEntity(
    //TODO: although topHeadlines seem to always have url, if it can be null, use composite key
    @PrimaryKey val url: String,
    val title: String,
    val author: String,
    val description: String,
    val content: String,
    val imageUrl: String,
    val publishedAt: String
)