package com.newidea.user.config

import com.newidea.user.handler.UserHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.web.reactive.function.server.router

@Configuration
class RouterConfig(private val userHandler: UserHandler) {

    @Bean
    fun usersRouters() = router {
        (accept(APPLICATION_JSON) and "/api").nest {
            GET("/users").invoke {
                userHandler.getAllUsers()
            }
        }
    }
}