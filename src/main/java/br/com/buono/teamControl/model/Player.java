package br.com.buono.teamControl.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

@Data
@Entity
public class Player implements Serializable {

    @Id
    private Long Id;

    private String name;

    private Instant birth;

    private List<Payment> payments;
}
