package com.example.sampleCamelOne

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class SampleCamelOneApplication

fun main(args: Array<String>) {
	runApplication<SampleCamelOneApplication>(*args)
}
