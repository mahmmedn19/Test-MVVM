package com.example.test.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.test.model.data.JokeResponse
import com.example.test.model.Repository.JokeRepository
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

class MainViewModel : ViewModel() {


    private val jokeRepository = JokeRepository()
    private val _joke = MutableLiveData<JokeResponse>()
    val joke: LiveData<JokeResponse>
        get() = _joke

    init {
        getRandomJoke()
    }

    fun getRandomJoke() {
        jokeRepository.getRandomJoke()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(::onRandomJoke, ::onError)
    }

    private fun onRandomJoke(jokeResponse: JokeResponse?) {
        _joke.postValue(jokeResponse)
    }

    private fun onError(e: Throwable) {
        Log.e(TAG, "Error fetching joke")
    }

    companion object {
        private const val TAG = "JokeViewModel"
    }
}