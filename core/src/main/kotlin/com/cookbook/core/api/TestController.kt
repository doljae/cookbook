package com.cookbook.core.api

import com.fasterxml.jackson.annotation.JsonFormat
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class TestController {

    @PostMapping("/test")
    fun test(@RequestBody body: Body): String {
        println(body.date)
        return "10"
    }
}

class Body(
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    val date: LocalDateTime,
)
