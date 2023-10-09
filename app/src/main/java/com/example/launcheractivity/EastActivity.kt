package com.example.launcheractivity

import android.content.Intent
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import com.example.launcheractivity.databinding.ActivityEastBinding

class EastActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEastBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEastBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
//        binding.homeActivity.setOnTouchListener(touchListener);
    }
}