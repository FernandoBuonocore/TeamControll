package br.com.buono.teamControl.http;

import br.com.buono.teamControl.dto.UserDto;
import br.com.buono.teamControl.http.api.UsuarioApi;
import br.com.buono.teamControl.model.Usuario;
import br.com.buono.teamControl.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users", produces = "application/json")
public class UsuarioController implements UsuarioApi {

    @Autowired
    private UsuarioService usuarioService;

    @Override
    @GetMapping("/{id}")
    public boolean getValidate(@PathVariable int id) {
        return true;
    }

    @Override
    @PostMapping(value = "/create", consumes="application/json")
    public Long created(@RequestBody UserDto userDto) {
        Usuario usuario = new Usuario(userDto.getLogin(), userDto.getName());
        return usuarioService.save(usuario);
    }

}
