package br.com.buono.teamControl.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import java.io.Serializable;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Data
@Builder
public class ContactTeam implements Serializable {

    @Id
    @GeneratedValue(strategy=SEQUENCE, generator="CONTACT_TEAM_SEQ")
    @Column(name = "id", nullable = false)
    private Long Id;

    private String name;

    private String cpf;

    private String phone;

    private String office;
}
