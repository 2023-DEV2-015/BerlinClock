package com.example.berlinclock.viewModel

import android.os.CountDownTimer
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.berlinclock.converter.BerlinClockConverter
import com.example.berlinclock.models.BerlinTime
import java.text.SimpleDateFormat
import java.util.*


const val TIME_FORMAT = "HH:mm:ss"
const val DURATION = 600000L
const val INTERVAL = 1000L
class BerlinClockViewModel : ViewModel(){


    init{
        startTime()
    }

    private var _berlinTime : MutableLiveData<BerlinTime> = MutableLiveData(BerlinTime.init())
    val berlinTime: LiveData<BerlinTime> = _berlinTime
    private lateinit var timer: CountDownTimer

    private var _time = MutableLiveData<String>()
    val time: LiveData<String> = _time

    enum class LightColors(val color : Color) {
        OFF(Color.Transparent),
        YELLOW(Color.Yellow),
        RED(Color.Red)
    }

    fun initBerlinTime(){
        _berlinTime.postValue(BerlinTime.init())
    }

    private fun updateBerlinTime(time: String) {
        _time.postValue(time)
        val result = BerlinClockConverter.convert(time)
        _berlinTime.postValue(result)
    }

    private fun startTime() {
        timer = object : CountDownTimer(DURATION, INTERVAL) {
            override fun onTick(millisUntilFinished: Long) = updateClockTime()
            override fun onFinish() {
                start()
            }
        }
        timer.start()
    }
    private fun updateClockTime() {
        val time: String = SimpleDateFormat(TIME_FORMAT, Locale.getDefault()).format(Date())
        updateBerlinTime(time)
    }
}