package com.example.gymenc.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.gymenc.screens.DetailsScreen
import com.example.gymenc.screens.HomeScreen


@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController,
    startDestination = Screens.HomeScreen.name) {

        composable(Screens.HomeScreen.name) {
            HomeScreen(navController = navController)
        }

        composable(Screens.DetailsScreen.name + "/{choice}",
        arguments = listOf(navArgument(name = "choice") {

            type = NavType.StringType

        })) { backStackEntry ->
            DetailsScreen(navController = navController,
            backStackEntry.arguments?.getString("choice"))
        }
    }
}