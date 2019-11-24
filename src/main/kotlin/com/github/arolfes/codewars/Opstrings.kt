package com.github.arolfes.codewars

/**
 * https://www.codewars.com/kata/moves-in-squared-strings-i/kotlin
 */
object Opstrings {

    fun vertMirror(strng: String) = strng.split("\n").map { it.reversed() }.joinToString("\n")

    fun horMirror(strng: String) = strng.split("\n").reversed().joinToString("\n")

    fun oper(f: (String) -> String , s: String): String = f(s)

}