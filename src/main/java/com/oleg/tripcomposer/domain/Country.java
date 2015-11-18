package com.oleg.tripcomposer.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name = "COUNTRY")
public class Country implements Serializable {

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<City> cities = new ArrayList<City>();
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;
    @Column(name = "COUNTRY_NAME")
    private String countryName;
    @Column(name = "COUNTRY_ISO_CODE")
    private String countryISOCode;

    public Country() {}

    public Country(String countryName, String countryISOCode, List<City> cities) {
        this.countryName = countryName;
        this.countryISOCode = countryISOCode;
        this.cities = cities;
    }


    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public List<City> getCities() {
        return Collections.unmodifiableList(cities);
    }

    public String getCountryISOCode() {
        return countryISOCode;
    }

    public void setCountryISOCode(String countryISOCode) {
        this.countryISOCode = countryISOCode;
    }

    @Override
    public String toString() {
        return "CountryDto{" + "id=" + id + ", countryName='" + countryName + '\'' + ", countryISOCode='"
                + countryISOCode + '\'' + ", cities=" + cities + '}';
    }
}
