package com.test.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CharacterDto {

    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private String origin;
    private String image;
}
