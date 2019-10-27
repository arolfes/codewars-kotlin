package com.github.arolfes.codewars

import kotlin.test.assertEquals
import org.junit.Test

class LeapYearTest {
    @Test
    fun `Basic Tests`() {
        assertEquals(false, LeapYear.isLeapYear(1234))
        assertEquals(true, LeapYear.isLeapYear(1984))
        assertEquals(true, LeapYear.isLeapYear(2000))
        assertEquals(false, LeapYear.isLeapYear(2010))
        assertEquals(false, LeapYear.isLeapYear(2013))
    }
}
