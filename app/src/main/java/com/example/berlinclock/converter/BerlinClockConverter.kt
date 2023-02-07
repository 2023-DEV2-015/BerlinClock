package com.example.berlinclock.converter


import com.example.berlinclock.BerlinClock
import com.example.berlinclock.models.BerlinTime

class BerlinClockConverter {
    companion object {
        fun convert(time: String): BerlinTime {
            val timeComponents = time.split(":")
            val hours = BerlinClock.getHours(timeComponents[0].toInt())
            val minutes = BerlinClock.getMinutes(timeComponents[1].toInt())
            val seconds = BerlinClock.getSeconds(timeComponents[2].toInt())

            return BerlinTime(secondsLight = seconds, minutesLights = minutes, hoursLights = hours)
        }
    }
}