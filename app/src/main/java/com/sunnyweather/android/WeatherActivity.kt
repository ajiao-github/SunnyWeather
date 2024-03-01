package com.sunnyweather.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sunnyweather.android.databinding.ActivityMainBinding
import com.sunnyweather.android.databinding.ActivityWeatherBinding

class WeatherActivity : AppCompatActivity() {
    lateinit var bind: ActivityWeatherBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bind = ActivityWeatherBinding.inflate(layoutInflater)
        setContentView(bind.root)
    }
}