package com.oleg.tripcomposer.service.restService;

import com.oleg.tripcomposer.request.Request;
import com.oleg.tripcomposer.response.Response;
import org.apache.http.impl.client.CloseableHttpClient;
import org.springframework.web.client.RestTemplate;

/**
 * Created by oleg on 10/29/15.
 */
public interface RestService {
    Response sendPostRequest(String echoMassage);
    RestTemplate dataProviderRestTemplate();
    CloseableHttpClient getHttpClient();
    Request getRequest(String echoMassage);
}
