package com.teammatch.service;

import com.teammatch.model.Player;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface PlayerService {
    ResponseEntity<?> deletePlayer(Long playerId);
    Player updatePlayer(Long playerId, Player playerRequest);
    Player createPlayer(Player player);
    Player getPlayerById(Long playerId);
    Page<Player> getAllPlayers(Pageable pageable);
}
