package com.example.test.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.navigateUp
import com.example.test.R
import com.example.test.databinding.ActivityMainBinding
import com.example.test.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    }


    override fun onResume() {
        super.onResume()
        val nav = findNavController(R.id.fragment_host)
        NavigationUI.setupActionBarWithNavController(this,nav)
    }

    override fun onSupportNavigateUp(): Boolean {
        val nav = findNavController(R.id.fragment_host)
        nav.navigateUp()
        return true
    }
}