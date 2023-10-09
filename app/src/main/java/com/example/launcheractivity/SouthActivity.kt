package com.example.launcheractivity

import android.content.Intent
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import com.example.launcheractivity.databinding.ActivitySouthBinding

class SouthActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySouthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySouthBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }
}