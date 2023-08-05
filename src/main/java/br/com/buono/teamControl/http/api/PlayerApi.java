package br.com.buono.teamControl.http.api;

import br.com.buono.teamControl.dto.PlayerDto;
import br.com.buono.teamControl.dto.UserDto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface PlayerApi {

    @ApiOperation(value = "criar um jogador")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "player created")
    })
    public Long created(@RequestBody PlayerDto userDto);
}
