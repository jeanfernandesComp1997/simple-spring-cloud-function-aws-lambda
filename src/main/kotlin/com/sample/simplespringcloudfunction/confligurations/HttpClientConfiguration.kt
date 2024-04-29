package com.sample.simplespringcloudfunction.confligurations

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class HttpClientConfiguration(
    private val webClientBuilder: WebClient.Builder
) {

    @Bean
    fun client(): WebClient {
        return webClientBuilder
            .baseUrl("https://rickandmortyapi.com/api")
            .build()
    }
}