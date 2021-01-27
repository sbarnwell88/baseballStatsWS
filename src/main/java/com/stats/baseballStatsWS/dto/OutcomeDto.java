package com.stats.baseballStatsWS.dto;

public class OutcomeDto {

    private int klook;
    private int kswing;
    private int ktotal;
    private int foul;
    private int btotal;
    private int ball;
    private int iball;
    private int dirtball;

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

    public int getIball() {
        return iball;
    }

    public void setIball(int iball) {
        this.iball = iball;
    }

    public int getDirtball() {
        return dirtball;
    }

    public void setDirtball(int dirtball) {
        this.dirtball = dirtball;
    }

    public int getKlook() {
        return klook;
    }

    public void setKlook(int klook) {
        this.klook = klook;
    }

    public int getKswing() {
        return kswing;
    }

    public void setKswing(int kswing) {
        this.kswing = kswing;
    }

    public int getKtotal() {
        return ktotal;
    }

    public void setKtotal(int ktotal) {
        this.ktotal = ktotal;
    }

    public int getFoul() {
        return foul;
    }

    public void setFoul(int foul) {
        this.foul = foul;
    }

    public int getBtotal() {
        return btotal;
    }

    public void setBtotal(int btotal) {
        this.btotal = btotal;
    }
}
