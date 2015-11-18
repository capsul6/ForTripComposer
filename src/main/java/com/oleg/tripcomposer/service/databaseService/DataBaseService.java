package com.oleg.tripcomposer.service.databaseService;


import com.oleg.tripcomposer.domain.Country;

import java.util.List;

public interface DataBaseService {

    List getAll();
    void PersistCountries(List<Country> country);
}
