package org.mikyegresl.design_system.colors

import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color

/**
 * Colors for versatile purposes.
 * If there's a Composable with elements, which are neither text, border or background, then they must be colored by this palette.
 * */
@Stable
class NewsAggregatorGraphColors(
    primary: Color,
    secondary: Color,
    tertiary: Color,
    quaternary: Color,
    primaryInverted: Color,
    secondaryInverted: Color,
    tertiaryInverted: Color,
    quaternaryInverted: Color,
    accent: Color,
    link: Color,
    warning: Color,
    success: Color,
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

    var accent by mutableStateOf(accent, structuralEqualityPolicy())
        internal set

    var link by mutableStateOf(link, structuralEqualityPolicy())
        internal set

    var warning by mutableStateOf(warning, structuralEqualityPolicy())
        internal set

    var success by mutableStateOf(success, structuralEqualityPolicy())
        internal set

    var error by mutableStateOf(error, structuralEqualityPolicy())
        internal set

    fun copy(
        primary: Color = this.primary,
        secondary: Color = this.secondary,
        tertiary: Color = this.tertiary,
        quaternary: Color = this.quaternary,
        primaryInverted: Color = this.primaryInverted,
        secondaryInverted: Color = this.secondaryInverted,
        tertiaryInverted: Color = this.tertiaryInverted,
        quaternaryInverted: Color = this.quaternaryInverted,
        accent: Color = this.accent,
        link: Color = this.link,
        warning: Color = this.warning,
        success: Color = this.success,
        error: Color = this.error
    ): NewsAggregatorGraphColors = NewsAggregatorGraphColors(
        primary = primary,
        secondary = secondary,
        tertiary = tertiary,
        quaternary = quaternary,
        primaryInverted = primaryInverted,
        secondaryInverted = secondaryInverted,
        tertiaryInverted = tertiaryInverted,
        quaternaryInverted = quaternaryInverted,
        accent = accent,
        link = link,
        warning = warning,
        success = success,
        error = error
    )

    override fun toString() = buildString {
        appendLine("NewsAggregatorGraphColors(")
        appendLine("\tprimary=$primary")
        appendLine("\tsecondary=$secondary")
        appendLine("\ttertiary=$tertiary")
        appendLine("\tquaternary=$quaternary")
        appendLine("\tprimaryInverted=$primaryInverted")
        appendLine("\tsecondaryInverted=$secondaryInverted")
        appendLine("\ttertiaryInverted=$tertiaryInverted")
        appendLine("\tquaternaryInverted=$quaternaryInverted")
        appendLine("\taccent=$accent")
        appendLine("\tlink=$link")
        appendLine("\twarning=$warning")
        appendLine("\tsuccess=$success")
        appendLine("\terror=$error")
        append(")")
    }
}
