package br.com.buono.teamControl.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Getter
@AllArgsConstructor
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy=SEQUENCE, generator="USUARIO_SEQ")
    @Column(name = "id", nullable = false)
    private Long id;

    private String login;

    private String nomeCompleto;

    public Usuario(String login, String name) {
        this.login = login;
        this.nomeCompleto = name;
    }
}
