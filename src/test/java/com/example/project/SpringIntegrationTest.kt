package com.example.project;

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext

@SpringBootTest
@ExtendWith(SpringExtension::class)
class SpringIntegrationTest {

    @Autowired
    private lateinit var context: WebApplicationContext

    @Test
    fun contextLoads() {
        val client = MockMvcBuilders.webAppContextSetup(context).build()

        client.perform(get("/Bismarck"))
                .andExpect(status().is2xxSuccessful)
                .andExpect(content().string("Hello, Bismarck!"))
    }

}
