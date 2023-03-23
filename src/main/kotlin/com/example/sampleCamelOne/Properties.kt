package com.example.sampleCamelOne

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

class Properties {
    @Configuration
    @ConfigurationProperties(prefix = "amq")
    class AmqProperties {
        lateinit var brokerUrl: String
        var maxConnections: Int = 2
        lateinit var password: String
        lateinit var username: String
    }

}