package com.example.berlinclock




import com.example.berlinclock.models.Minutes
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

    @Test
    fun if_between_0_and_4_minute(){
        val result = BerlinClock.getMinutes(3)

        val topRow = listOf(OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF)
        val bottomRow = listOf(YELLOW, YELLOW, YELLOW, OFF)
        val expectedResult = Minutes(topRow = topRow, bottomRow = bottomRow)

        assertThat("IF BELOW 4 MINUTES TOP ROW IS OFF", expectedResult==result)
    }

}