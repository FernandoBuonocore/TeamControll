package br.com.buono.teamControl.service;

import br.com.buono.teamControl.dto.TeamDto;
import br.com.buono.teamControl.model.Team;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TeamService {

    public List<Team> findAll(TeamDto teamDto);
}
