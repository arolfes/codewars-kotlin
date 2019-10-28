package com.github.arolfes.codewars

import kotlin.math.sqrt

/**
 * https://www.codewars.com/kata/predict-your-age/train/kotlin
 */
object PredictYourAge {
    fun predictAge(vararg age:Int) = (sqrt((age.map{it*it}.sum().toDouble())) /2).toInt()
}