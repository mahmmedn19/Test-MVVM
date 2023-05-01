package com.example.test.model.Network

import com.example.test.model.data.JokeResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface JokeApiService {
    @GET("joke/Any")
    fun getRandomJoke(): Single<JokeResponse>
}