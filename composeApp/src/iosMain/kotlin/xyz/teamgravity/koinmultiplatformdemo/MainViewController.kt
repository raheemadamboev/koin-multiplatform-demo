package xyz.teamgravity.koinmultiplatformdemo

import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController
import xyz.teamgravity.koinmultiplatformdemo.injection.initializeKoin
import xyz.teamgravity.koinmultiplatformdemo.presentation.navigation.App

fun MainViewController(): UIViewController = ComposeUIViewController(
    configure = {
        initializeKoin()
    }
) {
    App()
}