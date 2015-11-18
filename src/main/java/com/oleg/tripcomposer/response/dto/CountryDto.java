package com.oleg.tripcomposer.response.dto;


import java.util.List;

public class CountryDto {

    private List<CityDto> cities;
    private String countryName;
    private String countryISOCode;

    public List<CityDto> getCities() {
        return cities;
    }

    public void setCities(final List<CityDto> cities) {
        this.cities = cities;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(final String countryName) {
        this.countryName = countryName;
    }

    public String getCountryISOCode() {
        return countryISOCode;
    }

    public void setCountryISOCode(final String countryISOCode) {
        this.countryISOCode = countryISOCode;
    }

    @Override
    public String toString() {
        return "CountryDto{" + "cities=" + cities + ", countryName='" + countryName + '\'' + ", countryISOCode='"
                + countryISOCode + '\'' + '}';
    }
}
