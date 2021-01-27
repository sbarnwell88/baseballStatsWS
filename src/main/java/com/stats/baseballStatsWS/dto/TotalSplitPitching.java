package com.stats.baseballStatsWS.dto;

import java.util.List;

public class TotalSplitPitching {

    private List<SplitsPitchingDto> total;
    private List<MonthSplitsDto> month;
    private List<MonthSplitsDto> home_away;
    private List<HitterHandSplits> hitter_hand;
    private List<OpponentSplitsDto> opponent;
    private List<LastStartSplitsDto> last_start;
    private List<LastStartSplitsDto> last_starts;

    public List<LastStartSplitsDto> getLast_start() {
        return last_start;
    }

    public void setLast_start(List<LastStartSplitsDto> last_start) {
        this.last_start = last_start;
    }

    public List<LastStartSplitsDto> getLast_starts() {
        return last_starts;
    }

    public void setLast_starts(List<LastStartSplitsDto> last_starts) {
        this.last_starts = last_starts;
    }

    public List<OpponentSplitsDto> getOpponent() {
        return opponent;
    }

    public void setOpponent(List<OpponentSplitsDto> opponent) {
        this.opponent = opponent;
    }

    public List<HitterHandSplits> getHitter_hand() {
        return hitter_hand;
    }

    public void setHitter_hand(List<HitterHandSplits> hitter_hand) {
        this.hitter_hand = hitter_hand;
    }

    public List<MonthSplitsDto> getHome_away() {
        return home_away;
    }

    public void setHome_away(List<MonthSplitsDto> home_away) {
        this.home_away = home_away;
    }

    public List<MonthSplitsDto> getMonth() {
        return month;
    }

    public void setMonth(List<MonthSplitsDto> month) {
        this.month = month;
    }

    public List<SplitsPitchingDto> getTotal() {
        return total;
    }

    public void setTotal(List<SplitsPitchingDto> total) {
        this.total = total;
    }
}
