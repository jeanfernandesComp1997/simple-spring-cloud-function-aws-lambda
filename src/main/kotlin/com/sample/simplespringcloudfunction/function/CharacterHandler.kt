package com.sample.simplespringcloudfunction.function

import com.sample.simplespringcloudfunction.dto.CharacterOutput
import com.sample.simplespringcloudfunction.dto.RetrieveCharacterInput
import com.sample.simplespringcloudfunction.providers.CharacterProvider
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.function.Function

@Configuration
class CharacterHandler(
    private val characterProvider: CharacterProvider
) {

    @Bean
    fun retrieveCharacter(): Function<RetrieveCharacterInput, CharacterOutput?> {
        return Function { input: RetrieveCharacterInput ->
            characterProvider.retrieveCharacter(input.id)
        }
    }
}