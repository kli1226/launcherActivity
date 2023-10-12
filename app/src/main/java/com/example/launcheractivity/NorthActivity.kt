package com.example.launcheractivity

import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.launcheractivity.databinding.ActivityNorthBinding
import kotlin.math.abs
import kotlin.math.sqrt

class NorthActivity : AppCompatActivity(), SensorEventListener {
    private lateinit var binding: ActivityNorthBinding
    lateinit var sensorManager: SensorManager
    var currentAcceleration = 0f
    var lastAcceleration = 0f


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNorthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sensorManager = getSystemService(SENSOR_SERVICE) as SensorManager
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL)
    }

    override fun onSensorChanged(event: SensorEvent?) {
        if (event == null) return

        val x = event.values[0]
        val y = event.values[1] - 9.8

        val z = event.values[2]
        lastAcceleration = currentAcceleration
        currentAcceleration = sqrt((x * x + y * y + z * z)).toFloat()

        if (abs(currentAcceleration - lastAcceleration) > 5){
            Toast.makeText(this,"Device Shake", Toast.LENGTH_SHORT).show()
            binding.title.text = "Works"
            binding.north.animation = AnimationUtils.loadAnimation(this, R.anim.shake)
        }
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
    }


}
