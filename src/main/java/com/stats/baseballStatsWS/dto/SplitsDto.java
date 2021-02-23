package com.stats.baseballStatsWS.dto;

public class SplitsDto {

    private OverallPitchingSplits pitching;
    private OverallHittingSplits hitting;

    public OverallHittingSplits getHitting() {
        return hitting;
    }

    public void setHitting(OverallHittingSplits hitting) {
        this.hitting = hitting;
    }

    public OverallPitchingSplits getPitching() {
        return pitching;
    }

    public void setPitching(OverallPitchingSplits pitching) {
        this.pitching = pitching;
    }
}
