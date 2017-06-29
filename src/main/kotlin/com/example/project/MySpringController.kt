package com.example.project

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class MySpringController() {

    @GetMapping("/")
    fun hi() = "Hello, World!"

    @GetMapping("/{name}")
    fun hiName(@PathVariable name: String) = "Hello, $name!"
}
