package com.jorge.practice4.home.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jorge.practice4.home.domain.usecases.GetGamesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getGamesUseCase: GetGamesUseCase
) : ViewModel() {

    var state by mutableStateOf(HomeState())
        private set

    init {

        viewModelScope.launch {

            state = state.copy(games = getGamesUseCase(), isLoading = false)

        }

    }

}