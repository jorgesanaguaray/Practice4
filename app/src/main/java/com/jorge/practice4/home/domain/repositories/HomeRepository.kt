package com.jorge.practice4.home.domain.repositories

import com.jorge.practice4.home.data.remote.dtos.GameDto

interface HomeRepository {

    suspend fun getGames(): List<GameDto>

}