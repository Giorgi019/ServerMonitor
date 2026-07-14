package com.giorgi.ServerMonitor.service;

import com.giorgi.ServerMonitor.model.GameServer;
import com.giorgi.ServerMonitor.repository.GameServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServerService {
    @Autowired
    private GameServerRepository repository;

    public GameServer addServer(GameServer server){
        return repository.save(server);
    }

    public List<GameServer> getAllServers(){
        return repository.findAll();
    }

}
