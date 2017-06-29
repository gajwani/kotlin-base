package com.example.project

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.jupiter.api.Assertions.assertEquals

class SpekTest : Spek({
    describe("a calculator") {
        val calculator = CalculatorKotlin()

        it("should return the result of adding the first number to the second number") {
            val sum = calculator.add(2, 4)
            assertEquals(6, sum)
        }

        it("should return the result of subtracting the second number from the first number") {
            val subtract = calculator.subtract(4, 2)
            assertEquals(2, subtract)
        }
    }
})