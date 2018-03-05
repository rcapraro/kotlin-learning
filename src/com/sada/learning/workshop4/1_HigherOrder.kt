package com.sada.learning.workshop4

import java.util.concurrent.locks.Lock

fun <T> lock(lock: Lock, body: () -> T): T {
    lock.lock()
    try {
        return body()
    } finally {
        lock.unlock()
    }
}

fun doOperation(x: Int, y: Int, op: (Int, Int) -> Int) {
    println(op(x, y))
}


fun doUnaryOperation(x: Int, op: (Int) -> Int) {
    println(op(x))
}

fun unaryOperation(op: (Int) -> Int) {
}

fun sum(x: Int, y: Int): Int = x + y

fun transaction(database: Database, code: () -> Unit) {
    try {
        code()
    } finally {
        database.commit()
    }
}

fun main(args: Array<String>) {

    doOperation(3, 4, ::sum)

    val f: (Int, Int) -> Int = { x, y -> x + y + 2 }

    doOperation(3, 4, f)

    doUnaryOperation(4, { x -> x * x })
    doUnaryOperation(4, { it * it })
    doUnaryOperation(4) { it * it }

    unaryOperation { it * it }


    unaryOperation {
        it * it
    }

    val database = Database()

    transaction(database) {
        // do something
    }

    //anonymous function...can have multiple return points
    doUnaryOperation(3, fun(x): Int { return x * x })

    doUnaryOperation(3, fun(x): Int {
        if (x > 10) {
            return x
        } else {
            return x * x
        }
    }
    )

}