package xyz.teamgravity.koinmultiplatformdemo.data.local

import android.content.Context

actual class MyDatabase(
    private val context: Context
) {

    actual fun getText(): String {
        return "Android"
    }
}