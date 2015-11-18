package com.oleg.tripcomposer.response.dto;

public class CityDto {

    private String cityName;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(final String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "CityDto{" + "cityName='" + cityName + '\'' + '}';
    }
}
