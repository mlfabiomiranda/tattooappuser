package com.newidea.user

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories

@SpringBootApplication
@EnableR2dbcRepositories
class TattooappuserApplication

fun main(args: Array<String>) {
    runApplication<TattooappuserApplication>(*args)
}
