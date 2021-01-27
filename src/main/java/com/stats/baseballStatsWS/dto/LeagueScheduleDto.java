package com.stats.baseballStatsWS.dto;

import java.io.Serializable;
import java.util.List;

public class LeagueScheduleDto implements Serializable {

    private LeagueDto league;
    private SeasonDto season;
    private List<GamesDto> games;

    public LeagueDto getLeague() {
        return league;
    }

    public void setLeague(LeagueDto league) {
        this.league = league;
    }

    public SeasonDto getSeason() {
        return season;
    }

    public void setSeason(SeasonDto season) {
        this.season = season;
    }

    public List<GamesDto> getGames() {
        return games;
    }

    public void setGames(List<GamesDto> games) {
        this.games = games;
    }
}
