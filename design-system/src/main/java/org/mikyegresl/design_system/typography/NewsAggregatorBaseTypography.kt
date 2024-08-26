package org.mikyegresl.design_system.typography

import androidx.compose.runtime.Stable
import androidx.compose.ui.text.TextStyle

@Stable
data class NewsAggregatorBaseTypography(
    val body: TextStyle,
    val callout: TextStyle,
    val subheadline: TextStyle,
    val footnote: TextStyle,
    val caption: TextStyle,
    val captionSecondary: TextStyle
)
