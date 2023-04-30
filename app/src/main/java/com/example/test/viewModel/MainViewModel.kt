package com.example.test.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.test.model.Counter

class MainViewModel : ViewModel() {

    private val _counter = MutableLiveData<Counter>()
    val counter: LiveData<Counter> = _counter

    /*private var count = 0

    fun incrementCounter(){
        count++
    }

    fun getCounter() :LiveData<Counter>{
        return MutableLiveData(Counter(count))
    }*/
    init {
        _counter.value = Counter(0)
    }

    fun incrementCounter() {
        val currentCount = _counter.value?.count ?: 0
        _counter.postValue(Counter(currentCount + 1))
    }

}