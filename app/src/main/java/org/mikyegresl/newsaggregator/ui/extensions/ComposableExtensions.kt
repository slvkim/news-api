package org.mikyegresl.newsaggregator.ui.extensions

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.core.content.ContextCompat

@Composable
internal fun RowScope.Spacer(width: Dp) =
    androidx.compose.foundation.layout.Spacer(modifier = Modifier.width(width))

@Composable
internal fun ColumnScope.Spacer(height: Dp) =
    androidx.compose.foundation.layout.Spacer(modifier = Modifier.height(height))

@Composable
internal fun LazyItemScope.Spacer(width: Dp) =
    androidx.compose.foundation.layout.Spacer(modifier = Modifier.height(width))

fun Int.drawableResourceToBitmap(context: Context): Bitmap? {
    val drawable = ContextCompat.getDrawable(context ,this) ?: return null
    val bitmap = Bitmap.createBitmap(
        drawable.intrinsicWidth,
        drawable.intrinsicHeight,
        Bitmap.Config.ARGB_8888
    )
    val canvas = Canvas(bitmap)
    drawable.setBounds(0, 0, canvas.width, canvas.height)
    drawable.draw(canvas)
    return bitmap
}