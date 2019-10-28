package com.github.arolfes.codewars

import org.junit.Assert.*
import org.junit.Test

class PredictYourAgeTest {

    @Test
    @Throws(Exception::class)
    fun basicTest() {
        assertEquals(86, PredictYourAge.predictAge(65, 60, 75, 55, 60, 63, 64, 45))
        assertEquals(79, PredictYourAge.predictAge(32, 54, 76, 65, 34, 63, 64, 45))
    }
}