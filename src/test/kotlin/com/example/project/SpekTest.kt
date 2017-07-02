package com.example.project

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import junit.framework.TestCase.assertEquals
import org.jetbrains.spek.api.dsl.context

//import org.jetbrains.spek.api.Spek
//import org.jetbrains.spek.api.dsl.describe
//import org.jetbrains.spek.api.dsl.it
//import org.junit.jupiter.api.Assertions.assertEquals
//
//class SpekTest : Spek({
//    describe("a calculator") {
//        val calculator = CalculatorKotlin()
//
//        it("should return the result of adding the first number to the second number") {
//            val sum = calculator.add(2, 4)
//            assertEquals(6, sum)
//        }
//
//        it("should return the result of subtracting the second number from the first number") {
//            val subtract = calculator.subtract(4, 2)
//            assertEquals(2, subtract)
//        }
//    }
//})

object SpekTest: Spek({
    class Calculator {
        fun sum(a: Int, b: Int): Int {
            return a + b
        }

        fun subtract(a: Int, b: Int): Int {
            return a - b
        }

    }

    describe("a calculator") {
        val calculator = Calculator()

        context("addition") {
            val sum = calculator.sum(4, 2)

            it("should return the result of adding the first number to the second number") {
                assertEquals(6, sum)
            }
        }

        context("subtraction") {
            val subtract = calculator.subtract(4, 2)

            it("should return the result of subtracting the second number from the first number") {
                assertEquals(2, subtract)
            }
        }
    }
})