package br.com.buono.teamControl.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GenderEnum {

    MASC(1, "Masculino"),
    FEM(2, "Feminino"),
    NON(3, "Indefinido");

    private final int id;
    private final String desc;
}
