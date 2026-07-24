package com.giorgi.ServerMonitor.repository;

import com.giorgi.ServerMonitor.model.GameServer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameServerRepository extends JpaRepository<GameServer, Long> {
    List<GameServer> findByStatus(Boolean status);

}
