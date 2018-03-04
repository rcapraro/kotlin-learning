package com.capraro.learning

import java.util.concurrent.locks.Lock

fun <T> lock(lock: Lock, body: () -> T): T {
    lock.lock()
    try {
        return body()
    } finally {
        lock.unlock()
    }
}

fun dooperation(x: Int, y: Int, op: (Int, Int) -> Int) {
    println(op(x, y))
}

fun chainOperations(x: Int, y: Int, vararg operation: (Int, Int) -> Int) {

    for (op in operation) {
        println(op(x, y))
    }
}

fun doUnaryOperation(x: Int, op: (Int) -> Int) {
    println(op(x))
}

fun unaryOperation(op: (Int) -> Int) {
}

fun sum(x: Int, y: Int): Int = x + y
fun mult(x: Int, y: Int): Int = x * y

fun main(args: Array<String>) {

    dooperation(3, 4, ::sum)
    chainOperations(2, 4, ::sum, ::mult)

    val f: (Int, Int) -> Int = { x, y -> x + y + 2}

    dooperation(3, 4, f)

    doUnaryOperation(4, {x -> x * x})
    doUnaryOperation(4, {it * it})
    doUnaryOperation(4) {it * it}

    unaryOperation { it * it }


    unaryOperation {
        it * it
    }
}