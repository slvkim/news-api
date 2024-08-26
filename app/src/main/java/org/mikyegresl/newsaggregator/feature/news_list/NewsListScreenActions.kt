package org.mikyegresl.newsaggregator.feature.news_list

internal class NewsListScreenActions(
    val onScreenOpened: () -> Unit,
    val onNewsItemClicked: (NewsUiModel) -> Unit,
)