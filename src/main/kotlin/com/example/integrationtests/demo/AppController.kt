package com.example.integrationtests.demo

import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AppController(
    private val appService: AppService
){

    @GetMapping("/blah")
    fun blah(): Int {
        return appService.serviceBlah()
    }
}

@Service
class AppService {
    fun serviceBlah(): Int {
        return 10
    }
}