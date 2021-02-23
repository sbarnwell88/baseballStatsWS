package com.stats.baseballStatsWS.dto;

public class StealDto {

    private int caught;
    private int stolen;
    private int pickoff;
    private float pct;

    public float getPct() {
        return pct;
    }

    public void setPct(float pct) {
        this.pct = pct;
    }

    public int getCaught() {
        return caught;
    }

    public void setCaught(int caught) {
        this.caught = caught;
    }

    public int getStolen() {
        return stolen;
    }

    public void setStolen(int stolen) {
        this.stolen = stolen;
    }

    public int getPickoff() {
        return pickoff;
    }

    public void setPickoff(int pickoff) {
        this.pickoff = pickoff;
    }
}
