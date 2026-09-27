package com.jorge.practice4.detail.presentation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel

@Composable
fun DetailScreen(
    modifier: Modifier = Modifier,
    viewModel: DetailViewModel = hiltViewModel()
) {

    Text(
        text = "ID del juego: ${viewModel.gameId}",
        modifier = modifier
    )

}