package com.test.backend.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CharacterDtoTest {

    @Test
    void testCharacterDtoBuilder() {
        CharacterDto characterDto = CharacterDto.builder()
                .id(1)
                .name("Rick")
                .status("Alive")
                .species("Human")
                .type("Scientist")
                .gender("Male")
                .origin("Earth")
                .image("rick.jpg")
                .build();

        assertThat(characterDto.getId()).isEqualTo(1);
        assertThat(characterDto.getName()).isEqualTo("Rick");
        assertThat(characterDto.getStatus()).isEqualTo("Alive");
        assertThat(characterDto.getSpecies()).isEqualTo("Human");
        assertThat(characterDto.getType()).isEqualTo("Scientist");
        assertThat(characterDto.getGender()).isEqualTo("Male");
        assertThat(characterDto.getOrigin()).isEqualTo("Earth");
        assertThat(characterDto.getImage()).isEqualTo("rick.jpg");
    }

    @Test
    void testCharacterDtoNoArgsConstructor() {
        CharacterDto characterDto = new CharacterDto();

        assertThat(characterDto).isNotNull();
    }

    @Test
    void testCharacterDtoAllArgsConstructor() {
        CharacterDto characterDto = new CharacterDto(1, "Rick", "Alive", "Human", "Scientist", "Male", "Earth", "rick.jpg");

        assertThat(characterDto).isNotNull();
    }
}
