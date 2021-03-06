package com.pawegio.kandroid

import android.view.View

/**
 * @author pawegio
 */
[suppress("UNCHECKED_CAST")]
public fun View.findView<T : View>(id: Int): T = findViewById(id) as T