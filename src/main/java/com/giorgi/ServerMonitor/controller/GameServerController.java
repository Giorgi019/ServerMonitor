package com.giorgi.ServerMonitor.controller;

import com.giorgi.ServerMonitor.model.GameServer;
import com.giorgi.ServerMonitor.service.GameServerService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/servers")
public class GameServerController {

    @Autowired
    private GameServerService service;

    @PostMapping
    public GameServer createServer(@Valid @RequestBody GameServer server){
        return service.addServer(server);
    }

    @GetMapping
    public Page<GameServer> getServers(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size){
        return service.getAllServers(page, size);
    }
    @PutMapping("/{id}/latency")
    public GameServer updateServerLatency(@PathVariable Long id, @RequestParam Integer latency){
        return service.updateServerLatency(id, latency);
    }

    @DeleteMapping("/{id}")
    public void deleteServer(@PathVariable Long id){
        service.deleteServer(id);
    }

    @GetMapping("/status/{status}")
    public List<GameServer> getServerStatus(@PathVariable Boolean status){
        return service.getServerByStatus(status);
    }

    @GetMapping("/{id}")
    public GameServer getServerById(@PathVariable Long id){
        return service.getServerById(id);
    }
}
