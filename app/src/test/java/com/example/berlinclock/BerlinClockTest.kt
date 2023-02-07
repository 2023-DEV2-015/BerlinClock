package com.example.berlinclock




import com.example.berlinclock.models.Hours
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

    @Test
    fun if_15_minutes_multiple_display_yellow_and_red_color(){
        val result = BerlinClock.getMinutes(30)

        val topRow = listOf(YELLOW, YELLOW,
            RED, YELLOW, YELLOW, RED, OFF, OFF, OFF, OFF, OFF)
        val bottomRow = listOf(OFF, OFF, OFF, OFF)
        val expectedResult = Minutes(topRow = topRow, bottomRow = bottomRow)

        assertThat("IF 15 MINUTES MULTIPLES DISPLAY YELLOW AND RED COLORS", expectedResult == result)
    }

    @Test
    fun if_random_minute_check_color(){
        val result = BerlinClock.getMinutes(33)

        val topRow = listOf(YELLOW, YELLOW, RED, YELLOW, YELLOW, RED, OFF, OFF, OFF, OFF, OFF)
        val bottomRow = listOf(YELLOW, YELLOW, YELLOW, OFF)
        val expectedResult = Minutes(topRow = topRow, bottomRow = bottomRow)

        assertThat("CHECK IF RANDOM MINUTE CORRESPOND TO EXPECTED RESULT", expectedResult == result)
    }

    @Test
    fun if_random_hour_check_color(){
        val result = BerlinClock.getHours(12)

        val topRow = listOf( RED, RED, OFF, OFF)
        val bottomRow = listOf(RED, RED, OFF, OFF)
        val expectedResult = Hours(topRow = topRow, bottomRow = bottomRow)

        assertThat("CHECK IF RANDOM HOUR CORRESPOND TO EXPECTED RESULT", expectedResult == result)
    }
}