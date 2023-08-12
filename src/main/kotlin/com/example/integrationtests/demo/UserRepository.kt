package com.example.integrationtests.demo

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import org.springframework.r2dbc.core.DatabaseClient
import org.springframework.r2dbc.core.awaitOneOrNull
import org.springframework.stereotype.Repository

@Repository
class UserRepository(
    private val client: DatabaseClient
) {
    suspend fun findById(id: Long): User? =
        client
            .sql("SELECT * FROM users WHERE id = $id")
            .map { row ->
                User(
                    row.get("id") as Long,
                    row.get("username") as String,
                    row.get("email") as String,
                )
            }
            .awaitOneOrNull()
}

@Table("users")
data class User(
    @Id val id: Long,
    @Column("username") val username: String,
    @Column("email") val email: String,
)