package org.mikyegresl.newsaggregator.feature.news_list

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import org.mikyegresl.design_system.NewsAggregatorTheme
import org.mikyegresl.newsaggregator.R
import org.mikyegresl.newsaggregator.ui.extensions.Spacer

@Composable
internal fun NewsListScreen(
    news: List<NewsUiModel>,
    actions: NewsListScreenActions = NewsListScreenActions({}, {}),
) {
    LaunchedEffect(key1 = Unit) {
        actions.onScreenOpened()
    }
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(NewsAggregatorTheme.colors.background.primary)
            ) {
                Text(
                    modifier = Modifier.padding(vertical = 24.dp, horizontal = 16.dp),
                    text = stringResource(id = R.string.news_list_title),
                    style = NewsAggregatorTheme.typography.titles.smallTitle.copy(
                        textAlign = TextAlign.Center,
                        color = NewsAggregatorTheme.colors.text.primary
                    )
                )
            }
        },
        bottomBar = {

        }
    ) { paddingValues ->
        NewsList(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp, horizontal = 16.dp),
            items = news,
            paddingValues = paddingValues,
            onNewsItemClicked = actions.onNewsItemClicked
        )
    }
}

@Composable
private fun NewsList(
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues,
    items: List<NewsUiModel>,
    onNewsItemClicked: (NewsUiModel) -> Unit,
) {
    val listState = rememberLazyListState()
    LazyColumn(
        modifier = modifier,
        state = listState,
        contentPadding = paddingValues,
    ) {
        itemsIndexed(items) { i, item ->
            NewsItem(
                modifier = Modifier.clickable { onNewsItemClicked(item) },
                item = item
            )
            Spacer(16.dp)
        }
    }
}

@Composable
private fun NewsItem(
    modifier: Modifier = Modifier,
    item: NewsUiModel
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        AsyncImage(
            modifier = Modifier.weight(1.3f),
            model = item.imgUrl,
            contentDescription = null
        )
        Spacer(width = 8.dp)
        Column(
            modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = item.author,
                style = NewsAggregatorTheme.typography.titles.xSmallTitle.copy(
                    color = NewsAggregatorTheme.colors.text.primary
                )
            )
            Spacer(height = 4.dp)
            Text(
                text = item.title,
                style = NewsAggregatorTheme.typography.titles.xSmallTitle.copy(
                    color = NewsAggregatorTheme.colors.text.primary
                ),
                maxLines = 3
            )
            Spacer(height = 12.dp)
            Text(
                text = item.publishedAt,
                style = NewsAggregatorTheme.typography.base.footnote.copy(
                    color = NewsAggregatorTheme.colors.text.secondary,
                    textAlign = TextAlign.End
                )
            )
        }
    }
}

@Preview
@Composable
private fun Preview_NewsItem() {
    NewsItem(
        modifier = Modifier.background(Color.White),
        item = NewsUiModel(
            author = "Bbc News",
            title = "Yorkshire runners to take on world's most northerly Parkrun",
            description = "The Parkrun near the Arctic Circle in Finland is organised by a man originally from Huddersfield.",
            url = "https://www.bbc.co.uk/news/articles/clynzye801lo",
            content = "",
            imgUrl = "https://ichef.bbci.co.uk/news/1024/branded_news/bac8/live/3555ad50-6175-11ef-b970-9f202720b57a.jpg",
            publishedAt = "2024.04.04",
        )
    )
}