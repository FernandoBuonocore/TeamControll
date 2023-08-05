package br.com.buono.teamControl.daoImpl;

import br.com.buono.teamControl.model.Player;
import br.com.buono.teamControl.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {


}
