package com.test.backend.services;

import com.test.backend.dto.CharacterDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

class CharacterServiceImplTest {

    @InjectMocks
    private CharacterServiceImpl characterService;

    @Mock
    private ICharacterService characterServiceMock;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getCharacters_shouldReturnListOfCharacters() {
        when(characterServiceMock.getCharacters()).thenReturn(createMockCharacterList());

        List<CharacterDto> characters = characterService.getCharacters();

        assertThat(characters).isNotNull();
        assertThat(characters).hasSize(20);
    }

    private List<CharacterDto> createMockCharacterList() {
        List<CharacterDto> Characters = new ArrayList<>();
        Characters.add(new CharacterDto(1, "Rick Sanchez","Alive","Human","","Male","https://rickandmortyapi.com/api/location/1","https://rickandmortyapi.com/api/character/avatar/1.jpeg"));
        Characters.add(new CharacterDto(2, "Morty Smith","Alive","Human","","Male","","https://rickandmortyapi.com/api/character/avatar/2.jpeg"));
        Characters.add(new CharacterDto(3, "Summer Smith","Alive","Human","","Female","https://rickandmortyapi.com/api/location/20","https://rickandmortyapi.com/api/character/avatar/3.jpeg"));
        Characters.add(new CharacterDto(4, "Beth Smith","Alive","Human","","Female","https://rickandmortyapi.com/api/location/20","https://rickandmortyapi.com/api/character/avatar/4.jpeg"));
        Characters.add(new CharacterDto(5, "Jerry Smith","Alive","Human","","Male","https://rickandmortyapi.com/api/location/20","https://rickandmortyapi.com/api/character/avatar/5.jpeg"));
        Characters.add(new CharacterDto(6, "Abadango Cluster Princess","Alive","Alien","","Female","https://rickandmortyapi.com/api/location/2","https://rickandmortyapi.com/api/character/avatar/6.jpeg"));
        Characters.add(new CharacterDto(7, "Abradolf Lincler","unknown","Human","Genetic experiment","Male","https://rickandmortyapi.com/api/location/20","https://rickandmortyapi.com/api/character/avatar/7.jpeg"));
        Characters.add(new CharacterDto(8, "Adjudicator Rick","Dead","Human","","Male","","https://rickandmortyapi.com/api/character/avatar/8.jpeg"));
        Characters.add(new CharacterDto(9, "Agency Director","Dead","Human","","Male","https://rickandmortyapi.com/api/location/20","https://rickandmortyapi.com/api/character/avatar/9.jpeg"));
        Characters.add(new CharacterDto(10, "Alan Rails","Dead","Human","Superhuman (Ghost trains summoner)","Male","","https://rickandmortyapi.com/api/character/avatar/10.jpeg"));
        Characters.add(new CharacterDto(11, "Albert Einstein","Dead","Human","","Male","https://rickandmortyapi.com/api/location/1","https://rickandmortyapi.com/api/character/avatar/11.jpeg"));
        Characters.add(new CharacterDto(12, "Alexander","Dead","Human","","Male","https://rickandmortyapi.com/api/location/1","https://rickandmortyapi.com/api/character/avatar/12.jpeg"));
        Characters.add(new CharacterDto(13, "Alien Googah","unknown","Alien","","unknown","","https://rickandmortyapi.com/api/character/avatar/13.jpeg"));
        Characters.add(new CharacterDto(14, "Alien Morty","unknown","Alien","","Male","","https://rickandmortyapi.com/api/character/avatar/14.jpeg"));
        Characters.add(new CharacterDto(15, "Alien Rick","unknown","Alien","","Male","","https://rickandmortyapi.com/api/character/avatar/15.jpeg"));
        Characters.add(new CharacterDto(16, "Amish Cyborg","Dead","Alien","Parasite","Male","","https://rickandmortyapi.com/api/character/avatar/16.jpeg"));
        Characters.add(new CharacterDto(17, "Annie","Alive","Human","","Female","https://rickandmortyapi.com/api/location/1","https://rickandmortyapi.com/api/character/avatar/17.jpeg"));
        Characters.add(new CharacterDto(18, "Antenna Morty","Alive","Human","Human with antennae","Male","","https://rickandmortyapi.com/api/character/avatar/18.jpeg"));
        Characters.add(new CharacterDto(19, "Antenna Rick","unknown","Human","Human with antennae","Male","","https://rickandmortyapi.com/api/character/avatar/19.jpeg"));
        Characters.add(new CharacterDto(20, "Ants in my Eyes Johnson","unknown","Human","Human with ants in his eyes","Male","","https://rickandmortyapi.com/api/character/avatar/20.jpeg"));

        return Characters;
    }
}
