package com.stats.baseballStatsWS.dto;

public class StatisticsPitchMetricsTotals {

    private PitchMetricsObject statistics;
    private SplitsDto splits;
    private String name;
    private String market;
    private String abbr;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SplitsDto getSplits() {
        return splits;
    }

    public void setSplits(SplitsDto splits) {
        this.splits = splits;
    }

    public PitchMetricsObject getStatistics() {
        return statistics;
    }

    public void setStatistics(PitchMetricsObject statistics) {
        this.statistics = statistics;
    }
}
