package com.shevy.patterns

import android.util.Log

data class Man(val name: String, val surname: String) : ManBehavior {

    private val TAG = "WeatherTag"

    override fun getClothes(degrees: Int) {
        if (degrees > 200) {
            Log.d(TAG, "Warm")
        } else {
            Log.d(TAG, "Cold")
        }
    }
}