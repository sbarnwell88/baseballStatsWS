package com.stats.baseballStatsWS.dto;

import java.util.List;

public class HitterDataDto {

    private String name;
    private List<OpponentSplitsDto> opponentStats;
    private String opponentName;
    private float risp;
    private float avg;
    private int hr;
    private List<MonthSplitsHittingDto> pitcher_hand;
    private int rbi2Out;
    private int leftOnBase;
    private int rbi;
    private int extraBaseHit;
    private int lobRisp2Out;
    private List<MonthSplitsHittingDto> months;
    private List<MonthSplitsHittingDto> homeAway;
    private int flyOuts;
    private int flyOutsIntoDoublePlays;
    private int flyBalls;
    private int groundBall;
    private int groundOuts;
    private int groundedIntoDoublePlay;
    private int hitsWithRisp;
    private float isolatedPower;
    private int lineDrive;
    private int lineOut;
    private int lineOutsIntoDoublePlay;
    private float onBasePercentage;
    private int popOuts;
    private int popUps;
    private float sluggingPercentage;
    private int strikeoutsLooking;
    private int strikesLooking;
    private int strikesSwinging;
    private int strikeoutsSwinging;
    private int walks;
    private float walksPerPlateAppearance;
    private int atBats;
    private int hits;
    private int doubles;
    private int triples;
    private String linkForBrooksBaseball;

    public String getLinkForBrooksBaseball() {
        return linkForBrooksBaseball;
    }

    public void setLinkForBrooksBaseball(String linkForBrooksBaseball) {
        this.linkForBrooksBaseball = linkForBrooksBaseball;
    }

    public int getDoubles() {
        return doubles;
    }

    public void setDoubles(int doubles) {
        this.doubles = doubles;
    }

    public int getTriples() {
        return triples;
    }

    public void setTriples(int triples) {
        this.triples = triples;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getAtBats() {
        return atBats;
    }

    public void setAtBats(int atBats) {
        this.atBats = atBats;
    }

    public int getStrikeoutsSwinging() {
        return strikeoutsSwinging;
    }

    public void setStrikeoutsSwinging(int strikeoutsSwinging) {
        this.strikeoutsSwinging = strikeoutsSwinging;
    }

    public int getFlyOuts() {
        return flyOuts;
    }

    public void setFlyOuts(int flyOuts) {
        this.flyOuts = flyOuts;
    }

    public int getFlyOutsIntoDoublePlays() {
        return flyOutsIntoDoublePlays;
    }

    public void setFlyOutsIntoDoublePlays(int flyOutsIntoDoublePlays) {
        this.flyOutsIntoDoublePlays = flyOutsIntoDoublePlays;
    }

    public int getFlyBalls() {
        return flyBalls;
    }

    public void setFlyBalls(int flyBalls) {
        this.flyBalls = flyBalls;
    }

    public int getGroundBall() {
        return groundBall;
    }

    public void setGroundBall(int groundBall) {
        this.groundBall = groundBall;
    }

    public int getGroundOuts() {
        return groundOuts;
    }

    public void setGroundOuts(int groundOuts) {
        this.groundOuts = groundOuts;
    }

    public int getGroundedIntoDoublePlay() {
        return groundedIntoDoublePlay;
    }

    public void setGroundedIntoDoublePlay(int groundedIntoDoublePlay) {
        this.groundedIntoDoublePlay = groundedIntoDoublePlay;
    }

    public int getHitsWithRisp() {
        return hitsWithRisp;
    }

    public void setHitsWithRisp(int hitsWithRisp) {
        this.hitsWithRisp = hitsWithRisp;
    }

    public float getIsolatedPower() {
        return isolatedPower;
    }

    public void setIsolatedPower(float isolatedPower) {
        this.isolatedPower = isolatedPower;
    }

    public int getLineDrive() {
        return lineDrive;
    }

    public void setLineDrive(int lineDrive) {
        this.lineDrive = lineDrive;
    }

    public int getLineOut() {
        return lineOut;
    }

    public void setLineOut(int lineOut) {
        this.lineOut = lineOut;
    }

    public int getLineOutsIntoDoublePlay() {
        return lineOutsIntoDoublePlay;
    }

    public void setLineOutsIntoDoublePlay(int lineOutsIntoDoublePlay) {
        this.lineOutsIntoDoublePlay = lineOutsIntoDoublePlay;
    }

    public float getOnBasePercentage() {
        return onBasePercentage;
    }

    public void setOnBasePercentage(float onBasePercentage) {
        this.onBasePercentage = onBasePercentage;
    }

    public int getPopOuts() {
        return popOuts;
    }

    public void setPopOuts(int popOuts) {
        this.popOuts = popOuts;
    }

    public int getPopUps() {
        return popUps;
    }

    public void setPopUps(int popUps) {
        this.popUps = popUps;
    }

    public float getSluggingPercentage() {
        return sluggingPercentage;
    }

    public void setSluggingPercentage(float sluggingPercentage) {
        this.sluggingPercentage = sluggingPercentage;
    }

    public int getStrikeoutsLooking() {
        return strikeoutsLooking;
    }

    public void setStrikeoutsLooking(int strikeoutsLooking) {
        this.strikeoutsLooking = strikeoutsLooking;
    }

    public int getStrikesLooking() {
        return strikesLooking;
    }

    public void setStrikesLooking(int strikesLooking) {
        this.strikesLooking = strikesLooking;
    }

    public int getStrikesSwinging() {
        return strikesSwinging;
    }

    public void setStrikesSwinging(int strikesSwinging) {
        this.strikesSwinging = strikesSwinging;
    }

    public int getWalks() {
        return walks;
    }

    public void setWalks(int walks) {
        this.walks = walks;
    }

    public float getWalksPerPlateAppearance() {
        return walksPerPlateAppearance;
    }

    public void setWalksPerPlateAppearance(float walksPerPlateAppearance) {
        this.walksPerPlateAppearance = walksPerPlateAppearance;
    }

    public List<MonthSplitsHittingDto> getHomeAway() {
        return homeAway;
    }

    public void setHomeAway(List<MonthSplitsHittingDto> homeAway) {
        this.homeAway = homeAway;
    }

    public List<MonthSplitsHittingDto> getMonths() {
        return months;
    }

    public void setMonths(List<MonthSplitsHittingDto> months) {
        this.months = months;
    }

    public int getLeftOnBase() {
        return leftOnBase;
    }

    public void setLeftOnBase(int leftOnBase) {
        this.leftOnBase = leftOnBase;
    }

    public int getRbi() {
        return rbi;
    }

    public void setRbi(int rbi) {
        this.rbi = rbi;
    }

    public int getExtraBaseHit() {
        return extraBaseHit;
    }

    public void setExtraBaseHit(int extraBaseHit) {
        this.extraBaseHit = extraBaseHit;
    }

    public int getLobRisp2Out() {
        return lobRisp2Out;
    }

    public void setLobRisp2Out(int lobRisp2Out) {
        this.lobRisp2Out = lobRisp2Out;
    }

    public int getRbi2Out() {
        return rbi2Out;
    }

    public void setRbi2Out(int rbi2Out) {
        this.rbi2Out = rbi2Out;
    }

    public List<MonthSplitsHittingDto> getPitcher_hand() {
        return pitcher_hand;
    }

    public void setPitcher_hand(List<MonthSplitsHittingDto> pitcher_hand) {
        this.pitcher_hand = pitcher_hand;
    }

    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    public float getRisp() {
        return risp;
    }

    public void setRisp(float risp) {
        this.risp = risp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<OpponentSplitsDto> getOpponentStats() {
        return opponentStats;
    }

    public void setOpponentStats(List<OpponentSplitsDto> opponentStats) {
        this.opponentStats = opponentStats;
    }

    public String getOpponentName() {
        return opponentName;
    }

    public void setOpponentName(String opponentName) {
        this.opponentName = opponentName;
    }
}
