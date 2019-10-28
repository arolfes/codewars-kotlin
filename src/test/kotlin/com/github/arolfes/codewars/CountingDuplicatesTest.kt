package com.github.arolfes.codewars

import org.junit.Test
import kotlin.test.assertEquals

class CountingDuplicatesTest {

    @Test
    fun `abcde returns zero`() {
        assertEquals(0, CountingDuplicates.duplicateCount("abcde"))
    }

    @Test
    fun `abcdea returns one`() {
        assertEquals(1, CountingDuplicates.duplicateCount("abcdea"))
    }

    @Test
    fun `indivisibility returns one`() {
        assertEquals(1, CountingDuplicates.duplicateCount("indivisibility"))
    }

    @Test
    fun `Indivisibilities returns two`() {
        assertEquals(2, CountingDuplicates.duplicateCount("Indivisibilities"))
    }

    @Test
    fun `really long string containing duplicates returns three`() {
        val text = "dA" + "c".repeat(10) + "b".repeat(100) + "a".repeat(1000)
        assertEquals(3, CountingDuplicates.duplicateCount(text))
    }

}