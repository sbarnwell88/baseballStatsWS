package com.stats.baseballStatsWS.dto;

public class OverallPitchMetrics {

    private int count;
    private float avg_speed;
    private float min_speed;
    private float max_speed;
    private float gbfb;
    private OnbaseDto onbase;
    private OutcomeDto outcome;
    private OutcomeDto outs;
    private InPlayDto in_play;
    private SwingsDto swings;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public float getAvg_speed() {
        return avg_speed;
    }

    public void setAvg_speed(float avg_speed) {
        this.avg_speed = avg_speed;
    }

    public float getMin_speed() {
        return min_speed;
    }

    public void setMin_speed(float min_speed) {
        this.min_speed = min_speed;
    }

    public float getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(float max_speed) {
        this.max_speed = max_speed;
    }

    public float getGbfb() {
        return gbfb;
    }

    public void setGbfb(float gbfb) {
        this.gbfb = gbfb;
    }

    public OnbaseDto getOnbase() {
        return onbase;
    }

    public void setOnbase(OnbaseDto onbase) {
        this.onbase = onbase;
    }

    public OutcomeDto getOutcome() {
        return outcome;
    }

    public void setOutcome(OutcomeDto outcome) {
        this.outcome = outcome;
    }

    public OutcomeDto getOuts() {
        return outs;
    }

    public void setOuts(OutcomeDto outs) {
        this.outs = outs;
    }

    public InPlayDto getIn_play() {
        return in_play;
    }

    public void setIn_play(InPlayDto in_play) {
        this.in_play = in_play;
    }

    public SwingsDto getSwings() {
        return swings;
    }

    public void setSwings(SwingsDto swings) {
        this.swings = swings;
    }
}
