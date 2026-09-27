package com.jorge.practice4.home.data.repositories

import com.jorge.practice4.home.data.remote.api.GameApi
import com.jorge.practice4.home.data.remote.dtos.GameDto
import com.jorge.practice4.home.domain.repositories.HomeRepository

class HomeRepositoryImpl(
    private val api: GameApi
) : HomeRepository {

    override suspend fun getGames(): List<GameDto> {
        return api.getGames()
    }

}