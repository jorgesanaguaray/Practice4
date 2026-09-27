package com.jorge.practice4.home.domain.usecases

import com.jorge.practice4.home.data.remote.dtos.GameDto
import com.jorge.practice4.home.domain.models.Game
import com.jorge.practice4.home.domain.repositories.HomeRepository

class GetGamesUseCase(
    private val repository: HomeRepository
) {

    suspend operator fun invoke(): List<Game> {
        return repository.getGames().map { mapToGame(it) }
    }

    private fun mapToGame(gameDto: GameDto): Game {

        return Game(
            id = gameDto.id,
            title = gameDto.title,
            thumbnail = gameDto.thumbnail,
            shortDescription = gameDto.short_description,
            gameUrl = gameDto.game_url
        )

    }

}