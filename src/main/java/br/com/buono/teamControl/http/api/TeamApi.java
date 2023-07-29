package br.com.buono.teamControl.http.api;

import br.com.buono.teamControl.dto.TeamDto;
import br.com.buono.teamControl.model.Team;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping
public interface TeamApi {


    @ApiOperation(value = "Busca Times")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Busca Times")
    })
    public List<Team> getTeams(@PathVariable TeamDto team);
}
