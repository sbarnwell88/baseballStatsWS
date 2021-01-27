package com.stats.baseballStatsWS.dto;

public class InPlayDto {

    private int linedrive;
    private int groundball;
    private int popup;
    private int flyball;

    public int getLinedrive() {
        return linedrive;
    }

    public void setLinedrive(int linedrive) {
        this.linedrive = linedrive;
    }

    public int getGroundball() {
        return groundball;
    }

    public void setGroundball(int groundball) {
        this.groundball = groundball;
    }

    public int getPopup() {
        return popup;
    }

    public void setPopup(int popup) {
        this.popup = popup;
    }

    public int getFlyball() {
        return flyball;
    }

    public void setFlyball(int flyball) {
        this.flyball = flyball;
    }
}
