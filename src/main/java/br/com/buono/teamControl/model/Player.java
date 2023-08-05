package br.com.buono.teamControl.model;

import br.com.buono.teamControl.enums.GenderEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Data
@Entity
@Builder
public class Player implements Serializable {

    @Id
    @GeneratedValue(strategy=SEQUENCE, generator="PLAYER_SEQ")
    @Column(name = "id", nullable = false)
    private Long Id;

    private String name;

    private String cpf;

    private String phone;

    private Instant birth;

    private Team team;

    private List<Payment> payments;

    private GenderEnum gender;
}
