package org.mikyegresl.design_system.colors

import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color

/**
 * Decorative muted colors.
 */
@Stable
class NewsAggregatorDecorativeMutedColors(
    pink: Color,
    darkBlue: Color,
    metalGray: Color,
    yellow: Color,
    green: Color,
    red: Color,
    blue: Color,
    indigo: Color,
    purple: Color,
    salmon: Color,
    orange: Color,
    magenta: Color,
    ocean: Color,
    turquoise: Color,
    grass: Color,
    lemon: Color
) {

    var pink by mutableStateOf(pink, structuralEqualityPolicy())
        internal set

    var darkBlue by mutableStateOf(darkBlue, structuralEqualityPolicy())
        internal set

    var metalGray by mutableStateOf(metalGray, structuralEqualityPolicy())
        internal set

    var yellow by mutableStateOf(yellow, structuralEqualityPolicy())
        internal set

    var green by mutableStateOf(green, structuralEqualityPolicy())
        internal set

    var red by mutableStateOf(red, structuralEqualityPolicy())
        internal set

    var blue by mutableStateOf(blue, structuralEqualityPolicy())
        internal set

    var indigo by mutableStateOf(indigo, structuralEqualityPolicy())
        internal set

    var purple by mutableStateOf(purple, structuralEqualityPolicy())
        internal set

    var salmon by mutableStateOf(salmon, structuralEqualityPolicy())
        internal set

    var orange by mutableStateOf(orange, structuralEqualityPolicy())
        internal set

    var magenta by mutableStateOf(magenta, structuralEqualityPolicy())
        internal set

    var ocean by mutableStateOf(ocean, structuralEqualityPolicy())
        internal set

    var turquoise by mutableStateOf(turquoise, structuralEqualityPolicy())
        internal set

    var grass by mutableStateOf(grass, structuralEqualityPolicy())
        internal set
    
    var lemon by mutableStateOf(lemon, structuralEqualityPolicy())
        internal set

    /** Copy this color palette with required modifications. */
    fun copy(
        pink: Color = this.pink,
        darkBlue: Color = this.darkBlue,
        metalGray: Color = this.metalGray,
        yellow: Color = this.yellow,
        green: Color = this.green,
        red: Color = this.red,
        blue: Color = this.blue,
        indigo: Color = this.indigo,
        purple: Color = this.purple,
        salmon: Color = this.salmon,
        orange: Color = this.orange,
        magenta: Color = this.magenta,
        ocean: Color = this.ocean,
        turquoise: Color = this.turquoise,
        grass: Color = this.grass,
        lemon: Color = this.lemon
    ): NewsAggregatorDecorativeMutedColors = NewsAggregatorDecorativeMutedColors(
        pink = pink,
        darkBlue = darkBlue,
        metalGray = metalGray,
        yellow = yellow,
        green = green,
        red = red,
        blue = blue,
        indigo = indigo,
        purple = purple,
        salmon = salmon,
        orange = orange,
        magenta = magenta,
        ocean = ocean,
        turquoise = turquoise,
        grass = grass,
        lemon = lemon
    )

    override fun toString() = buildString {
        appendLine("NewsAggregatorDecorativeMutedColors(")
        appendLine("\tpink=$pink")
        appendLine("\tdarkBlue=$darkBlue")
        appendLine("\tmetalGray=$metalGray")
        appendLine("\tyellow=$yellow")
        appendLine("\tgreen=$green")
        appendLine("\tred=$red")
        appendLine("\tblue=$blue")
        appendLine("\tindigo=$indigo")
        appendLine("\tpurple=$purple")
        appendLine("\tsalmon=$salmon")
        appendLine("\torange=$orange")
        appendLine("\tmagenta=$magenta")
        appendLine("\tocean=$ocean")
        appendLine("\tturquoise=$turquoise")
        appendLine("\tgrass=$grass")
        appendLine("\tlemon=$lemon")
        append(")")
    }
}
