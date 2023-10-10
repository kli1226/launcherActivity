package com.example.launcheractivity

import android.content.Intent
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import com.example.launcheractivity.databinding.ActivityNorthBinding

class NorthActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNorthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNorthBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}