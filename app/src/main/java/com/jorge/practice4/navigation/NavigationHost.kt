package com.jorge.practice4.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavigationHost(
    modifier: Modifier,
    startDestination: String,
    navController: NavHostController
) {

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {

        composable(NavigationRoute.Home.route) {
            Text(text = "Home Screen")
        }

        composable(NavigationRoute.Search.route) {
            Text(text = "Search Screen")
        }

        composable(NavigationRoute.Detail.route) {
            Text(text = "Detail Screen")
        }

    }

}