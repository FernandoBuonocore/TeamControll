package br.com.buono.teamControl.service.serviceImpl;

import br.com.buono.teamControl.daoImpl.UsuarioRepository;
import br.com.buono.teamControl.model.Usuario;
import br.com.buono.teamControl.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UsuarioImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public boolean userValidate(Long id) {
        return false;
    }

    @Override
    public List<Usuario> usersPendents() {
        return null;
    }
}
