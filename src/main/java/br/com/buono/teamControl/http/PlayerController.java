package br.com.buono.teamControl.http;

import br.com.buono.teamControl.dto.PlayerDto;
import br.com.buono.teamControl.dto.UserDto;
import br.com.buono.teamControl.http.api.PlayerApi;
import br.com.buono.teamControl.http.api.UsuarioApi;
import br.com.buono.teamControl.model.Usuario;
import br.com.buono.teamControl.service.PlayerService;
import br.com.buono.teamControl.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/players", produces = "application/json")
public class PlayerController implements PlayerApi {

    @Autowired
    private PlayerService playerService;

    @Override
    @PostMapping(value = "/create", consumes="application/json")
    public Long created(@RequestBody PlayerDto playerDto) {
        return playerService.save(playerDto);
    }

}
