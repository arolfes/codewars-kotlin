package com.github.arolfes.codewars

/**
 * https://www.codewars.com/kata/mumbling/kotlin
 */
object Mumbling {

    fun accum(s:String):String {
        val result = StringBuilder()
        s.toCharArray().forEachIndexed { index, c ->  convert(index, c, result)}
        return result.toString()
    }

    private fun convert(i:Int, c:Char, result: StringBuilder) {
        var s = c.toUpperCase().toString()
        if (i == 0) {
            result.append("$s")
        } else {
            var j = 0
            while (j < i) {
                s = "$s${c.toLowerCase()}"
                j = j.inc()
            }
            result.append("-$s")
        }
    }
}