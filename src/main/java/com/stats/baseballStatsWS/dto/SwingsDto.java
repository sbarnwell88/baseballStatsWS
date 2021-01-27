package com.stats.baseballStatsWS.dto;

public class SwingsDto {

    private int total;
    private float swing_rate;
    private float strike_pct;
    private float whiff_rate;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public float getSwing_rate() {
        return swing_rate;
    }

    public void setSwing_rate(float swing_rate) {
        this.swing_rate = swing_rate;
    }

    public float getStrike_pct() {
        return strike_pct;
    }

    public void setStrike_pct(float strike_pct) {
        this.strike_pct = strike_pct;
    }

    public float getWhiff_rate() {
        return whiff_rate;
    }

    public void setWhiff_rate(float whiff_rate) {
        this.whiff_rate = whiff_rate;
    }
}
