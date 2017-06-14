package com.example.project

class CalculatorKotlin {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }
}

fun main(args: Array<String>) {
    val a: CalculatorJava = CalculatorJava()

    println("==========")
    println("Adding 2 and 5, you get: " + a.add(2, 5))
    println("==========")
}