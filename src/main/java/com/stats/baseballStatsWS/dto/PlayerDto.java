package com.stats.baseballStatsWS.dto;

import java.io.Serializable;
import java.util.List;

public class PlayerDto implements Serializable {

    private String id;
    private String status;
    private String position;
    private String primary_position;
    private String first_name;
    private String last_name;
    private String preferred_name;
    private String jersey_number;
    private String full_name;
    private String height;
    private String weight;
    private String throw_hand;
    private String bat_hand;
    private String birthdate;
    private String birthcountry;
    private String birthcity;
    private String pro_debut;
    private String updated;
    private String reference;
    private boolean active;
    private DraftDto draft;
    private TeamDto team;
    private List<SeasonDto> seasons;

    public DraftDto getDraft() {
        return draft;
    }

    public void setDraft(DraftDto draft) {
        this.draft = draft;
    }

    public TeamDto getTeam() {
        return team;
    }

    public void setTeam(TeamDto team) {
        this.team = team;
    }

    public List<SeasonDto> getSeasons() {
        return seasons;
    }

    public void setSeasons(List<SeasonDto> seasons) {
        this.seasons = seasons;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPrimary_position() {
        return primary_position;
    }

    public void setPrimary_position(String primary_position) {
        this.primary_position = primary_position;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPreferred_name() {
        return preferred_name;
    }

    public void setPreferred_name(String preferred_name) {
        this.preferred_name = preferred_name;
    }

    public String getJersey_number() {
        return jersey_number;
    }

    public void setJersey_number(String jersey_number) {
        this.jersey_number = jersey_number;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getThrow_hand() {
        return throw_hand;
    }

    public void setThrow_hand(String throw_hand) {
        this.throw_hand = throw_hand;
    }

    public String getBat_hand() {
        return bat_hand;
    }

    public void setBat_hand(String bat_hand) {
        this.bat_hand = bat_hand;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getBirthcountry() {
        return birthcountry;
    }

    public void setBirthcountry(String birthcountry) {
        this.birthcountry = birthcountry;
    }

    public String getBirthcity() {
        return birthcity;
    }

    public void setBirthcity(String birthcity) {
        this.birthcity = birthcity;
    }

    public String getPro_debut() {
        return pro_debut;
    }

    public void setPro_debut(String pro_debut) {
        this.pro_debut = pro_debut;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
