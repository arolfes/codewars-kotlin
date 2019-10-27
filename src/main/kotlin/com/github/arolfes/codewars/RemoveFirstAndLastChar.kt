package com.github.arolfes.codewars

/**
 * https://www.codewars.com/kata/remove-first-and-last-character/kotlin
 */
object RemoveFirstAndLastChar {

    fun removeChar(str: String): String {
        return str.removeRange(0,1).removeRange(str.length-2, str.length-1)
    }
}