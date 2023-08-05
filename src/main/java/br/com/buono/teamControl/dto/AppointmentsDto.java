package br.com.buono.teamControl.dto;

import lombok.Data;

import java.util.Date;

@Data
public class AppointmentsDto {

    private Date initAppointment;
    private Date endAppointment;
    private String local;
    private String obs;

}
