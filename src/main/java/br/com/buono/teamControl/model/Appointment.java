package br.com.buono.teamControl.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Data
@Builder
public class Appointment implements Serializable {

    @Id
    @GeneratedValue(strategy=SEQUENCE, generator="APPOINTMENT_SEQ")
    @Column(name = "id", nullable = false)
    private Long Id;

    private Date initAppointment;

    private Date endAppointment;

    private String local;

    private String obs;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_team")
    private Team team;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_team_versus")
    private Team teamVersus;

}
