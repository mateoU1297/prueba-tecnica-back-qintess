package com.test.backend.controllers;

import com.test.backend.dto.CharacterDto;
import com.test.backend.services.ICharacterService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CharacterControllerTest {

    private CharacterController characterController;

    @Mock
    private ICharacterService characterService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        characterController = new CharacterController(characterService);
    }

    @Test
    void getCharacters_shouldReturnListOfCharacters() {
        List<CharacterDto> mockCharacterList = new ArrayList<>();
        mockCharacterList.add(new CharacterDto());
        when(characterService.getCharacters()).thenReturn(mockCharacterList);

        ResponseEntity<List<CharacterDto>> response = characterController.getCharacters();

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(mockCharacterList, response.getBody());
    }
}
