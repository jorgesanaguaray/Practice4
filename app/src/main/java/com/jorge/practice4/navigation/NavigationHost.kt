package com.jorge.practice4.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.jorge.practice4.detail.presentation.DetailScreen
import com.jorge.practice4.home.presentation.HomeScreen

@Composable
fun NavigationHost(
    modifier: Modifier,
    navController: NavHostController
) {

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = NavigationRoute.Home
    ) {

        composable<NavigationRoute.Home> {

            HomeScreen(
                modifier = Modifier,
                onNavigate = { gameId ->
                    navController.navigate(NavigationRoute.Detail(gameId))
                }
            )

        }

        composable<NavigationRoute.Detail> {
            DetailScreen(modifier = Modifier)
        }

    }

}