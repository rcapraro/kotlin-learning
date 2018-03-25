package com.sada.learning.workshop6

class Hello {
    operator fun invoke(value: String) {
        println("Hello $value !")
    }
}

fun main(args: Array<String>) {
    val hello = Hello()
    hello("World")
}