package com.example.berlinclock

import com.example.berlinclock.viewModel.BerlinClockViewModel.LightColors
import com.example.berlinclock.viewModel.BerlinClockViewModel.LightColors.*

fun Int.isEven() =  this % 2 == 0

class BerlinClock {


    companion object {

        fun getSeconds(seconds : Int): LightColors {
            return if(seconds.isEven())
                YELLOW
            else
                OFF
        }

        fun getMinutes(minutes : Int){

        }

        fun getHours(hours : Int){

        }

    }

    fun getMinutesTopRow(minutes : Int){

    }

    fun getMinutesBottomRow(minutes :Int){

    }

    fun getHoursTopRow(minutes : Int){

    }

    fun getHoursBottomRow(minutes :Int){

    }

}