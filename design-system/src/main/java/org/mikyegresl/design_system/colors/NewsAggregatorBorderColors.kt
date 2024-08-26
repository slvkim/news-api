package org.mikyegorg.mikyegresl.design_system.typographyl.design_system.colors

import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color

/**
 * Border colors.
 * If there's a Composable with border, then it must be colored by this palette.
 * */
@Stable
class NewsAggregatorBorderColors(
    primary: Color,
    secondary: Color,
    tertiary: Color,
    quaternary: Color,
    primaryInverted: Color,
    secondaryInverted: Color,
    tertiaryInverted: Color,
    quaternaryInverted: Color,
    blackAccent: Color,
    accent: Color,
    link: Color,
    error: Color
) {

    var primary by mutableStateOf(primary, structuralEqualityPolicy())
        internal set

    var secondary by mutableStateOf(secondary, structuralEqualityPolicy())
        internal set

    var tertiary by mutableStateOf(tertiary, structuralEqualityPolicy())
        internal set

    var quaternary by mutableStateOf(quaternary, structuralEqualityPolicy())
        internal set

    var primaryInverted by mutableStateOf(primaryInverted, structuralEqualityPolicy())
        internal set

    var secondaryInverted by mutableStateOf(secondaryInverted, structuralEqualityPolicy())
        internal set

    var tertiaryInverted by mutableStateOf(tertiaryInverted, structuralEqualityPolicy())
        internal set

    var quaternaryInverted by mutableStateOf(quaternaryInverted, structuralEqualityPolicy())
        internal set

    var blackAccent by mutableStateOf(blackAccent, structuralEqualityPolicy())
        internal set

    var accent by mutableStateOf(accent, structuralEqualityPolicy())
        internal set

    var link by mutableStateOf(link, structuralEqualityPolicy())
        internal set

    var error by mutableStateOf(error, structuralEqualityPolicy())
        internal set

    /** Copy this color palette with required modifications. */
    fun copy(
        primary: Color = this.primary,
        secondary: Color = this.secondary,
        tertiary: Color = this.tertiary,
        quaternary: Color = this.quaternary,
        primaryInverted: Color = this.primaryInverted,
        secondaryInverted: Color = this.secondaryInverted,
        tertiaryInverted: Color = this.tertiaryInverted,
        quaternaryInverted: Color = this.quaternaryInverted,
        blackAccent: Color = this.blackAccent,
        accent: Color = this.accent,
        link: Color = this.link,
        error: Color = this.error
    ): NewsAggregatorBorderColors = NewsAggregatorBorderColors(
        primary = primary,
        secondary = secondary,
        tertiary = tertiary,
        quaternary = quaternary,
        primaryInverted = primaryInverted,
        secondaryInverted = secondaryInverted,
        tertiaryInverted = tertiaryInverted,
        quaternaryInverted = quaternaryInverted,
        blackAccent = blackAccent,
        accent = accent,
        link = link,
        error = error
    )

    override fun toString() = buildString {
        appendLine("NewsAggregatorBorderColors(")
        appendLine("\tprimary=$primary")
        appendLine("\tsecondary=$secondary")
        appendLine("\ttertiary=$tertiary")
        appendLine("\tquaternary=$quaternary")
        appendLine("\tprimaryInverted=$primaryInverted")
        appendLine("\tsecondaryInverted=$secondaryInverted")
        appendLine("\ttertiaryInverted=$tertiaryInverted")
        appendLine("\tquaternaryInverted=$quaternaryInverted")
        appendLine("\tblackAccent=$blackAccent")
        appendLine("\taccent=$accent")
        appendLine("\tlink=$link")
        appendLine("\terror=$error")
        append(")")
    }
}
