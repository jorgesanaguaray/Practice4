package com.jorge.practice4.home.presentation

import com.jorge.practice4.home.domain.models.Game

data class HomeState(

    val games: List<Game> = emptyList(),
    val isLoading: Boolean = true

)