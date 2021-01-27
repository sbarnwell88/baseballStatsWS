package com.stats.baseballStatsWS.dto;

import java.util.List;

public class OverallPitchingSplits {

    private List<TotalSplitPitching> overall;
    private List<TotalSplitPitching> starters;

    public List<TotalSplitPitching> getStarters() {
        return starters;
    }

    public void setStarters(List<TotalSplitPitching> starters) {
        this.starters = starters;
    }

    public List<TotalSplitPitching> getOverall() {
        return overall;
    }

    public void setOverall(List<TotalSplitPitching> overall) {
        this.overall = overall;
    }
}
