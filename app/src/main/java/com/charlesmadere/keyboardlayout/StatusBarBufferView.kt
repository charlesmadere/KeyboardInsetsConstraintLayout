package com.charlesmadere.keyboardlayout

import android.content.Context
import android.util.AttributeSet
import android.view.View

class StatusBarBufferView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : View(context, attrs) {

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val resId = resources.getIdentifier("status_bar_height", "dimen", "android")
        val statusBarHeight = resources.getDimensionPixelSize(resId)
        setMeasuredDimension(widthMeasureSpec, MeasureSpec.makeMeasureSpec(statusBarHeight, MeasureSpec.EXACTLY))
    }

}
