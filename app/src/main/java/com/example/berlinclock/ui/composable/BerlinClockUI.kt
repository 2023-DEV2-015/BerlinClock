package com.example.berlinclock.ui.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.berlinclock.models.BerlinTime
import com.example.berlinclock.viewModel.BerlinClockViewModel


@Composable
fun BerlinClockUI(viewModel: BerlinClockViewModel) {
    Column(verticalArrangement = Arrangement.Center) {
        val clock : BerlinTime by viewModel.berlinTime.observeAsState(BerlinTime.init())
        Seconds(color = clock.secondsLight)
        clock.hoursLights.let {
            LightsRow(colorList = it.topRow)
            LightsRow(colorList = it.bottomRow)
        }
        clock.minutesLights.let {
            LightsRow(colorList = it.topRow)
            LightsRow(colorList = it.bottomRow)
        }
        val time : String by viewModel.time.observeAsState("00:00:00")
        Text(text = time, modifier = Modifier
            .padding(0.dp, 8.dp)
            .align(alignment = Alignment.CenterHorizontally))
    }
}

@Preview
@Composable
fun BerlinClockPreview(){
    BerlinClockUI(BerlinClockViewModel())
}