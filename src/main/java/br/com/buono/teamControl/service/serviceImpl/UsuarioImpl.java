package br.com.buono.teamControl.service.serviceImpl;

import br.com.buono.teamControl.daoImpl.UsuarioRepository;
import br.com.buono.teamControl.model.Usuario;
import br.com.buono.teamControl.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public boolean userValidate(Long id) {
        return false;
    }

    @Override
    public Long save(Usuario user) {
        return usuarioRepository.save(user).getId();
    }

    @Override
    public List<Usuario> usersPendents() {
        return null;
    }
}
