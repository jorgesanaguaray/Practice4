package com.jorge.practice4.navigation

import kotlinx.serialization.Serializable

sealed interface NavigationRoute {

    @Serializable
    data object Home : NavigationRoute

    @Serializable
    data class Detail(val gameId: Int) : NavigationRoute

}