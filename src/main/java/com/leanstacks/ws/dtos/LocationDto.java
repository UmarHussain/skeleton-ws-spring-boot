package com.leanstacks.ws.dtos;

public class LocationDto {
    /***
     *  "location": {
     "location": "Santiago",
     "region": "Santiago",
     "country": "Chile"
     }
     */

    private String location;
    private String region;
    private String country;


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
