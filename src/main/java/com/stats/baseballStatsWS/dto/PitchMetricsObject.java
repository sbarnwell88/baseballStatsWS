package com.stats.baseballStatsWS.dto;

public class PitchMetricsObject {

    private PitchMetricsDto pitch_metrics;
    private PitchingDto pitching;
    private HittingDto hitting;

    public HittingDto getHitting() {
        return hitting;
    }

    public void setHitting(HittingDto hitting) {
        this.hitting = hitting;
    }

    public PitchingDto getPitching() {
        return pitching;
    }

    public void setPitching(PitchingDto pitching) {
        this.pitching = pitching;
    }

    public PitchMetricsDto getPitch_metrics() {
        return pitch_metrics;
    }

    public void setPitch_metrics(PitchMetricsDto pitch_metrics) {
        this.pitch_metrics = pitch_metrics;
    }
}
