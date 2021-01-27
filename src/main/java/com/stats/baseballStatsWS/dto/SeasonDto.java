package com.stats.baseballStatsWS.dto;

import java.io.Serializable;
import java.util.List;

public class SeasonDto implements Serializable {

    private String id;
    private int year;
    private String type;
    private StatisticsPitchMetricsTotals totals;
    private List<StatisticsPitchMetricsTotals> teams;

    public List<StatisticsPitchMetricsTotals> getTeams() {
        return teams;
    }

    public void setTeams(List<StatisticsPitchMetricsTotals> teams) {
        this.teams = teams;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public StatisticsPitchMetricsTotals getTotals() {
        return totals;
    }

    public void setTotals(StatisticsPitchMetricsTotals totals) {
        this.totals = totals;
    }
}
