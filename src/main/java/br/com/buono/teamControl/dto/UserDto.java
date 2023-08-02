package br.com.buono.teamControl.dto;

import lombok.Data;

@Data
public class UserDto{

    private Long id;
    private String login;
    private String name;
/*
    public UserDto(String login, String name){
        this.login = login;
        this.name = name;
    }*/

}
