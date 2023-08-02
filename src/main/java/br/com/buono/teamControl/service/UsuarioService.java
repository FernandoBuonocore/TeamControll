package br.com.buono.teamControl.service;

import br.com.buono.teamControl.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UsuarioService {

    public boolean userValidate(Long id);

    public Long save(Usuario user);

    public List<Usuario> usersPendents();

}
