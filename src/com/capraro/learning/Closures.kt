package com.capraro.learning

fun outsideFunction1() {

    val number =  10

    //access to variable is possible: it's a closure (closing on the variable : see tooltip on number)
    doUnaryOperation(20, {it -> it + number})
}

fun anotherUnaryOperation(x: Int, op: (Int) -> Int) {
    op(x)
}

fun outsideFunction2() {

    //closures varies (in other languages closures are constants)
    for (number in 1..30) {
        anotherUnaryOperation(20, { x ->
            println(number)
            x * number
        })
    }
}

fun main(args: Array<String>) {

    outsideFunction2()

}