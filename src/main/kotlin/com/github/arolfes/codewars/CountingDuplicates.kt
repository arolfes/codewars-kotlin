package com.github.arolfes.codewars

/**
 * https://www.codewars.com/kata/counting-duplicates/kotlin
 */
object CountingDuplicates {

    fun duplicateCount(text: String): Int {
        val counts = mutableMapOf<Char, Int>()
        // counting occurrence of each character
        fun countOccurrence(c: Char): Boolean {
            counts[c] = counts[c]?.plus(1) ?: 1
            return true
        }
        text.toLowerCase().filter { countOccurrence(it) }

        var counter = 0
        fun increaseCounter(): Boolean {
            counter = counter.inc()
            return true
        }
        // increase counter of duplicates
        counts.filter {
            when {
                (it.value > 1) -> increaseCounter()
                else -> false
            }
        }
        return counter
    }
}