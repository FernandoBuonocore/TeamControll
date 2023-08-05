package br.com.buono.teamControl.service;

import br.com.buono.teamControl.dto.PlayerDto;
import br.com.buono.teamControl.model.Usuario;

import java.util.List;

public interface PlayerService {

    public Long save(PlayerDto playerDto);

}
