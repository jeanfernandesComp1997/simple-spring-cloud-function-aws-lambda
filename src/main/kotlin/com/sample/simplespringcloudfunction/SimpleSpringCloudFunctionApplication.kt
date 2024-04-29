package com.sample.simplespringcloudfunction

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SimpleSpringCloudFunctionApplication

fun main(args: Array<String>) {
    SpringApplication.run(SimpleSpringCloudFunctionApplication::class.java, *args)
}