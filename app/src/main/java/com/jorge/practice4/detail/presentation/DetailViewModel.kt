package com.jorge.practice4.detail.presentation

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.navigation.toRoute
import com.jorge.practice4.navigation.NavigationRoute
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val route = savedStateHandle.toRoute<NavigationRoute.Detail>()

    val gameId = route.gameId

}