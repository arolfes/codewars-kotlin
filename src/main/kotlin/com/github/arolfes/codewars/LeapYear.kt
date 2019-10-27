package com.github.arolfes.codewars

/**
 * https://www.codewars.com/kata/leap-years/kotlin
 */
object LeapYear {

    fun isLeapYear(year: Int) : Boolean {

        return when {
            year % 400 == 0 -> true
            year % 100 == 0 -> false
            else -> year % 4 == 0
        }
    }
}