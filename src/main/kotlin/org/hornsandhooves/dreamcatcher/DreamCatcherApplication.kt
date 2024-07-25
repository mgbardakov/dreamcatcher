package org.hornsandhooves.dreamcatcher

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DreamCatcherApplication

fun main(args: Array<String>) {
    runApplication<DreamCatcherApplication>(*args)
}
