package com.example.test.model.Repository

import com.example.test.model.JokeResponse
import com.example.test.model.Network.Api
import io.reactivex.rxjava3.core.Single

class JokeRepository {

    private val jokeApiService = Api.create()

    fun getRandomJoke(): Single<JokeResponse> {
        return jokeApiService.getRandomJoke()
    }
}
