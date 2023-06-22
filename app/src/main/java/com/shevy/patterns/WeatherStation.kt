package com.shevy.patterns

import java.util.LinkedList
import java.util.Random
import java.util.logging.Handler

class WeatherStation {
    private val people: MutableList<ManBehavior> = LinkedList()

    var degrees = 0

    fun addMan(manBehavior: ManBehavior){
        people.add(manBehavior)
    }

    fun remove(manBehavior: ManBehavior){
        people.remove(manBehavior)
    }

    fun updateWeather() {
        degrees = Random().nextInt(400)
        people.forEach{
            it.getClothes(degrees = degrees)
        }

        val handler = android.os.Handler()
        handler.postDelayed({updateWeather()}, 2000)
    }
}