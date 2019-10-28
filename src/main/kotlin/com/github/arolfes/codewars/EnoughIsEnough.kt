package com.github.arolfes.codewars

import kotlin.math.absoluteValue

/**
 * https://www.codewars.com/kata/delete-occurrences-of-an-element-if-it-occurs-more-than-n-times/train/kotlin
 */
object EnoughIsEnough {

    fun deleteNth(elements:IntArray, maxOcurrences:Int):IntArray {
        val counts = mutableMapOf<Int, Int>()
        fun countFilter(x: Int) = counts.compute(x, { _, count -> count?.plus(1) ?: 1 })!! <= maxOcurrences
        return elements.filter { countFilter(it) }.toIntArray()
    }
}