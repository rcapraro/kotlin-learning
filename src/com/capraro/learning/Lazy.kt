package com.capraro.learning

fun main(args: Array<String>) {

    // val elements = 1..100

    val elements = 1..100000000000

    //slow
    // val output = elements.filter { it < 30 }.map { "Yes" to it }

    //sequence
    // val outputSeq = elements.asSequence().filter { it < 30 }.map { "Yes" to it }

    //lazy
    val outputTaken = elements.asSequence().take(30).map { "Yes" to it }

    /*output.forEach {
        println(it)
    }*/

    /*outputSeq.forEach {
        println(it)
    }*/

    outputTaken.forEach {
        println(it)
    }


    val outputGenereated = generateSequence(1) { x -> x + 10 }
    val sum = outputGenereated.take(30).sum()

/*    outputGenereated.forEach {
        println(it)
    }*/

    println(sum)

    //lazy value: subsequent calls remember the value
    val lazyValue: Int by lazy {
        println("computed!")
        100
    }

    println(lazyValue)
    println(lazyValue)
}