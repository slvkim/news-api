package org.mikyegresl.newsaggregator.feature.news_list

import android.os.Parcelable
import androidx.compose.runtime.Immutable
import kotlinx.parcelize.Parcelize
import org.mikyegresl.domain.business.news.News

internal data class NewsListState(
    val news: List<NewsUiModel>,
    val isLoading: Boolean,
    val errorMessage: String?
) {
    companion object {
        fun defaultState() = NewsListState(
            isLoading = true,
            errorMessage = null,
            news = emptyList()
        )
    }
}

@Immutable
@Parcelize
internal data class NewsUiModel(
    val author: String,
    val title: String,
    val description: String,
    val content: String,
    val url: String,
    val imgUrl: String,
    val publishedAt: String,
) : Parcelable

internal fun News.toUiModel() = NewsUiModel(
    author = author,
    title = title,
    description = description,
    content = content,
    url = url,
    imgUrl = imgUrl,
    publishedAt = publishedAt,
)