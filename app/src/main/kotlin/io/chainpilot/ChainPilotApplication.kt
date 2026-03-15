package io.chainpilot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChainPilotApplication

fun main(args: Array<String>) {
    runApplication<ChainPilotApplication>(*args)
}
