package br.com.buono.teamControl.service;

import br.com.buono.teamControl.dto.TeamDto;
import br.com.buono.teamControl.model.Team;
import br.com.buono.teamControl.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TeamService {

    public List<Team> findAll(TeamDto teamDto);

    public Long save(TeamDto teamDto);
}
