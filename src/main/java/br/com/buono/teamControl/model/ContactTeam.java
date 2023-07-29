package br.com.buono.teamControl.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import java.io.Serializable;

@Entity
@Data
public class ContactTeam implements Serializable {

    @Id
    private Long Id;

    private String name;

    private String phone;

    private String office;
}
