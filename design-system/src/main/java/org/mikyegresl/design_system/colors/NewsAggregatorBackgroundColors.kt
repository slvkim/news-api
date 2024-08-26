package org.mikyegresl.design_system.colors

import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color

/**
 * Background colors.
 * If there's a Composable, then it's background must be colored by this palette.
 */
@Stable
class NewsAggregatorBackgroundColors(
    primary: Color,
    secondary: Color,
    tertiary: Color,
    quaternary: Color,
    accent: Color,
    accentMuted: Color,
    infoMuted: Color,
    positiveMuted: Color,
    attentionMuted: Color,
    primaryInverted: Color,
    secondaryInverted: Color,
    tertiaryInverted: Color,
    quaternaryInverted: Color,
    overlayBlack: Color
) {

    var primary by mutableStateOf(primary, structuralEqualityPolicy())
        internal set

    var secondary by mutableStateOf(secondary, structuralEqualityPolicy())
        internal set

    var tertiary by mutableStateOf(tertiary, structuralEqualityPolicy())
        internal set

    var quaternary by mutableStateOf(quaternary, structuralEqualityPolicy())
        internal set

    var accent by mutableStateOf(accent, structuralEqualityPolicy())
        internal set

    var accentMuted by mutableStateOf(accentMuted, structuralEqualityPolicy())
        internal set

    var infoMuted by mutableStateOf(infoMuted, structuralEqualityPolicy())
        internal set

    var positiveMuted by mutableStateOf(positiveMuted, structuralEqualityPolicy())
        internal set

    var attentionMuted by mutableStateOf(attentionMuted, structuralEqualityPolicy())
        internal set

    var primaryInverted by mutableStateOf(primaryInverted, structuralEqualityPolicy())
        internal set

    var secondaryInverted by mutableStateOf(secondaryInverted, structuralEqualityPolicy())
        internal set

    var tertiaryInverted by mutableStateOf(tertiaryInverted, structuralEqualityPolicy())
        internal set

    var quaternaryInverted by mutableStateOf(quaternaryInverted, structuralEqualityPolicy())
        internal set

    var overlayBlack by mutableStateOf(overlayBlack, structuralEqualityPolicy())
        internal set

    fun copy(
        primary: Color = this.primary,
        secondary: Color = this.secondary,
        tertiary: Color = this.tertiary,
        quaternary: Color = this.quaternary,
        accent: Color = this.accent,
        accentMuted: Color = this.accentMuted,
        infoMuted: Color = this.infoMuted,
        positiveMuted: Color = this.positiveMuted,
        attentionMuted: Color = this.attentionMuted,
        primaryInverted: Color = this.primaryInverted,
        secondaryInverted: Color = this.secondaryInverted,
        tertiaryInverted: Color = this.tertiaryInverted,
        quaternaryInverted: Color = this.quaternaryInverted,
        overlayBlack: Color = this.overlayBlack
    ): NewsAggregatorBackgroundColors = NewsAggregatorBackgroundColors(
        primary = primary,
        secondary = secondary,
        tertiary = tertiary,
        quaternary = quaternary,
        accent = accent,
        accentMuted = accentMuted,
        infoMuted = infoMuted,
        positiveMuted = positiveMuted,
        attentionMuted = attentionMuted,
        primaryInverted = primaryInverted,
        secondaryInverted = secondaryInverted,
        tertiaryInverted = tertiaryInverted,
        quaternaryInverted = quaternaryInverted,
        overlayBlack = overlayBlack
    )

    override fun toString() = buildString {
        appendLine("NewsAggregatorColors(")
        appendLine("\tprimary=$primary")
        appendLine("\tsecondary=$secondary")
        appendLine("\ttertiary=$tertiary")
        appendLine("\tquaternary=$quaternary")
        appendLine("\taccent=$accent")
        appendLine("\taccentMuted=$accentMuted")
        appendLine("\tinfoMuted=$infoMuted")
        appendLine("\tpositiveMuted=$positiveMuted")
        appendLine("\tattentionMuted=$attentionMuted")
        appendLine("\tprimaryInverted=$primaryInverted")
        appendLine("\tsecondaryInverted=$secondaryInverted")
        appendLine("\ttertiaryInverted=$tertiaryInverted")
        appendLine("\tquaternaryInverted=$quaternaryInverted")
        appendLine("\toverlayBlack=$overlayBlack")
        append(")")
    }
}
