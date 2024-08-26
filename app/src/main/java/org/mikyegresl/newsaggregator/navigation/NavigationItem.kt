package org.mikyegresl.newsaggregator.navigation

internal sealed class NavigationItem(
    val route: String
) {
    data object NewsList : NavigationItem(
        route = "newsList"
    )

    data object NewsDetails : NavigationItem(
        route = "newsDetails"
    ) {
        const val article = "article"
    }
}