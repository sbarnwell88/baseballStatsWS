package com.stats.baseballStatsWS.dto;

public class PitchingDto {

    private OverallPitchingDto overall;
    private OverallPitchingDto starters;

    public OverallPitchingDto getStarters() {
        return starters;
    }

    public void setStarters(OverallPitchingDto starters) {
        this.starters = starters;
    }

    public OverallPitchingDto getOverall() {
        return overall;
    }

    public void setOverall(OverallPitchingDto overall) {
        this.overall = overall;
    }
}
