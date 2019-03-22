package com.newidea.user.repository

import com.newidea.user.domain.User
import org.springframework.data.r2dbc.repository.R2dbcRepository

interface UserRepository : R2dbcRepository<User, Long> {
}