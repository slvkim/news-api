package org.mikyegresl.design_system.colors

import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import org.mikyegorg.mikyegresl.design_system.typographyl.design_system.colors.NewsAggregatorBorderColors

/**
 * Color palettes.
 **
 * @see NewsAggregatorTextColors
 * @see NewsAggregatorBackgroundColors
 * @see NewsAggregatorBorderColors
 * @see NewsAggregatorGraphColors
 * */
@Stable
data class NewsAggregatorColors(
    val text: NewsAggregatorTextColors,
    val background: NewsAggregatorBackgroundColors,
    val border: NewsAggregatorBorderColors,
    val graph: NewsAggregatorGraphColors,
    val decorativeText: NewsAggregatorDecorativeTextColors,
    val decorative: NewsAggregatorDecorativeColors,
    val decorativeMuted: NewsAggregatorDecorativeMutedColors,
    val decorativeMutedAlt: NewsAggregatorDecorativeMutedAltColors
)

/** Create color palette from defaults or by specified parameters. */
fun colors(
    text: NewsAggregatorTextColors = NewsAggregatorTextColors(
        primary = GlobalColors.Gray1000,
        secondary = GlobalColors.Gray600,
        tertiary = GlobalColors.Gray400,
        quaternary = GlobalColors.Gray200,
        primaryInverted = GlobalColors.Gray0,
        secondaryInverted = GlobalColors.WhiteAlpha60,
        tertiaryInverted = GlobalColors.WhiteAlpha40,
        quaternaryInverted = GlobalColors.WhiteAlpha30,
        accent = GlobalColors.Pink500,
        link = GlobalColors.DarkBlue400,
        warning = GlobalColors.Yellow600,
        success = GlobalColors.Green700,
        error = GlobalColors.Red600
    ),
    background: NewsAggregatorBackgroundColors = NewsAggregatorBackgroundColors(
        primary = GlobalColors.Gray0,
        secondary = GlobalColors.Gray50,
        tertiary = GlobalColors.Gray100,
        quaternary = GlobalColors.Gray200,
        accent = GlobalColors.Pink500,
        accentMuted = GlobalColors.Pink200,
        infoMuted = GlobalColors.Blue100,
        positiveMuted = GlobalColors.Green200,
        attentionMuted = GlobalColors.Yellow200,
        primaryInverted = GlobalColors.Gray1000,
        secondaryInverted = GlobalColors.Gray900,
        tertiaryInverted = GlobalColors.Gray800,
        quaternaryInverted = GlobalColors.Gray700,
        overlayBlack = GlobalColors.BlackAlpha80
    ),
    border: NewsAggregatorBorderColors = NewsAggregatorBorderColors(
        primary = GlobalColors.Gray400,
        secondary = GlobalColors.Gray300,
        tertiary = GlobalColors.Gray200,
        quaternary = GlobalColors.Gray100,
        primaryInverted = GlobalColors.Gray600,
        secondaryInverted = GlobalColors.Gray700,
        tertiaryInverted = GlobalColors.Gray800,
        quaternaryInverted = GlobalColors.Gray900,
        blackAccent = GlobalColors.Gray1000,
        accent = GlobalColors.Pink500,
        link = GlobalColors.DarkBlue500,
        error = GlobalColors.Red500
    ),
    graph: NewsAggregatorGraphColors = NewsAggregatorGraphColors(
        primary = GlobalColors.Gray1000,
        secondary = GlobalColors.Gray600,
        tertiary = GlobalColors.Gray400,
        quaternary = GlobalColors.Gray200,
        primaryInverted = GlobalColors.Gray0,
        secondaryInverted = GlobalColors.WhiteAlpha60,
        tertiaryInverted = GlobalColors.WhiteAlpha40,
        quaternaryInverted = GlobalColors.WhiteAlpha30,
        accent = GlobalColors.Pink500,
        link = GlobalColors.DarkBlue500,
        warning = GlobalColors.Yellow400,
        success = GlobalColors.Green500,
        error = GlobalColors.Red500
    ),
    decorativeText: NewsAggregatorDecorativeTextColors = NewsAggregatorDecorativeTextColors(
        pink = GlobalColors.Pink700,
        darkBlue = GlobalColors.DarkBlue700,
        metalGray = GlobalColors.MetalGray800,
        yellow = GlobalColors.Yellow800,
        green = GlobalColors.Green800,
        red = GlobalColors.Red700,
        blue = GlobalColors.Blue700,
        indigo = GlobalColors.Indigo700,
        purple = GlobalColors.Purple700,
        salmon = GlobalColors.Salmon800,
        orange = GlobalColors.Orange800,
        magenta = GlobalColors.Magenta700,
        ocean = GlobalColors.Ocean800,
        turquoise = GlobalColors.Turquoise800,
        grass = GlobalColors.Grass800,
        lemon = GlobalColors.Lemon800,
    ),
    decorative: NewsAggregatorDecorativeColors = NewsAggregatorDecorativeColors(
        pink = GlobalColors.Pink500,
        darkBlue = GlobalColors.DarkBlue500,
        metalGray = GlobalColors.MetalGray500,
        yellow = GlobalColors.Yellow500,
        green = GlobalColors.Green500,
        red = GlobalColors.Red600,
        blue = GlobalColors.Blue500,
        indigo = GlobalColors.Indigo400,
        purple = GlobalColors.Purple400,
        salmon = GlobalColors.Salmon500,
        orange = GlobalColors.Orange500,
        magenta = GlobalColors.Magenta400,
        ocean = GlobalColors.Ocean400,
        turquoise = GlobalColors.Turquoise400,
        grass = GlobalColors.Grass500,
        lemon = GlobalColors.Lemon500,
    ),
    decorativeMuted: NewsAggregatorDecorativeMutedColors = NewsAggregatorDecorativeMutedColors(
        pink = GlobalColors.Pink100,
        darkBlue = GlobalColors.DarkBlue50,
        metalGray = GlobalColors.MetalGray100,
        yellow = GlobalColors.Yellow100,
        green = GlobalColors.Green200,
        red = GlobalColors.Red200,
        blue = GlobalColors.Blue100,
        indigo = GlobalColors.Indigo50,
        purple = GlobalColors.Purple50,
        salmon = GlobalColors.Salmon100,
        orange = GlobalColors.Orange100,
        magenta = GlobalColors.Magenta100,
        ocean = GlobalColors.Ocean100,
        turquoise = GlobalColors.Turquoise100,
        grass = GlobalColors.Grass100,
        lemon = GlobalColors.Lemon100,
    ),
    decorativeMutedAlt: NewsAggregatorDecorativeMutedAltColors = NewsAggregatorDecorativeMutedAltColors(
        pink = GlobalColors.Pink200,
        darkBlue = GlobalColors.DarkBlue100,
        metalGray = GlobalColors.MetalGray200,
        yellow = GlobalColors.Yellow200,
        green = GlobalColors.Green300,
        red = GlobalColors.Red300,
        blue = GlobalColors.Blue200,
        indigo = GlobalColors.Indigo100,
        purple = GlobalColors.Purple100,
        salmon = GlobalColors.Salmon200,
        orange = GlobalColors.Orange200,
        magenta = GlobalColors.Magenta200,
        ocean = GlobalColors.Ocean200,
        turquoise = GlobalColors.Turquoise200,
        grass = GlobalColors.Grass200,
        lemon = GlobalColors.Lemon200,
    )
): NewsAggregatorColors = NewsAggregatorColors(
    text = text,
    background = background,
    border = border,
    graph = graph,
    decorativeText = decorativeText,
    decorative = decorative,
    decorativeMuted = decorativeMuted,
    decorativeMutedAlt = decorativeMutedAlt
)

internal val LocalNewsAggregatorColors = staticCompositionLocalOf {
    colors()
}
