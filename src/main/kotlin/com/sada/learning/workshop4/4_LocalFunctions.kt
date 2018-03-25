package com.sada.learning.workshop4

fun foo(fooParam: String) {

    val outerFunction = "Value"

    fun bar(barParam: String) {

        println(barParam)
        println(fooParam)
        println(outerFunction)
    }

    bar(fooParam)
}

fun main(args: Array<String>) {
    foo("Some value")
}