package com.example.berlinclock.viewmodel


import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.berlinclock.models.BerlinTime
import com.example.berlinclock.viewModel.BerlinClockViewModel
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class ClockViewModelTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var viewModel: BerlinClockViewModel

    @Before
    fun setUp() {
        viewModel = BerlinClockViewModel()
    }

    @Test
    fun livedata_should_return_initial_berlin_clock_data() {
        viewModel.initBerlinTime()

        val value = viewModel.berlinTime.getOrAwaitValue()
        val expectedBerlinTime = BerlinTime.init()
        assertThat("CHECK IF TIME IS RETRIEVED CORRECTLY FROM VIEWMODEL", value == expectedBerlinTime)
    }
}