package br.com.buono.teamControl.service;

import br.com.buono.teamControl.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioService {

    public boolean userValidate(Long id);

    public List<Usuario> usersPendents();

}
