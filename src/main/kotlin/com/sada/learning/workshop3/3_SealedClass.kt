package com.sada.learning.workshop3

sealed class Operation

class Add(val value: Int) : Operation()
class Substract(val value: Int) : Operation()
class Multiply(val value: Int) : Operation()
class Divide(val value: Int) : Operation()

fun execute(x: Int, op: Operation) = when (op) {
    is Add -> x + op.value
    is Substract -> x - op.value
    is Multiply -> x * op.value
    is Divide -> x / op.value
}