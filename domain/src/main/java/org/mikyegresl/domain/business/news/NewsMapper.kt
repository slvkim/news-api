package org.mikyegresl.domain.business.news

import org.mikyegresl.data.cache.news.NewsEntity
import org.mikyegresl.data.network.news.NewsDto
import org.mikyegresl.domain.common.EMPTY_STRING

internal fun NewsDto.toNews(publishedAt: String): News =
    News(
        author = author ?: EMPTY_STRING,
        title = title ?: EMPTY_STRING,
        description = description ?: EMPTY_STRING,
        content = content ?: EMPTY_STRING,
        url = url ?: EMPTY_STRING,
        imgUrl = imgUrl ?: EMPTY_STRING,
        publishedAt = publishedAt,
    )

internal fun News.toNewsEntity(): NewsEntity =
    NewsEntity(
        author = author,
        title = title,
        description = description,
        content = content,
        url = url,
        imageUrl = imgUrl,
        publishedAt = publishedAt,
    )

internal fun NewsEntity.toNews(): News =
    News(
        author = author,
        title = title,
        description = description,
        content = content,
        url = url,
        imgUrl = imageUrl,
        publishedAt = publishedAt,
    )
