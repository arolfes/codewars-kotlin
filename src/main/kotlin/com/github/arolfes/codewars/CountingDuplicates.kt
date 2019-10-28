package com.github.arolfes.codewars

/**
 * https://www.codewars.com/kata/counting-duplicates/kotlin
 */
object CountingDuplicates {

    fun duplicateCount(text: String): Int {
        return text.
                // groups all chars together
                groupingBy { it.toLowerCase() }.
                // counting the occurrence of each char and returns a map with char, int
                eachCount().
                // counting all values which are higher then one
                values.count { it > 1 }
    }
}