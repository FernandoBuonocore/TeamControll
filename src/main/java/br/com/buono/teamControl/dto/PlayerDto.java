package br.com.buono.teamControl.dto;

import lombok.Data;

import java.util.Date;

@Data
public class PlayerDto {

    private Long id;
    private String name;
    private Date dateOfBirth;
    private String length;
    private Double weight;

}
