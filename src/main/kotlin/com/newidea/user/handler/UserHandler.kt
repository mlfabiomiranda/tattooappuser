package com.newidea.user.handler

import com.newidea.user.domain.User
import com.newidea.user.repository.UserRepository
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.web.reactive.function.server.body
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Component
class UserHandler(private val userRepository: UserRepository) {

    fun getAllUsers(): Mono<ServerResponse> {
        val users: Flux<User> = userRepository.findAll()
        return ok().contentType(APPLICATION_JSON).body(users)
    }
}