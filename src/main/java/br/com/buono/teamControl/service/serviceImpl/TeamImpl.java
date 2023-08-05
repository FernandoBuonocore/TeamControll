package br.com.buono.teamControl.service.serviceImpl;

import br.com.buono.teamControl.daoImpl.TeamRepository;
import br.com.buono.teamControl.dto.TeamDto;
import br.com.buono.teamControl.model.Team;
import br.com.buono.teamControl.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class TeamImpl implements TeamService {

    @Autowired
    private TeamRepository teamRepository;

    @Override
    public List<Team> findAll(TeamDto teamDto) {
        return null;
    }

    @Override
    public Long save(TeamDto teamDto) {
        Team team = Team.builder().
                teamName(teamDto.getName()).
                city(teamDto.getCity()).
                foundationDate(teamDto.getFoundationDate()).
                modality(teamDto.getModality()).build();
        return teamRepository.save(team).getId();
    }
}
