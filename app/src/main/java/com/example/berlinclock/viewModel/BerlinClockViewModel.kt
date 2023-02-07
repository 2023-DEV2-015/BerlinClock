package com.example.berlinclock.viewModel

import androidx.compose.ui.graphics.Color
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.berlinclock.models.BerlinTime

class BerlinClockViewModel {

    private var _berlinTime : MutableLiveData<BerlinTime> = MutableLiveData(BerlinTime.init())
    val berlinTime: LiveData<BerlinTime> = _berlinTime

    enum class LightColors(val color : Color) {
        OFF(Color.Transparent),
        YELLOW(Color.Yellow),
        RED(Color.Red)
    }

    fun initBerlinTime(){
        _berlinTime.postValue(BerlinTime.init())
    }



}