package com.example.berlinclock.models

import com.example.berlinclock.viewModel.BerlinClockViewModel.LightColors


data class BerlinTime(
    val secondsLight : LightColors,
    val minutesLights : Minutes,
    val hoursLights : Hours
){
    companion object {
        fun init()= BerlinTime(LightColors.OFF, Minutes(), Hours())
    }
}
