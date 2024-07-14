package com.open3r.openchat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OpenchatApplication

fun main(args: Array<String>) {
    runApplication<OpenchatApplication>(*args)
}
