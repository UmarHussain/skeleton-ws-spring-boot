package com.leanstacks.ws.model;

import javax.persistence.Entity;

@Entity
public class Location extends TransactionalEntity {

    private static final long serialVersionUID = 1L;

    private String city;
    private String country;
    private String region;


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
