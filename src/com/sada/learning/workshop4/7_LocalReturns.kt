package com.sada.learning.workshop4

fun containingFunction() {
    val numbers = 1..100

    numbers.forEach {
        if (it % 5 == 0) {
            return
        }
    }

    println("Hello")
}

fun containingFunctionWithLocalReturn() {
    val numbers = 1..100

    numbers.forEach {
        if (it % 5 == 0) {
            return@forEach
        }
    }

    println("Hello")
}

fun containingFunctionWithLabelledReturn() {
    val numbers = 1..100

    numbers.forEach myLabel@{
        if (it % 5 == 0) {
            return@myLabel
        }
    }

    println("Hello")
}

public fun <T> Iterable<T>.myForEach(action: (T) -> Unit): Unit {
    for (element in this) action(element)
}

fun containingFunctionWithMyForeach() {
    val numbers = 1..100

    numbers.myForEach {
        if (it % 5 == 0) {
            // non local returns are not allowed on non inlined functions !
            // return
        }
    }

    println("Hello")
}

fun containingFunctionWithAnonymous() {
    val numbers = 1..100

    numbers.forEach(fun(element: Int) {
        if (element % 5 == 0) {
            return
        }
    }
    )

    println("HelloA")
}


fun main(args: Array<String>) {

    //does not display Hello: Lambda returns
    containingFunction()

    // display Hello: Lambda returns to the foreach
    containingFunctionWithLocalReturn()

    containingFunctionWithLabelledReturn()

    // display Hello: anonymous returns
    containingFunctionWithAnonymous()

    //TIP: always return to to the nearest fun
}