package com.stats.baseballStatsWS.dto;

public class GamesDto {

    private String id;
    private String status;
    private String coverage;
    private int game_number;
    private String day_night;
    private String scheduled;
    private String home_team;
    private String away_team;
    private int attendance;
    private String duration;
    private boolean double_header;
    private String entry_mode;
    private String reference;
    private VenueDto venue;
    private HomeDto home;
    private HomeDto away;
    private NetworkDto broadcast;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCoverage() {
        return coverage;
    }

    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }

    public int getGame_number() {
        return game_number;
    }

    public void setGame_number(int game_number) {
        this.game_number = game_number;
    }

    public String getDay_night() {
        return day_night;
    }

    public void setDay_night(String day_night) {
        this.day_night = day_night;
    }

    public String getScheduled() {
        return scheduled;
    }

    public void setScheduled(String scheduled) {
        this.scheduled = scheduled;
    }

    public String getHome_team() {
        return home_team;
    }

    public void setHome_team(String home_team) {
        this.home_team = home_team;
    }

    public String getAway_team() {
        return away_team;
    }

    public void setAway_team(String away_team) {
        this.away_team = away_team;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public boolean isDouble_header() {
        return double_header;
    }

    public void setDouble_header(boolean double_header) {
        this.double_header = double_header;
    }

    public String getEntry_mode() {
        return entry_mode;
    }

    public void setEntry_mode(String entry_mode) {
        this.entry_mode = entry_mode;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public VenueDto getVenue() {
        return venue;
    }

    public void setVenue(VenueDto venue) {
        this.venue = venue;
    }

    public HomeDto getHome() {
        return home;
    }

    public void setHome(HomeDto home) {
        this.home = home;
    }

    public HomeDto getAway() {
        return away;
    }

    public void setAway(HomeDto away) {
        this.away = away;
    }

    public NetworkDto getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(NetworkDto broadcast) {
        this.broadcast = broadcast;
    }
}
