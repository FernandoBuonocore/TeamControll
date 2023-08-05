package br.com.buono.teamControl.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Data
public class Payment implements Serializable {

    @Id
    @GeneratedValue(strategy=SEQUENCE, generator="PAYMENT_SEQ")
    @Column(name = "id", nullable = false)
    private Long Id;

    private String competence;

    private Double value;

}
