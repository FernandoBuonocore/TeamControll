package br.com.buono.teamControl.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Data
@Entity
@Builder
public class Team implements Serializable {

    @Id
    @GeneratedValue(strategy=SEQUENCE, generator="TEAM_SEQ")
    @Column(name = "id", nullable = false)
    private Long Id;

    private String teamName;

    private String city;

    private Instant foundationDate;

    private String modality;

    private ContactTeam contact;

    private List<Player> players;

    @OneToMany
    @JoinColumn(name="id_appointment")
    private List<Appointment> appointments;
}
