package com.example.launcheractivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GestureDetectorCompat
import com.example.launcheractivity.databinding.ActivityMainBinding
import kotlin.math.abs

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener{
    private lateinit var binding: ActivityMainBinding
    private lateinit var gestureDetector: GestureDetector
    var x2 = 0.0f
    var x1 = 0.0f
    var y2 = 0.0f
    var y1 = 0.0f

    companion object {
        const val MIN_DISTANCE = 150
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        gestureDetector = GestureDetector(this, this)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        if (event != null) {
            gestureDetector.onTouchEvent(event)
        }
        when(event?.action){
//            Start swipe
            0 ->{
                x1 = event.x
                y1 = event.y
            }
//            End swipe
            1 -> {
                x2 = event.x
                y2 = event.y
                val valueX: Float = x2 - x1
                val valueY: Float = y2 - y1
                if (abs(valueX) > MIN_DISTANCE) {
                    // Detect left to right swipe
                    if (x2 > x1) {
                        Toast.makeText(this, "Right swipe", Toast.LENGTH_SHORT).show()
                    } else {
                        // Detect right to left swipe
                        Toast.makeText(this, "Left swipe", Toast.LENGTH_SHORT).show()
                    }
                } else if (abs(valueY) > MIN_DISTANCE) {
                    // Detect top to bottom swipe
                    if (y2 > y1) {
                        Toast.makeText(this, "Bottom swipe", Toast.LENGTH_SHORT).show()
                    } else {
                        // Detect bottom to top swipe
                        Toast.makeText(this, "Top swipe", Toast.LENGTH_SHORT).show()
                    }
                }
            }


        }
        return super.onTouchEvent(event)
    }

    override fun onDown(p0: MotionEvent): Boolean {
//        TODO("Not yet implemented")
        return false
    }

    override fun onShowPress(p0: MotionEvent) {
//        TODO("Not yet implemented")
    }

    override fun onSingleTapUp(p0: MotionEvent): Boolean {
//        TODO("Not yet implemented")
        return false
    }

    override fun onScroll(p0: MotionEvent, p1: MotionEvent, p2: Float, p3: Float): Boolean {
//        TODO("Not yet implemented")
        return false
    }

    override fun onLongPress(p0: MotionEvent) {
//        TODO("Not yet implemented")
    }

    override fun onFling(p0: MotionEvent, p1: MotionEvent, p2: Float, p3: Float): Boolean {
//        TODO("Not yet implemented")
        return false
    }


}
