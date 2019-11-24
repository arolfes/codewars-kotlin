package com.github.arolfes.codewars

import java.util.stream.Collectors
import kotlin.reflect.KFunction1

/**
 * https://www.codewars.com/kata/moves-in-squared-strings-i/kotlin
 */
object Opstrings {

    fun vertMirror(strng: String): String = ( strng.split("\n").stream().map { t -> t.reversed() }.collect(Collectors.joining("\n")) )

    fun horMirror(strng: String): String = (strng.split("\n").reversed().joinToString("\n"))

    fun oper(f: KFunction1<String, String>, s: String): String =  (f (s))

}