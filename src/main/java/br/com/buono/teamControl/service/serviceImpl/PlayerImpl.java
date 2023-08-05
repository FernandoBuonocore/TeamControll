package br.com.buono.teamControl.service.serviceImpl;

import br.com.buono.teamControl.daoImpl.PlayerRepository;
import br.com.buono.teamControl.daoImpl.TeamRepository;
import br.com.buono.teamControl.dto.PlayerDto;
import br.com.buono.teamControl.dto.TeamDto;
import br.com.buono.teamControl.model.Player;
import br.com.buono.teamControl.model.Team;
import br.com.buono.teamControl.service.PlayerService;
import br.com.buono.teamControl.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public Long save(PlayerDto playerDto) {
        Player player = Player.builder().
                name(playerDto.getName()).
                birth(playerDto.getDateOfBirth()).
                gender(playerDto.getGenderEnum()).build();
        return playerRepository.save(player).getId();
    }
}
