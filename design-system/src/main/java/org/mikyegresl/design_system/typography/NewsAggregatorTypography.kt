package org.mikyegresl.design_system.typography

import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

/**
 * NewsAggregator Typography.
 * */
@Stable
data class NewsAggregatorTypography(
    val base: NewsAggregatorBaseTypography,
    val titles: NewsAggregatorTitlesTypography,
    val paragraph: NewsAggregatorParagraphTypography
)

internal val LocalNewsAggregatorTypography = staticCompositionLocalOf {
    NewsAggregatorTypography(
        base = NewsAggregatorBaseTypography(
            body = TextStyle(
                fontFamily = NewsAggregatorFontFamilies.graphik,
                fontSize = 17.sp,
                lineHeight = 24.sp,
                fontWeight = FontWeight.Normal,
                fontStyle = FontStyle.Normal,
            ),
            callout = TextStyle(
                fontFamily = NewsAggregatorFontFamilies.graphik,
                fontSize = 16.sp,
                lineHeight = 24.sp,
                fontWeight = FontWeight.Normal,
                fontStyle = FontStyle.Normal
            ),
            subheadline = TextStyle(
                fontFamily = NewsAggregatorFontFamilies.graphik,
                fontSize = 15.sp,
                lineHeight = 20.sp,
                fontWeight = FontWeight.Normal,
                fontStyle = FontStyle.Normal
            ),
            footnote = TextStyle(
                fontFamily = NewsAggregatorFontFamilies.graphik,
                fontSize = 13.sp,
                lineHeight = 18.sp,
                fontWeight = FontWeight.Normal,
                fontStyle = FontStyle.Normal
            ),
            caption = TextStyle(
                fontFamily = NewsAggregatorFontFamilies.graphik,
                fontSize = 12.sp,
                lineHeight = 16.sp,
                fontWeight = FontWeight.Normal,
                fontStyle = FontStyle.Normal
            ),
            captionSecondary = TextStyle(
                fontFamily = NewsAggregatorFontFamilies.graphik,
                fontSize = 11.sp,
                lineHeight = 14.sp,
                fontWeight = FontWeight.Normal,
                fontStyle = FontStyle.Normal
            ),
        ),
        titles = NewsAggregatorTitlesTypography(
            xLargeTitle = TextStyle(
                fontFamily = NewsAggregatorFontFamilies.factorA,
                fontSize = 34.sp,
                lineHeight = 40.sp,
                fontWeight = FontWeight.Normal,
                fontStyle = FontStyle.Normal
            ),
            largeTitle = TextStyle(
                fontFamily = NewsAggregatorFontFamilies.factorA,
                fontSize = 28.sp,
                lineHeight = 36.sp,
                fontWeight = FontWeight.Normal,
                fontStyle = FontStyle.Normal
            ),
            mediumTitle = TextStyle(
                fontFamily = NewsAggregatorFontFamilies.factorA,
                fontSize = 22.sp,
                lineHeight = 28.sp,
                fontWeight = FontWeight.Normal,
                fontStyle = FontStyle.Normal
            ),
            smallTitle = TextStyle(
                fontFamily = NewsAggregatorFontFamilies.factorA,
                fontSize = 20.sp,
                lineHeight = 24.sp,
                fontWeight = FontWeight.Normal,
                fontStyle = FontStyle.Normal
            ),
            xSmallTitle = TextStyle(
                fontFamily = NewsAggregatorFontFamilies.factorA,
                fontSize = 17.sp,
                lineHeight = 20.sp,
                fontWeight = FontWeight.Normal,
                fontStyle = FontStyle.Normal
            ),
        ),
        paragraph = NewsAggregatorParagraphTypography(
            paragraph = TextStyle(
                fontFamily = NewsAggregatorFontFamilies.graphik,
                fontSize = 17.sp,
                lineHeight = 28.sp,
                fontWeight = FontWeight.Normal,
                fontStyle = FontStyle.Normal
            )
        )
    )
}