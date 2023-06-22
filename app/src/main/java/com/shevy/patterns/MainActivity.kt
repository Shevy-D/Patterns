package com.shevy.patterns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weatherStation = WeatherStation()
        weatherStation.addMan(Man(name = "Alex", surname = "Gladkov"))
        weatherStation.addMan(Man(name = "Ivan", surname = "Ivanov"))
        weatherStation.addMan(Man(name = "Tony", surname = "Stark"))
        weatherStation.addMan(Man(name = "Cristiano", surname = "Ronaldo"))

        weatherStation.updateWeather()
    }
}