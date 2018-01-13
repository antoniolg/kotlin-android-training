package com.antonioleiva.kotlinandroidtraining

import android.content.Context
import android.support.design.widget.Snackbar
import android.view.View
import android.widget.Toast

fun Context.toast(message: String, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, length).show()
}

fun View.snack(message: String, length: Int = Snackbar.LENGTH_SHORT, body: Snackbar.() -> Unit) {
    with(Snackbar.make(this, message, length)) {
        body()
        show()
    }
}