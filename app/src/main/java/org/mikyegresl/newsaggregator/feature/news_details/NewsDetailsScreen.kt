package org.mikyegresl.newsaggregator.feature.news_details

import android.text.Html
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.mikyegresl.design_system.NewsAggregatorTheme
import org.mikyegresl.newsaggregator.R
import org.mikyegresl.newsaggregator.feature.news_list.NewsUiModel
import org.mikyegresl.newsaggregator.ui.extensions.Spacer

@Composable
internal fun NewsDetailsScreen(
    news: NewsUiModel,
    actions: NewsDetailsScreenActions
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier
                        .size(24.dp)
                        .rotate(210f)
                        .clickable { actions.onBackPressed() },
                    painter = painterResource(id = R.drawable.ic_arrow_left),
                    contentDescription = null,
                    tint = NewsAggregatorTheme.colors.background.primaryInverted
                )
                Spacer(modifier = Modifier.weight(.5f))
                Text(
                    modifier = Modifier.weight(3f),
                    text = news.title,
                    style = NewsAggregatorTheme.typography.titles.smallTitle.copy(
                        color = NewsAggregatorTheme.colors.text.primary,
                        textAlign = TextAlign.Center
                    ),
                    maxLines = 5,
                    overflow = TextOverflow.Ellipsis,
                    softWrap = true,
                )
                Spacer(modifier = Modifier.weight(.5f))
            }
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp)
                .padding(paddingValues)
        ) {
            item {
                Column {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        if (news.author.isNotBlank()) {
                            AuthorText(text = news.author)
                        }
                        ArticleLink(url = news.url) {
                            actions.onUrlClicked(it)
                        }
                    }
                    Spacer(height = 24.dp)
                    NewsContent(
                        description = news.description,
                        content = news.content
                    )
                }
            }
        }
    }
}

@Composable
private fun AuthorText(text: String) {
    Text(
        modifier = Modifier
            .background(
                color = NewsAggregatorTheme.colors.background.quaternary,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(vertical = 12.dp, horizontal = 16.dp),
        text = text,
        style = NewsAggregatorTheme.typography.base.callout
    )
}

@Composable
private fun ArticleLink(
    url: String,
    onUrlClicked: (String) -> Unit
) {
    val annotatedLinkString = buildAnnotatedString {
        val str = stringResource(id = R.string.read_full_article)
        append(str)
        addStyle(
            style = SpanStyle(
                textDecoration = TextDecoration.Underline
            ), 0, str.length - 1
        )
    }
    Text(
        modifier = Modifier.clickable { onUrlClicked(url) },
        text = annotatedLinkString,
        style = NewsAggregatorTheme.typography.base.footnote.copy(
            color = NewsAggregatorTheme.colors.text.secondary,
            fontStyle = FontStyle.Italic
        )
    )
}

@Composable
private fun ColumnScope.NewsContent(
    description: String,
    content: String
) {
    Text(
        modifier = Modifier,
        text = description,
        style = NewsAggregatorTheme.typography.base.callout
    )
    Spacer(height = 24.dp)
    Text(
        text = Html.fromHtml(content).toString(),
        style = NewsAggregatorTheme.typography.base.body.copy(
            color = NewsAggregatorTheme.colors.text.primary
        )
    )
}

@Preview
@Composable
private fun Preview_NewsDetailsScreen() {
    NewsDetailsScreen(
        news = NewsUiModel(
            author = "Bbc News",
            title = "Yorkshire runners to take on world's most northerly Parkrun",
            description = "The Parkrun near the Arctic Circle in Finland is organised by a man originally from Huddersfield.",
            url = "https://www.bbc.co.uk/news/articles/clynzye801lo",
            content = "",
            imgUrl = "https://ichef.bbci.co.uk/news/1024/branded_news/bac8/live/3555ad50-6175-11ef-b970-9f202720b57a.jpg",
            publishedAt = "2024.04.04",
        ),
        actions = NewsDetailsScreenActions(
            onBackPressed = {},
            onUrlClicked = {}
        )
    )
}
