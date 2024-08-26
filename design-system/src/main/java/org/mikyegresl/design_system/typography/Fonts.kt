package org.mikyegresl.design_system.typography

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import org.mikyegresl.design_system.R

/** Main font families, used by [NewsAggregatorTheme]. */
object NewsAggregatorFontFamilies {

    /** Graphik LC font family. */
    val graphik = FontFamily(
        Font(R.font.graphik_black, weight = FontWeight.Black, style = FontStyle.Normal),
        Font(R.font.graphik_black_italic, weight = FontWeight.Black, style = FontStyle.Italic),
        Font(R.font.graphik_bold, weight = FontWeight.Bold, style = FontStyle.Normal),
        Font(R.font.graphik_bold_italic, weight = FontWeight.Bold, style = FontStyle.Italic),
        Font(R.font.graphik_extralight, weight = FontWeight.ExtraLight, style = FontStyle.Normal),
        Font(R.font.graphik_light, weight = FontWeight.Light, style = FontStyle.Normal),
        Font(R.font.graphik_light_italic, weight = FontWeight.Light, style = FontStyle.Italic),
        Font(R.font.graphik_medium, weight = FontWeight.Medium, style = FontStyle.Normal),
        Font(R.font.graphik_medium_italic, weight = FontWeight.Medium, style = FontStyle.Italic),
        Font(R.font.graphik_regular, weight = FontWeight.Normal, style = FontStyle.Normal),
        Font(R.font.graphik_regular_italic, weight = FontWeight.Normal, style = FontStyle.Italic),
        Font(R.font.graphik_semibold, weight = FontWeight.SemiBold, style = FontStyle.Normal),
        Font(R.font.graphik_semibold_italic, weight = FontWeight.SemiBold, style = FontStyle.Italic),
        Font(R.font.graphik_super, weight = FontWeight.ExtraBold, style = FontStyle.Normal),
        Font(R.font.graphik_super_italic, weight = FontWeight.ExtraBold, style = FontStyle.Italic),
        Font(R.font.graphik_thin, weight = FontWeight.Thin, style = FontStyle.Normal),
        Font(R.font.graphik_thin_italic, weight = FontWeight.Thin, style = FontStyle.Italic),
    )

    /** Factor A font family. */
    val factorA = FontFamily(
        Font(R.font.factor_a_black, weight = FontWeight.Black, style = FontStyle.Normal),
        Font(R.font.factor_a_black_italic, weight = FontWeight.Black, style = FontStyle.Italic),
        Font(R.font.factor_a_bold, weight = FontWeight.Bold, style = FontStyle.Normal),
        Font(R.font.factor_a_bold_italic, weight = FontWeight.Bold, style = FontStyle.Italic),
        Font(R.font.factor_a_extrabold, weight = FontWeight.ExtraBold, style = FontStyle.Normal),
        Font(R.font.factor_a_extrabold_italic, weight = FontWeight.ExtraBold, style = FontStyle.Italic),
        Font(R.font.factor_a_light, weight = FontWeight.Light, style = FontStyle.Normal),
        Font(R.font.factor_a_light_italic, weight = FontWeight.Light, style = FontStyle.Italic),
        Font(R.font.factor_a_medium, weight = FontWeight.Medium, style = FontStyle.Normal),
        Font(R.font.factor_a_medium_italic, weight = FontWeight.Medium, style = FontStyle.Italic),
        Font(R.font.factor_a_regular, weight = FontWeight.Normal, style = FontStyle.Normal),
        Font(R.font.factor_a_regular_italic, weight = FontWeight.Normal, style = FontStyle.Italic),
    )
}
