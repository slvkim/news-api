package org.mikyegresl.design_system.utils

import android.content.res.Resources
import android.util.TypedValue

/** Convert sp.value to px representation. */
fun spToPx(value: Float, resources: Resources) =
    TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_SP,
        value,
        resources.displayMetrics
    ).toInt()
