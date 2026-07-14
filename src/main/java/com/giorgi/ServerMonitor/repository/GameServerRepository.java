package com.giorgi.ServerMonitor.repository;

import com.giorgi.ServerMonitor.model.GameServer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameServerRepository extends JpaRepository<GameServer, Long> {

}
