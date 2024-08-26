package org.mikyegresl.newsaggregator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import org.mikyegresl.design_system.NewsAggregatorTheme
import org.mikyegresl.newsaggregator.common.openWebsite
import org.mikyegresl.newsaggregator.feature.news_details.NewsDetailsScreen
import org.mikyegresl.newsaggregator.feature.news_details.NewsDetailsScreenActions
import org.mikyegresl.newsaggregator.feature.news_list.NewsListScreen
import org.mikyegresl.newsaggregator.feature.news_list.NewsListScreenActions
import org.mikyegresl.newsaggregator.feature.news_list.NewsListViewModel
import org.mikyegresl.newsaggregator.feature.news_list.NewsUiModel
import org.mikyegresl.newsaggregator.navigation.NavigationItem
import org.mikyegresl.newsaggregator.navigation.getParcelableCompat
import org.mikyegresl.newsaggregator.navigation.navigate

@AndroidEntryPoint
class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsAggregatorTheme {
                val newsViewModel: NewsListViewModel = hiltViewModel()
                val newsListState = newsViewModel.newsListState.collectAsStateWithLifecycle()
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = NavigationItem.NewsList.route) {
                    composable(NavigationItem.NewsList.route) {
                        NewsListScreen(
                            news = newsListState.value.news,
                            actions = NewsListScreenActions(
                                onScreenOpened = { newsViewModel.fetchData() },
                                onNewsItemClicked = {
                                    navController.navigate(
                                        route = NavigationItem.NewsDetails.route,
                                        args = Bundle().apply { putParcelable("news", it) }
                                    )
                                }
                            )
                        )
                    }
                    composable(NavigationItem.NewsDetails.route) {
                        it.arguments.getParcelableCompat("news", NewsUiModel::class.java)?.let {
                            NewsDetailsScreen(
                                news = it,
                                actions = NewsDetailsScreenActions(
                                    onBackPressed = { navController.popBackStack() },
                                    onUrlClicked = { this@MainActivity.openWebsite(it) }
                                )
                            )
                        }
                    }
                }
            }
        }
    }
}