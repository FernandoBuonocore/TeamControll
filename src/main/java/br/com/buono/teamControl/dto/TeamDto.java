package br.com.buono.teamControl.dto;

import lombok.Data;

import java.time.Instant;

@Data
public class TeamDto {

    String name;

    String city;

    String modality;

    Instant foundationDate;
}
