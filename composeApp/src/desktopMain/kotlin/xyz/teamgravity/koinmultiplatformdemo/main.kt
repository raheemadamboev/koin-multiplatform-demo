package xyz.teamgravity.koinmultiplatformdemo

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import xyz.teamgravity.koinmultiplatformdemo.injection.initializeKoin
import xyz.teamgravity.koinmultiplatformdemo.presentation.navigation.App

fun main() {
    initializeKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "KoinMultiplatformDemo",
        ) {
            App()
        }
    }
}