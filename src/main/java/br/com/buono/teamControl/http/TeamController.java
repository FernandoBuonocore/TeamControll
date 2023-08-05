package br.com.buono.teamControl.http;

import br.com.buono.teamControl.dto.TeamDto;
import br.com.buono.teamControl.http.api.TeamApi;
import br.com.buono.teamControl.model.Team;
import br.com.buono.teamControl.service.TeamService;
import br.com.buono.teamControl.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/teams", produces = "application/json")
public class TeamController implements TeamApi {

    @Autowired
    private TeamService teamService;

    @Override
    public List<Team> getTeams(TeamDto team) {
        return null;
    }

    @Override
    @PostMapping(value = "/create", consumes="application/json")
    public Long created(TeamDto teamDto) {
        return this.teamService.save(teamDto);
    }
}
