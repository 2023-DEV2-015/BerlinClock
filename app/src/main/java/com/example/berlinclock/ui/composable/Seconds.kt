package com.example.berlinclock.ui.composable

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.berlinclock.viewModel.BerlinClockViewModel


@Composable
fun Seconds(color: BerlinClockViewModel.LightColors) {

}

@Preview
@Composable
fun SecondsPreview(){
    Seconds(color = BerlinClockViewModel.LightColors.YELLOW)
}