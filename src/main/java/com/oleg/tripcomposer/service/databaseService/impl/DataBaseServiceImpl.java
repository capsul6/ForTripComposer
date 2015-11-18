package com.oleg.tripcomposer.service.databaseService.impl;

import com.oleg.tripcomposer.dao.CountryDAO;
import com.oleg.tripcomposer.domain.Country;
import com.oleg.tripcomposer.service.databaseService.DataBaseService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class DataBaseServiceImpl implements DataBaseService {

    @Autowired
    private CountryDAO countryDAO;

    private static final Logger LOGGER = Logger.getLogger("DataBaseService");


    public List getAll() {
        LOGGER.debug("getAll from DB");
        return countryDAO.getAll();
    }

    public void PersistCountries(List<Country> country) {
        LOGGER.debug("save data to DB");
        countryDAO.saveAll(country);
    }

}
