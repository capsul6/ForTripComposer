package com.oleg.tripcomposer.response;

import com.oleg.tripcomposer.domain.Country;

import java.util.List;

public class Response {
    private Long time;
    private List<Country> countries;
    private String echo;

    public Response() {
        // default constructor
    }

    public Long getTime() {
        return time;
    }

    public void setTime(final Long time) {
        this.time = time;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(final List<Country> countries) {
        this.countries = countries;
    }

    public String getEcho() {
        return echo;
    }

    public void setEcho(final String echo) {
        this.echo = echo;
    }

    @Override
    public String toString() {
        return "Response{" + "time=" + time + ", countries=" + countries + ", echo='" + echo + '\'' + '}';
    }
}
