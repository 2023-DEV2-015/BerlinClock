package com.example.berlinclock.ui.composable

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.berlinclock.models.Minutes
import com.example.berlinclock.viewModel.BerlinClockViewModel
import com.example.berlinclock.viewModel.BerlinClockViewModel.LightColors

@Composable
fun LightsRow(colorList: List<LightColors>) {
    Row(
        modifier = Modifier
            .height(((LocalConfiguration.current.screenHeightDp - 100) / 5).dp)
            .fillMaxWidth()
            .padding(0.dp, 8.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        val it =  colorList.listIterator()
        while(it.hasNext()){
            when(it.nextIndex()){
                0 -> {
                    Block(color = it.next().color, count = colorList.size)
                }
                colorList.lastIndex -> {
                    Block(color = it.next().color, count = colorList.size)
                }
                else -> { Block(color = it.next().color, colorList.size) }

            }
        }
    }
}


@Preview
@Composable
fun LightRowPreview(){
    LightsRow(colorList = Minutes.baseBottom() )
}