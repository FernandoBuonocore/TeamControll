package br.com.buono.teamControl.http.api;

import br.com.buono.teamControl.dto.UserDto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface UsuarioApi {

    @ApiOperation(value = "Valida o usuario")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "user validate")
    })
    public boolean getValidate(@PathVariable int id);

    @ApiOperation(value = "criar um usuario")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "created user")
    })
    public Long created(@RequestBody UserDto userDto);
}
