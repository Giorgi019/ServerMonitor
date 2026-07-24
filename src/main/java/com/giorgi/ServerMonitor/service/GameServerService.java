package com.giorgi.ServerMonitor.service;

import com.giorgi.ServerMonitor.model.GameServer;
import com.giorgi.ServerMonitor.repository.GameServerRepository;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServerService {
    @Autowired
    private GameServerRepository repository;

    public GameServer addServer(GameServer server){
        return repository.save(server);
    }

    public Page<GameServer> getAllServers(Integer pageNumber, Integer pageSize){
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        return repository.findAll(pageable);
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
