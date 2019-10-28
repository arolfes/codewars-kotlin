package com.github.arolfes.codewars

/**
 * https://www.codewars.com/kata/mumbling/kotlin
 */
object Mumbling {

    fun accum(s: String): String {
        return s.mapIndexed { index, char -> char.toUpperCase() + char.toString().toLowerCase().repeat(index) }.joinToString("-")
    }

}