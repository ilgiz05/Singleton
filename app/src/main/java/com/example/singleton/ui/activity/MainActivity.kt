package com.example.singleton.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.singleton.R
import com.example.singleton.databinding.ActivityMainBinding
import com.example.singleton.singleton.PatternSingleton

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        binding.text.text = PatternSingleton.getData()

    }
}