package com.stats.baseballStatsWS.dto;

public class BasicTeamDto {
    private String team;
    private String id;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BasicTeamDto(String team, String id) {
        this.team = team;
        this.id = id;
    }
}
