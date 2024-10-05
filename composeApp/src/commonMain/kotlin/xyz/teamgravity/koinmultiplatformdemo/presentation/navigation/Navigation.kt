package xyz.teamgravity.koinmultiplatformdemo.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import xyz.teamgravity.koinmultiplatformdemo.presentation.screen.MainScreen

@Composable
fun Navigation() {
    NavHost(
        navController = rememberNavController(),
        startDestination = "main"
    ) {
        composable("main") {
            MainScreen()
        }
    }
}