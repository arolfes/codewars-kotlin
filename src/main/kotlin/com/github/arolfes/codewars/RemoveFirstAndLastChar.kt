package com.github.arolfes.codewars

/**
 * https://www.codewars.com/kata/remove-first-and-last-character/kotlin
 */
object RemoveFirstAndLastChar {

    fun removeChar(str: String): String {
        return str.substring(1, str.length - 1)
    }
}