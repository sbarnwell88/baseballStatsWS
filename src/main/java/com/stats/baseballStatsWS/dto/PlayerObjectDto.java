package com.stats.baseballStatsWS.dto;

import java.io.Serializable;

public class PlayerObjectDto implements Serializable {

    private PlayerDto player;

    public PlayerDto getPlayer() {
        return player;
    }

    public void setPlayer(PlayerDto player) {
        this.player = player;
    }
}
