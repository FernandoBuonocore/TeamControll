package br.com.buono.teamControl.service.serviceImpl;

import br.com.buono.teamControl.daoImpl.AppointmentsRepository;
import br.com.buono.teamControl.dto.AppointmentsDto;
import br.com.buono.teamControl.model.Appointment;
import br.com.buono.teamControl.service.AppointmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentsImpl implements AppointmentsService {

    @Autowired
    private AppointmentsRepository appointmentsRepository;

    @Override
    public Long save(AppointmentsDto appointmentsDto) {
        Appointment appointments = Appointment.builder().
                local(appointmentsDto.getLocal()).
                initAppointment(appointmentsDto.getInitAppointment()).
                endAppointment(appointmentsDto.getEndAppointment()).
                obs(appointmentsDto.getObs()).build();
        return appointmentsRepository.save(appointments).getId();
    }
}
