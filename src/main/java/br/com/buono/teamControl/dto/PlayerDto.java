package br.com.buono.teamControl.dto;

import br.com.buono.teamControl.enums.GenderEnum;
import lombok.Data;

import java.time.Instant;

@Data
public class PlayerDto {

    private Long id;
    private String name;
    private Instant dateOfBirth;
    private String length;
    private Double weight;
    private String position;
    private GenderEnum genderEnum;

}
