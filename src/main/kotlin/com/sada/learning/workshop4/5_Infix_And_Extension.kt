package com.sada.learning.workshop4

fun String.shouldBeEqualTo(value: String) = this == value

infix fun String.shouldBeSameAs(value: String) = this == value

fun main(args: Array<String>) {

    "Hello".shouldBeEqualTo("Hello")

    "Hello" shouldBeSameAs "Hello"

}