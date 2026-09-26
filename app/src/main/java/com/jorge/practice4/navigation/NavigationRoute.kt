package com.jorge.practice4.navigation

sealed class NavigationRoute(val route: String) {

    data object Home : NavigationRoute("home")
    data object Search : NavigationRoute("search")
    data object Detail : NavigationRoute("detail")

}