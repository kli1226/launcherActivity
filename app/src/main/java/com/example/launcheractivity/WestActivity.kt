package com.example.launcheractivity

import android.content.Intent
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import com.example.launcheractivity.databinding.ActivityWestBinding

class WestActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWestBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }
}