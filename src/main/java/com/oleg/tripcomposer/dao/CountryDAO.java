package com.oleg.tripcomposer.dao;


import com.oleg.tripcomposer.domain.Country;

import java.util.List;

public interface CountryDAO {

   List getAll();

    void saveAll(List<Country> country);
}
