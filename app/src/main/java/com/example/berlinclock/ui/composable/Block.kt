package com.example.berlinclock.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.berlinclock.viewModel.BerlinClockViewModel.LightColors.YELLOW

@Composable
fun Block(color: Color, count : Int, shape: Shape) {
    Box(
        modifier = Modifier
            .height(((LocalConfiguration.current.screenHeightDp - 100) / 5).dp)
            .width(((LocalConfiguration.current.screenWidthDp - 40) / count).dp)
            .padding(2.dp, 0.dp)
            .clip(shape)
            .background(color)
            .border(3.dp, Color.Black, shape)
    )
}

@Preview
@Composable
fun BlockPreview(){
    Block(color = YELLOW.color, count = 4, START_SHAPE)
}