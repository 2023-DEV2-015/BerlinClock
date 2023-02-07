package com.example.berlinclock.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.berlinclock.viewModel.BerlinClockViewModel


@Composable
fun Seconds(color: BerlinClockViewModel.LightColors) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(((LocalConfiguration.current.screenHeightDp - 40) / 5).dp),
        horizontalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .size(((LocalConfiguration.current.screenHeightDp - 40) / 5).dp)
                .clip(CircleShape)
                .background(color.color)
                .border(3.dp, Black, CircleShape)
        )
    }
}

@Preview
@Composable
fun SecondsPreview(){
    Seconds(color = BerlinClockViewModel.LightColors.YELLOW)
}