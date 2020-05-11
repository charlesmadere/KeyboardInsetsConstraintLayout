package com.charlesmadere.keyboardlayout

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.WindowInsets
import androidx.constraintlayout.widget.ConstraintLayout

class KeyboardInsetsConstraintLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : ConstraintLayout(context, attrs), View.OnApplyWindowInsetsListener {

    init {
        setOnApplyWindowInsetsListener(this)
    }

    override fun onApplyWindowInsets(v: View, insets: WindowInsets): WindowInsets {
        setPaddingRelative(paddingStart, paddingTop, paddingEnd, insets.systemWindowInsetBottom)
        return insets
    }

}
