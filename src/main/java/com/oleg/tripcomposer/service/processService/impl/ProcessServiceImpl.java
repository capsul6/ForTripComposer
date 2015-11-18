package com.oleg.tripcomposer.service.processService.impl;

import com.oleg.tripcomposer.domain.Country;
import com.oleg.tripcomposer.response.Response;
import com.oleg.tripcomposer.service.databaseService.DataBaseService;
import com.oleg.tripcomposer.service.processService.ProcessService;
import com.oleg.tripcomposer.service.restService.RestService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcessServiceImpl implements ProcessService {

    @Autowired
    private RestService restService;

    @Autowired
    private DataBaseService dataBaseService;

    private static final Logger LOGGER = Logger.getLogger("ProcessService");


    public Response processRequest(String echoMassage) {
        LOGGER.debug("processRequest");
        Response response = restService.sendPostRequest(echoMassage);
        List<Country> countries = response.getCountries();
        dataBaseService.PersistCountries(countries);
        return restService.sendPostRequest(echoMassage);
    }


}
