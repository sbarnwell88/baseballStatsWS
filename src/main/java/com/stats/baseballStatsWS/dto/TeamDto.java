package com.stats.baseballStatsWS.dto;

import java.io.Serializable;
import java.util.List;

public class TeamDto implements Serializable {

    private String name;
    private String market;
    private String abbr;
    private String id;
    private VenueDto venue;
    private LeagueDto league;
    private DivisionDto division;
    private List<StaffDto> staff;
    private List<PlayerDto> players;
    private String _comment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VenueDto getVenue() {
        return venue;
    }

    public void setVenue(VenueDto venue) {
        this.venue = venue;
    }

    public LeagueDto getLeague() {
        return league;
    }

    public void setLeague(LeagueDto league) {
        this.league = league;
    }

    public DivisionDto getDivision() {
        return division;
    }

    public void setDivision(DivisionDto division) {
        this.division = division;
    }

    public List<StaffDto> getStaff() {
        return staff;
    }

    public void setStaff(List<StaffDto> staff) {
        this.staff = staff;
    }

    public List<PlayerDto> getPlayers() {
        return players;
    }

    public void setPlayers(List<PlayerDto> players) {
        this.players = players;
    }

    public String get_comment() {
        return _comment;
    }

    public void set_comment(String _comment) {
        this._comment = _comment;
    }
}
