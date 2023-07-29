package br.com.buono.teamControl.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

@Data
@Entity
public class Team implements Serializable {

    @Id
    private Long Id;

    private String TeamName;

    private String city;

    private Instant fundationDate;

    private String modality;

    private ContactTeam contact;

    private List<Player> players;
}
