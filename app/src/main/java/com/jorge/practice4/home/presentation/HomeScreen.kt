package com.jorge.practice4.home.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import com.jorge.practice4.home.presentation.components.HomeGames

@Composable
fun HomeScreen(
    modifier: Modifier,
    viewModel: HomeViewModel = hiltViewModel(),
    onNavigate: (Int) -> Unit
) {

    val state = viewModel.state

    if (state.isLoading) {

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CircularProgressIndicator()
        }

    } else {

        HomeGames(
            modifier = modifier,
            state = state,
            onNavigate = onNavigate
        )

    }

}