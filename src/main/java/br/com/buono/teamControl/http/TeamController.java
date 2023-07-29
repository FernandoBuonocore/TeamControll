package br.com.buono.teamControl.http;

import br.com.buono.teamControl.dto.TeamDto;
import br.com.buono.teamControl.http.api.TeamApi;
import br.com.buono.teamControl.model.Team;

import java.util.List;

public class TeamController implements TeamApi {

    @Override
    public List<Team> getTeams(TeamDto team) {
        return null;
    }
}
