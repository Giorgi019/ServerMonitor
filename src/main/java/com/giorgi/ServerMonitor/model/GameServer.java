package com.giorgi.ServerMonitor.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "game_servers")
public class GameServer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String gameName;
    @NotBlank
    private String ipAddress;
    @Min(0)
    private Integer latency;
    private Boolean status;

}
