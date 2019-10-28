package com.github.arolfes.codewars

import kotlin.math.absoluteValue

/**
 * https://www.codewars.com/kata/delete-occurrences-of-an-element-if-it-occurs-more-than-n-times/train/kotlin
 */
object EnoughIsEnough {

    fun deleteNth(elements:IntArray, maxOcurrences:Int):IntArray {
        val linkedMap: LinkedHashMap<Int, Int> = linkedMapOf()

        val exists = { input: Int ->
            val t = linkedMap[input]?.absoluteValue ?: 0
            if (t < maxOcurrences) {
                linkedMap[input] = t.inc()
                true
            } else {
                false
            }
        }

        return elements.filter { x: Int -> exists(x) }.toIntArray()
    }
}