package com.example.berlinclock.models

import com.example.berlinclock.viewModel.BerlinClockViewModel.LightColors

data class Minutes(
    val topRow: List<LightColors> = baseTop(),
    val bottomRow: List<LightColors> = baseBottom()
){
    companion object {
        fun baseTop() = MutableList(11) { LightColors.OFF }
        fun baseBottom() = MutableList(4) { LightColors.OFF }
    }
}
