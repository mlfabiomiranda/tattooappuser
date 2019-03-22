package com.newidea.user.domain

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("user_entity")
data class User(

        @Id
        val id: Long? = null,
        val name: String
)