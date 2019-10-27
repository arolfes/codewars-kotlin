package com.github.arolfes.codewars

/**
 * https://www.codewars.com/kata/leap-years/kotlin
 */
object LeapYear {

    fun isLeapYear(year: Int) : Boolean {

        if (year % 400 == 0) return true
        if (year % 100 == 0) return false
        if (year % 4 == 0) return true
        return false
    }
}