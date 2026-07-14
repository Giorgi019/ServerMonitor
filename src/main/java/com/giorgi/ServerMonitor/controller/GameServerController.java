package com.giorgi.ServerMonitor.controller;

import com.giorgi.ServerMonitor.model.GameServer;
import com.giorgi.ServerMonitor.service.GameServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/servers")
public class GameServerController {

    @Autowired
    private GameServerService service;

    @PostMapping
    public GameServer createServer(@RequestBody GameServer server){
        return service.addServer(server);
    }

    @GetMapping
    public List<GameServer> getServers(){
        return service.getAllServers();
    }

}
