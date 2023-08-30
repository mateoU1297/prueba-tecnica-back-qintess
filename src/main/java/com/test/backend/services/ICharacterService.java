package com.test.backend.services;

import com.test.backend.dto.CharacterDto;

import java.util.List;

public interface ICharacterService {
    public List<CharacterDto> getCharacters();
}
