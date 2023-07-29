package br.com.buono.teamControl.http.api;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface UsuarioApi {

    @ApiOperation(value = "Valida o usuario")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Valida o usuario")
    })
    public boolean getValidate(@PathVariable int id);
}
