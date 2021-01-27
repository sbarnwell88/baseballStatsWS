package com.stats.baseballStatsWS.dto;

import java.util.List;

public class PitcherDataDto {

    private int pitchCount;
    private String name;
    private List<PitchTypeDto> pitchTypes;
    private List<HitterHandSplits> hitterHand;
    private List<MonthSplitsDto> homeAway;
    private List<OpponentSplitsDto> opponentStats;
    private String opponentName;
    private List<LastStartSplitsDto> lastStarts;
    private OverallPitchingDto overallStats;
    private List<MonthSplitsDto> months;

    public List<MonthSplitsDto> getMonths() {
        return months;
    }

    public void setMonths(List<MonthSplitsDto> months) {
        this.months = months;
    }

    public OverallPitchingDto getOverallStats() {
        return overallStats;
    }

    public void setOverallStats(OverallPitchingDto overallStats) {
        this.overallStats = overallStats;
    }

    public List<LastStartSplitsDto> getLastStarts() {
        return lastStarts;
    }

    public void setLastStarts(List<LastStartSplitsDto> lastStarts) {
        this.lastStarts = lastStarts;
    }

    public String getOpponentName() {
        return opponentName;
    }

    public void setOpponentName(String opponentName) {
        this.opponentName = opponentName;
    }

    public List<OpponentSplitsDto> getOpponentStats() {
        return opponentStats;
    }

    public void setOpponentStats(List<OpponentSplitsDto> opponentStats) {
        this.opponentStats = opponentStats;
    }

    public List<MonthSplitsDto> getHomeAway() {
        return homeAway;
    }

    public void setHomeAway(List<MonthSplitsDto> homeAway) {
        this.homeAway = homeAway;
    }

    public List<HitterHandSplits> getHitterHand() {
        return hitterHand;
    }

    public void setHitterHand(List<HitterHandSplits> hitterHand) {
        this.hitterHand = hitterHand;
    }

    public int getPitchCount() {
        return pitchCount;
    }

    public void setPitchCount(int pitchCount) {
        this.pitchCount = pitchCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PitchTypeDto> getPitchTypes() {
        return pitchTypes;
    }

    public void setPitchTypes(List<PitchTypeDto> pitchTypes) {
        this.pitchTypes = pitchTypes;
    }
}
