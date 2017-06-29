package com.example.project

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class MySpringApplication

fun main(args: Array<String>) {
    SpringApplication.run(MySpringApplication::class.java, *args)
}