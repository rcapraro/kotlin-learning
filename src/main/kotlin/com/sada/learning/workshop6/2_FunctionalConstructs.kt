package com.sada.learning.workshop6

import arrow.core.andThen
import arrow.core.compose
import arrow.syntax.function.curried
import arrow.syntax.function.forwardCompose
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CompositionTest {

    private val add5 = { i: Int -> i + 5 }
    private val multiplyBy2 = { i: Int -> i * 2 }

    private val sum2ints = { x:Int, y:Int -> x+y}
    private val curried = sum2ints.curried()

    @Test fun testAndThen() {
        val add5ThenMulitplyBy2 = add5 andThen multiplyBy2
        Assertions.assertEquals(add5ThenMulitplyBy2(2), 14)
    }

    @Test fun testCompose() {
        val add5ComposesMulitplyBy2 = add5 compose  multiplyBy2
        Assertions.assertEquals(add5ComposesMulitplyBy2(2), 9)
    }

    @Test fun testForwardCompose() {
        val add5ForwardComposesMulitplyBy2 = add5 forwardCompose   multiplyBy2
        Assertions.assertEquals(add5ForwardComposesMulitplyBy2(2), 14)
    }

    @Test fun testCurrying() {
        val add10 = curried(10)
        Assertions.assertEquals(sum2ints(10, 3), add10(3))
    }
}
