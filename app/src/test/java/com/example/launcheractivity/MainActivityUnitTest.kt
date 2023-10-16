package com.example.launcheractivity

import android.view.MotionEvent
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MainActivityUnitTest {


    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun checkXValues(){
        var x1 = 0.0f
        var x2 = 10f
        var xValue = x2 - x1
        assertEquals(xValue, 10f)
    }
    @Test
    fun checkYValues(){
        var y1 = 0.0f
        var y2 = 5f
        var yValue = y2 - y1
        assertEquals(yValue, 5f)
    }
}