package com.github.arolfes.codewars

import kotlin.math.floor
import kotlin.math.sqrt

/**
 * https://www.codewars.com/kata/predict-your-age/train/kotlin
 */
object PredictYourAge {
    fun predictAge(age1: Int, age2: Int, age3: Int, age4: Int, age5: Int, age6: Int, age7: Int, age8: Int): Int{
        val ages = mutableListOf(age1, age2, age3, age4, age5, age6, age7, age8)
        return floor(sqrt(ages.map { t: Int? -> t!! * t }.sum().toDouble()).div(2)).toInt()
    }
}