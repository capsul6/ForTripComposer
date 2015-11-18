package com.oleg.tripcomposer.service.restService.impl;

import com.oleg.tripcomposer.request.Request;
import com.oleg.tripcomposer.response.Response;
import com.oleg.tripcomposer.service.restService.RestService;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class RestServiceImpl implements RestService {

    private static final Logger LOGGER = Logger.getLogger("RestService");

    public Response sendPostRequest(String echoMassage) {
        LOGGER.debug("Process of exchange");
        final String COUNTRIES_URL = "http://tripcomposer.net/rest/test/countries/get";
        final HttpEntity<Request> entity = new HttpEntity(getRequest(echoMassage));
        final ResponseEntity<Response> responseEntity =
                dataProviderRestTemplate().exchange(COUNTRIES_URL, HttpMethod.POST, entity, Response.class);
        return responseEntity.getBody();
    }

    public RestTemplate dataProviderRestTemplate() {
        LOGGER.debug("get DataProvide");
        final HttpClient httpClient = getHttpClient();
        final RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory(httpClient));
        restTemplate.setMessageConverters(Arrays
                .<HttpMessageConverter<?>>asList(new MappingJackson2HttpMessageConverter()));
        return restTemplate;
    }

    public CloseableHttpClient getHttpClient() {
        LOGGER.debug("get HttpClient");
        return HttpClients.createDefault();
    }

    public Request getRequest(String echoMassage) {
        LOGGER.debug("build request");
        final String API_KEY = "$1$12309856$euBrWcjT767K2sP9MHcVS/";
        final Request request = new Request();
        request.setKey(API_KEY);
        request.setEcho(echoMassage);
        return request;
    }
}
