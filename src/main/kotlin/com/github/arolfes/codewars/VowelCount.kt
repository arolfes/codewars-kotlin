package com.github.arolfes.codewars

/**
 * https://www.codewars.com/kata/vowel-count/train/kotlin
 */
object VowelCount {

    fun getCount(str: String): Int {
        var count = 0
        str.forEach { ch ->
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++
        }

        return count
    }

}