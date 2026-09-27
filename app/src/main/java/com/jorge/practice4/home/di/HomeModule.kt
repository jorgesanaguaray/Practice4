package com.jorge.practice4.home.di

import com.jorge.practice4.home.data.remote.api.GameApi
import com.jorge.practice4.home.data.repositories.HomeRepositoryImpl
import com.jorge.practice4.home.domain.repositories.HomeRepository
import com.jorge.practice4.home.domain.usecases.GetGamesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object HomeModule {

    @Provides
    @Singleton
    fun provideGameApi(): GameApi {
        return Retrofit.Builder()
            .baseUrl("https://www.freetogame.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(GameApi::class.java)
    }

    @Provides
    @Singleton
    fun provideHomeRepository(api: GameApi): HomeRepository {
        return HomeRepositoryImpl(api)
    }

    @Provides
    @Singleton
    fun provideGetGamesUseCase(repository: HomeRepository): GetGamesUseCase {
        return GetGamesUseCase(repository)
    }

}