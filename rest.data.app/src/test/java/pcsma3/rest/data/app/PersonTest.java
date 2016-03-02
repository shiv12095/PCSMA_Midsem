package pcsma3.rest.data.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

public class PersonTest {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String personsUrl = "http://localhost:8080/api/persons";
    public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Test
    public void testCreatePerson() throws Exception {
        Map<String, Object> requestBody = new HashMap<String, Object>();
        requestBody.put("firstName", "Cookie");
        requestBody.put("lastName", "Hero");
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);

        //Creating http entity object with request body and headers
        HttpEntity<String> httpEntity =
            new HttpEntity<String>(OBJECT_MAPPER.writeValueAsString(requestBody), requestHeaders);

        //Invoking the API
        Map<String, Object> apiResponse =
            restTemplate.postForObject(personsUrl, httpEntity, Map.class, Collections.EMPTY_MAP);
        assertNotNull(apiResponse);
        System.out.println(apiResponse);

        //Asserting the response of the API.
        assertEquals("Cookie", apiResponse.get("firstName"));
        assertEquals("Hero", apiResponse.get("lastName"));
    }

}