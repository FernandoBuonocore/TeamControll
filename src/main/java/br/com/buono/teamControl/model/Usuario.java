package br.com.buono.teamControl.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Usuario {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String login;

    private String nomeCompleto;


}
