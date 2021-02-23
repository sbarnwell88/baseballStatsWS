package com.stats.baseballStatsWS.dto;

import java.util.List;

public class TotalSplitHitting {

    private List<SplitsHittingDto> total;
    private List<MonthSplitsHittingDto> month;
    private List<MonthSplitsHittingDto> home_away;
    private List<MonthSplitsHittingDto> pitcher_hand;
    private List<OpponentSplitsDto> opponent;

    public List<MonthSplitsHittingDto> getHome_away() {
        return home_away;
    }

    public void setHome_away(List<MonthSplitsHittingDto> home_away) {
        this.home_away = home_away;
    }

    public List<MonthSplitsHittingDto> getPitcher_hand() {
        return pitcher_hand;
    }

    public void setPitcher_hand(List<MonthSplitsHittingDto> pitcher_hand) {
        this.pitcher_hand = pitcher_hand;
    }

    public List<OpponentSplitsDto> getOpponent() {
        return opponent;
    }

    public void setOpponent(List<OpponentSplitsDto> opponent) {
        this.opponent = opponent;
    }

    public List<MonthSplitsHittingDto> getMonth() {
        return month;
    }

    public void setMonth(List<MonthSplitsHittingDto> month) {
        this.month = month;
    }

    public List<SplitsHittingDto> getTotal() {
        return total;
    }

    public void setTotal(List<SplitsHittingDto> total) {
        this.total = total;
    }
}
