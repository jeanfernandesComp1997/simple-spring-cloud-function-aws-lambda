package com.sample.simplespringcloudfunction.providers

import com.sample.simplespringcloudfunction.dto.CharacterOutput
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient

@Component
class CharacterProvider(
    private val client: WebClient
) {

    fun retrieveCharacter(id: Int): CharacterOutput? {
        return client
            .get()
            .uri("/character/$id")
            .retrieve()
            .bodyToMono(CharacterOutput::class.java)
            .block()
    }
}