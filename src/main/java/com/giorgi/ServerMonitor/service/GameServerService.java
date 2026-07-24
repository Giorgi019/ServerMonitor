package com.giorgi.ServerMonitor.service;

import com.giorgi.ServerMonitor.model.GameServer;
import com.giorgi.ServerMonitor.repository.GameServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    public GameServer updateServerLatency(Long id, Integer newLatency){
        GameServer server = repository.findById(id).orElseThrow();
        server.setLatency(newLatency);
        return repository.save(server);
    }

    public void deleteServer(Long id){
        repository.deleteById(id);
    }

    public List<GameServer> getServerByStatus(Boolean status){
        return repository.findByStatus(status);
    }

    public GameServer getServerById(Long id){
        return repository.findById(id).orElseThrow();
    }
}
