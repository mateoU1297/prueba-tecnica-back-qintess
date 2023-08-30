package com.test.backend.controllers;

import com.test.backend.dto.CharacterDto;
import com.test.backend.services.ICharacterService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/characters")
@AllArgsConstructor
public class CharacterController {

    private final ICharacterService characterService;
    @GetMapping
    public ResponseEntity<List<CharacterDto>> getCharacters() {
        return ResponseEntity.ok(characterService.getCharacters());
    }
}