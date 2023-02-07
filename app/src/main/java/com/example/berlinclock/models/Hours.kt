package com.example.berlinclock.models

import com.example.berlinclock.viewModel.BerlinClockViewModel.LightColors

data class Hours(
    val topRow: List<LightColors> = base(),
    val bottomRow: List<LightColors> = base()
){
    companion object {
        fun base() = MutableList(4) { LightColors.OFF }
    }
}
