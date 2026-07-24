package com.giorgi.ServerMonitor.dto;

import com.giorgi.ServerMonitor.model.GameServer;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GameServerResponseDTO {

    private Long id;
    private String gameName;
    private String ipAddress;
    private Integer latency;
    private Boolean status;

    public static GameServerResponseDTO fromEntity(GameServer server){
        GameServerResponseDTO dto = new GameServerResponseDTO();
        dto.setId(server.getId());
        dto.setGameName(server.getGameName());
        dto.setIpAddress(server.getIpAddress());
        dto.setLatency(server.getLatency());
        dto.setStatus(server.getStatus());
        return dto;
    }
}
