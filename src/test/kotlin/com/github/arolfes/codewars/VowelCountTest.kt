package com.github.arolfes.codewars

import kotlin.test.assertEquals
import org.junit.Test

class VowelCountTest {

    @Test
    fun testFixed() {
        assertEquals(1, VowelCount.getCount("test"))
        assertEquals(5, VowelCount.getCount("abracadabra"))
        assertEquals(3, VowelCount.getCount("example"))
    }
}