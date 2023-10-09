package com.example.launcheractivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GestureDetectorCompat
import com.example.launcheractivity.databinding.ActivityMainBinding
import kotlin.math.abs

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var gestureDetector = GestureDetectorCompat(this, DirectionGestureListener())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }

    // Listening for the users tapping on the screen
    override fun onTouchEvent(event: MotionEvent): Boolean {
        // Meaning that the event was handled
        return if(gestureDetector.onTouchEvent(event)){
            true
        }
        else{
            super.onTouchEvent(event)}
    }
    inner class DirectionGestureListener : GestureDetector.SimpleOnGestureListener(){

        // This determines if it is an accidental tap or a swipe
        private val THRESHOLD = 100
        // This determines how fast the user is swiping
        private val VELOCITY_THRESHOLD = 100
        override fun onFling(
            downEvent: MotionEvent,
            moveEvent: MotionEvent,
            velocityX: Float,
            velocityY: Float
        ): Boolean {
            val diffX = moveEvent.x.minus(downEvent.x) ?: 0.0F
            val diffY = moveEvent.y.minus(downEvent.y) ?: 0.0F

            // Either left or right swipe
            return if(abs(diffX) > abs(diffY)){
                if(abs(diffX) > THRESHOLD && abs(velocityX) > VELOCITY_THRESHOLD){
                    // It's a RIGHT SWIPE if the difference is a positive number
                    if(diffX > 0){
                        this@MainActivity.onSwipeRight()
                    }
                    // It's a LEFT SWIPE if the difference is a negative number
                    else{
                        this@MainActivity.onSwipeLeft()
                    }
                    true
                }
                else{
                    super.onFling(downEvent, moveEvent, velocityX, velocityY)
                }
            }
            // Either up or down swipe
            else{
                if(abs(diffY) > THRESHOLD && abs(velocityY) > VELOCITY_THRESHOLD){
                    // It's a TOP SWIPE if the difference is a positive number
                    if(diffY > 0){
                        this@MainActivity.onSwipeTop()
                    }
                    // It's a BOTTOM SWIPE if the difference is a negative number
                    else{
                        this@MainActivity.onSwipeBottom()
                    }
                    true
                }
                else{
                    super.onFling(downEvent, moveEvent, velocityX, velocityY)
                }
            }
        }
    }

    private fun onSwipeBottom() {
        Toast.makeText(this, "Bottom Swipe", Toast.LENGTH_LONG).show()
    }

    private fun onSwipeTop() {
        Toast.makeText(this, "Top Swipe", Toast.LENGTH_LONG).show()
    }

    private fun onSwipeLeft() {
        Toast.makeText(this, "Left Swipe", Toast.LENGTH_LONG).show()
    }

    private fun onSwipeRight() {
        Toast.makeText(this, "Right Swipe", Toast.LENGTH_LONG).show()
    }
}
