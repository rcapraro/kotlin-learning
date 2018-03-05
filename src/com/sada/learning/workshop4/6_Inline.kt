package com.sada.learning.workshop4


/**
 * Using higher-order functions imposes certain runtime penalties: each function is an object, and it captures a closure,
 * i.e. those variables that are accessed in the body of the function. Memory allocations (both for function objects and classes) and virtual calls introduce runtime overhead.
 */
fun operation(op: () -> Unit) {
    println("Before calling op()")
    op()
    println("After calling op()")
}

inline fun operationInline(op: () -> Unit) {
    println("Before calling op()")
    op()
    println("After calling op()")
}

inline fun operationInline2(noinline op: () -> Unit, op2: () -> Unit) {
    println("Before calling op()")
    op()
    op2()
    println("After calling op()")
}

//Shows Intellij exception 'navigate to'
inline fun tryingToInline(noinline op: () -> Unit) {
    val reference = op
    op()
}

//must add inline when storing reference to a function
inline fun inlineException(op: () -> Unit) {
    op()
    throw Exception("A message")
}

fun anotherFunction() {
    operationInline { println("Calling op()") }
}

fun main(args: Array<String>) {

    //show decompiled java code
    operation { println("Calling op()") }

    operation { println("Calling op()") }

    //inline copy the content of the function
    operationInline { println("Calling op()") }

    inlineException { println("Calling op()") }

}