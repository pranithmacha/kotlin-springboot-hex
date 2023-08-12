package com.example.integrationtests.demo

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.testcontainers.containers.PostgreSQLContainer
import org.testcontainers.junit.jupiter.Container
import org.testcontainers.junit.jupiter.Testcontainers


@Testcontainers
internal class ContainersEnvironment {

    // will be started before and stopped after each test method
    @Container
    private val postgresqlContainer = PostgreSQLContainer("postgres:11.1")
        .withDatabaseName("foo")
        .withUsername("foo")
        .withPassword("secret")

    @Test
    fun test() {
        assertThat(postgresqlContainer.isRunning).isTrue()
    }
}