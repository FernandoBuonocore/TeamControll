package br.com.buono.teamControl.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ClientDto {

    private Integer id;
    private String name;
    private Date dateOfBirth;
}
