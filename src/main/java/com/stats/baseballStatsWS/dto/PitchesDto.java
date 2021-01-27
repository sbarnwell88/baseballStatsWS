package com.stats.baseballStatsWS.dto;

public class PitchesDto {

    private int count;
    private int btotal;
    private int ktotal;
    private float per_ip;
    private float per_bf;
    private float per_start;

    public float getPer_start() {
        return per_start;
    }

    public void setPer_start(float per_start) {
        this.per_start = per_start;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getBtotal() {
        return btotal;
    }

    public void setBtotal(int btotal) {
        this.btotal = btotal;
    }

    public int getKtotal() {
        return ktotal;
    }

    public void setKtotal(int ktotal) {
        this.ktotal = ktotal;
    }

    public float getPer_ip() {
        return per_ip;
    }

    public void setPer_ip(float per_ip) {
        this.per_ip = per_ip;
    }

    public float getPer_bf() {
        return per_bf;
    }

    public void setPer_bf(float per_bf) {
        this.per_bf = per_bf;
    }
}
