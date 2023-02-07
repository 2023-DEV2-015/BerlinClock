package com.example.berlinclock

import com.example.berlinclock.models.Minutes
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

        fun getMinutes(minutes : Int):Minutes{
            return Minutes(getMinutesTopRow(minutes),getMinutesBottomRow(minutes))
        }

        fun getHours(hours : Int){

        }

        private fun getMinutesTopRow(minutes : Int):List<LightColors>{
            val result = Minutes.baseTop()
            for (index : Int in 0 until minutes/5){
                if((index+1)%3==0)
                    result[index] = RED
                else
                    result[index] = YELLOW
            }
            return result

        }

        private fun getMinutesBottomRow(minutes :Int):List<LightColors>{
            val result = Minutes.baseBottom()
            for (index : Int in 0 until minutes%5){
                result[index] = YELLOW
            }
            return result
        }

        private fun getHoursTopRow(minutes : Int){

        }

        private fun getHoursBottomRow(minutes :Int){

        }

    }

}