package com.stats.baseballStatsWS.dto;

public class VenueDto {

    private String name;
    private String market;
    private int capacity;
    private String surface;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String id;
    private String field_orientation;
    private String stadium_type;
    private LocationDto location;

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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getField_orientation() {
        return field_orientation;
    }

    public void setField_orientation(String field_orientation) {
        this.field_orientation = field_orientation;
    }

    public String getStadium_type() {
        return stadium_type;
    }

    public void setStadium_type(String stadium_type) {
        this.stadium_type = stadium_type;
    }

    public LocationDto getLocation() {
        return location;
    }

    public void setLocation(LocationDto location) {
        this.location = location;
    }
}
