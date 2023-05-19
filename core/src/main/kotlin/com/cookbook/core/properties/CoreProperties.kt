package com.cookbook.core.properties

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "core")
data class CoreProperties(
    val username: String,
    val password: String,
    val secret: String,
)
