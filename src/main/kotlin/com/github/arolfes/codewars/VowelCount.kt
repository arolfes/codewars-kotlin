package com.github.arolfes.codewars

/**
 * https://www.codewars.com/kata/vowel-count/train/kotlin
 */
object VowelCount {

    fun getCount(str: String): Int {
        return str.count{x->"aeiou".contains(x)}
    }

}