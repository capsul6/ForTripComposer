package com.oleg.tripcomposer.domain;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CITY")
public class City implements Serializable {

    @Id
    @Column(name = "CITY_ID")
    @GeneratedValue
    private Integer id;

    @Column(name = "CITY_NAME")
    private String cityName;

    @ManyToOne
    @JoinColumn(name = "ID")
    private Country country;

    public City() {}

    public City(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return cityName + " ";
    }
}
