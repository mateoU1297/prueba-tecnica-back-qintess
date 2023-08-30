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

class ICharacterServiceTest {

    @Mock
    private ICharacterService characterService;

    @InjectMocks
    private CharacterServiceImpl characterServiceImpl;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetCharacters() {
        List<CharacterDto> mockCharacterList = new ArrayList<>();
        mockCharacterList.add(new CharacterDto(1, "Rick Sanchez","Alive","Human","","Male","https://rickandmortyapi.com/api/location/1","https://rickandmortyapi.com/api/character/avatar/1.jpeg"));
        mockCharacterList.add(new CharacterDto(2, "Morty Smith","Alive","Human","","Male","","https://rickandmortyapi.com/api/character/avatar/2.jpeg"));
        mockCharacterList.add(new CharacterDto(3, "Summer Smith","Alive","Human","","Female","https://rickandmortyapi.com/api/location/20","https://rickandmortyapi.com/api/character/avatar/3.jpeg"));
        mockCharacterList.add(new CharacterDto(4, "Beth Smith","Alive","Human","","Female","https://rickandmortyapi.com/api/location/20","https://rickandmortyapi.com/api/character/avatar/4.jpeg"));
        mockCharacterList.add(new CharacterDto(5, "Jerry Smith","Alive","Human","","Male","https://rickandmortyapi.com/api/location/20","https://rickandmortyapi.com/api/character/avatar/5.jpeg"));
        mockCharacterList.add(new CharacterDto(6, "Abadango Cluster Princess","Alive","Alien","","Female","https://rickandmortyapi.com/api/location/2","https://rickandmortyapi.com/api/character/avatar/6.jpeg"));
        mockCharacterList.add(new CharacterDto(7, "Abradolf Lincler","unknown","Human","Genetic experiment","Male","https://rickandmortyapi.com/api/location/20","https://rickandmortyapi.com/api/character/avatar/7.jpeg"));
        mockCharacterList.add(new CharacterDto(8, "Adjudicator Rick","Dead","Human","","Male","","https://rickandmortyapi.com/api/character/avatar/8.jpeg"));
        mockCharacterList.add(new CharacterDto(9, "Agency Director","Dead","Human","","Male","https://rickandmortyapi.com/api/location/20","https://rickandmortyapi.com/api/character/avatar/9.jpeg"));
        mockCharacterList.add(new CharacterDto(10, "Alan Rails","Dead","Human","Superhuman (Ghost trains summoner)","Male","","https://rickandmortyapi.com/api/character/avatar/10.jpeg"));
        mockCharacterList.add(new CharacterDto(11, "Albert Einstein","Dead","Human","","Male","https://rickandmortyapi.com/api/location/1","https://rickandmortyapi.com/api/character/avatar/11.jpeg"));
        mockCharacterList.add(new CharacterDto(12, "Alexander","Dead","Human","","Male","https://rickandmortyapi.com/api/location/1","https://rickandmortyapi.com/api/character/avatar/12.jpeg"));
        mockCharacterList.add(new CharacterDto(13, "Alien Googah","unknown","Alien","","unknown","","https://rickandmortyapi.com/api/character/avatar/13.jpeg"));
        mockCharacterList.add(new CharacterDto(14, "Alien Morty","unknown","Alien","","Male","","https://rickandmortyapi.com/api/character/avatar/14.jpeg"));
        mockCharacterList.add(new CharacterDto(15, "Alien Rick","unknown","Alien","","Male","","https://rickandmortyapi.com/api/character/avatar/15.jpeg"));
        mockCharacterList.add(new CharacterDto(16, "Amish Cyborg","Dead","Alien","Parasite","Male","","https://rickandmortyapi.com/api/character/avatar/16.jpeg"));
        mockCharacterList.add(new CharacterDto(17, "Annie","Alive","Human","","Female","https://rickandmortyapi.com/api/location/1","https://rickandmortyapi.com/api/character/avatar/17.jpeg"));
        mockCharacterList.add(new CharacterDto(18, "Antenna Morty","Alive","Human","Human with antennae","Male","","https://rickandmortyapi.com/api/character/avatar/18.jpeg"));
        mockCharacterList.add(new CharacterDto(19, "Antenna Rick","unknown","Human","Human with antennae","Male","","https://rickandmortyapi.com/api/character/avatar/19.jpeg"));
        mockCharacterList.add(new CharacterDto(20, "Ants in my Eyes Johnson","unknown","Human","Human with ants in his eyes","Male","","https://rickandmortyapi.com/api/character/avatar/20.jpeg"));;
        when(characterService.getCharacters()).thenReturn(mockCharacterList);

        List<CharacterDto> characters = characterServiceImpl.getCharacters();

        assertThat(characters).isNotNull();
        assertThat(characters.size()).isEqualTo(mockCharacterList.size());
    }
}
