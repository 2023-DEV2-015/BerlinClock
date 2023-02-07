package com.example.berlinclock




import com.example.berlinclock.viewModel.BerlinClockViewModel.LightColors.*
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class BerlinClockTest {

    @Test
    fun if_even_second_display_yellow_color(){
        val result = BerlinClock.getSeconds(22)
        val expected = YELLOW

        assertThat("EVEN SECONDS VALUE TURNS SECONDS LIGHT YELLOW" ,result == expected)
    }

    @Test
    fun if_odd_second_display_off_color(){
        val result = BerlinClock.getSeconds(45)
        val expected = OFF

        assertThat("ODD SECONDS VALUE TURNS SECONDS LIGHT OFF" ,result == expected)
    }



}