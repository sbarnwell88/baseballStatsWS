package com.stats.baseballStatsWS.dto;

import java.util.List;

public class PitchMetricsDto {

    private OverallPitchMetrics overall;
    private List<PitchTypeDto> pitch_types;

    public OverallPitchMetrics getOverall() {
        return overall;
    }

    public void setOverall(OverallPitchMetrics overall) {
        this.overall = overall;
    }

    public List<PitchTypeDto> getPitch_types() {
        return pitch_types;
    }

    public void setPitch_types(List<PitchTypeDto> pitch_types) {
        this.pitch_types = pitch_types;
    }
}
