package com.sada.learning.workshop4

import java.math.BigInteger

fun factorial(number: BigInteger): BigInteger {
    return when (number) {
        BigInteger.ZERO, BigInteger.ONE -> BigInteger.ONE
        else -> number * factorial(number - BigInteger.ONE) //does not en with a call to the function itself
    }
}

tailrec fun factorialTailRec(number: BigInteger, accumulator: BigInteger = BigInteger.ONE): BigInteger {
    return when (number) {
        BigInteger.ZERO -> accumulator
        else -> factorialTailRec(number - BigInteger.ONE, accumulator * number) //does end with a call to the function itself: can be tail rec
    }
}

fun main(args: Array<String>) {

    println(factorial(BigInteger.valueOf(5)))

    //lead to stack overflow
    //println(factorial(BigInteger.valueOf(10000)))

    //show bytecode: it replaces INVOKESTATIC by a GOTO
    println(factorialTailRec(BigInteger.valueOf(10000)))

}