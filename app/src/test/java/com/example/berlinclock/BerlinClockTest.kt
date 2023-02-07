package com.example.berlinclock




import com.example.berlinclock.viewModel.BerlinClockViewModel.LightColors.*
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class BerlinClockTest {

    @Test
    fun if_even_second_display_yellow_color(){
        val result = BerlinClock.getSeconds(22)
        val expected = YELLOW

        assertThat("EVEN SECONDS VALUE TURNS SECONDS LIGHT YELLOW" ,result.equals(expected))
    }



}