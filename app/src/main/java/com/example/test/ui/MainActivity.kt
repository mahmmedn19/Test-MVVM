package com.example.test.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.test.R
import com.example.test.databinding.ActivityMainBinding
import com.example.test.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {
     lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = mainViewModel
        binding.lifecycleOwner = this

/*
        mainViewModel.counter.observe(this) {
            binding.textViewCount.text = it.count.toString()
        }
*/

        binding.buttonCount.setOnClickListener {
            mainViewModel.incrementCounter()
        }

    }
}