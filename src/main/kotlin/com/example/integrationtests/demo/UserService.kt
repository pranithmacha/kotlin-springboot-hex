package com.example.integrationtests.demo

import org.springframework.stereotype.Service

@Service
class UserService(val repository: UserRepository) {
    suspend fun findUserById(id: Long): User? =
        repository.findById(id)
}