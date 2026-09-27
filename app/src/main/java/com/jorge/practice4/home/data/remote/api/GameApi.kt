package com.jorge.practice4.home.data.remote.api

import com.jorge.practice4.home.data.remote.dtos.GameDto
import retrofit2.http.GET

interface GameApi {

    @GET("games")
    suspend fun getGames(): List<GameDto>

}