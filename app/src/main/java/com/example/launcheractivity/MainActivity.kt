package com.example.launcheractivity

import android.content.Intent
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import com.example.launcheractivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
//    private var gestureDetector = GestureDetector(this, MySimpleGestureDetectorListener())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
//        binding.homeActivity.setOnTouchListener(touchListener);
    }

//    override fun onTouchEvent(event: MotionEvent): Boolean {
//        return if (gestureDetector.onTouchEvent(event)) {
//            true
//        }
//        else {
//            super.onTouchEvent(event)
//        }
//    }
}
