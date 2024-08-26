package org.mikyegresl.design_system

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import org.mikyegresl.design_system.colors.LocalNewsAggregatorColors
import org.mikyegresl.design_system.colors.NewsAggregatorColors
import org.mikyegresl.design_system.typography.LocalNewsAggregatorTypography
import org.mikyegresl.design_system.typography.NewsAggregatorTypography

/** Instruments, used for theming. Works similarly to [MaterialTheme].* */
object NewsAggregatorTheme {

    val colors: NewsAggregatorColors
        @Composable
        @ReadOnlyComposable
        get() = LocalNewsAggregatorColors.current

    val typography: NewsAggregatorTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalNewsAggregatorTypography.current

}

@Composable
fun NewsAggregatorTheme(
    colors: NewsAggregatorColors = NewsAggregatorTheme.colors,
    typography: NewsAggregatorTypography = NewsAggregatorTheme.typography,
    content: @Composable () -> Unit
) {
    val rememberedColors = remember {
        colors.copy()
    }
    CompositionLocalProvider(
        LocalNewsAggregatorColors provides rememberedColors,
        LocalNewsAggregatorTypography provides typography
    ) {
        MaterialTheme {
            content()
        }
    }
}