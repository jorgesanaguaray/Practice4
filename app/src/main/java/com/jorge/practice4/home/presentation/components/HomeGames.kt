package com.jorge.practice4.home.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.jorge.practice4.home.domain.models.Game
import com.jorge.practice4.home.presentation.HomeState

@Composable
fun HomeGames(
    modifier: Modifier = Modifier,
    state: HomeState,
    onNavigate: (Int) -> Unit
) {

    LazyColumn(modifier = modifier.fillMaxSize()) {

        items(state.games.size) { i ->

            val game = state.games[i]

            GameItem(
                modifier = modifier,
                game = game,
                onNavigate = onNavigate
            )

        }

    }

}

@Composable
fun GameItem(
    modifier: Modifier = Modifier,
    game: Game,
    onNavigate: (Int) -> Unit
) {

    Card(
        modifier = modifier
            .clickable(onClick = { onNavigate(game.id) } )
            .padding(8.dp),
        border = BorderStroke(0.5.dp, Color.Gray)
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = game.title,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.titleLarge,
                fontFamily = FontFamily.Default,
                modifier = Modifier.padding(8.dp)
            )
            AsyncImage(
                model = game.thumbnail,
                contentDescription = game.title,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            Text(text = game.shortDescription, modifier = Modifier.padding(8.dp))
        }

    }
    
}