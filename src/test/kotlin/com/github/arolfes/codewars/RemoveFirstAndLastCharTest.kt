package com.github.arolfes.codewars

import kotlin.test.assertEquals
import org.junit.Test


class RemoveFirstAndLastCharTest {

    @Test
    fun basicTests() {
        assertEquals("loquen", RemoveFirstAndLastChar.removeChar("eloquent"))
        assertEquals("ountr", RemoveFirstAndLastChar.removeChar("country"))
        assertEquals("erso", RemoveFirstAndLastChar.removeChar("person"))
        assertEquals("lac", RemoveFirstAndLastChar.removeChar("place"))
    }

}