package io.hackages.learning.exercise00;

import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;
import static io.restassured.RestAssured.*;

/**
 * Basic GET endpoints
 */
public class Exercise00 {

    @Test
    public void test_endpoint_name_expect_status_code_ok() throws URISyntaxException {
        /*
         * Given Accept the response in JSON format
         * When I perform the GET request
         * Then Assert That the status code is OK
         */
        URI uri = new URI("https://restcountries.eu/rest/v2/name/united");
        given().accept(ContentType.JSON)
            .when()
            .get(uri)
            .then().assertThat().statusCode(HttpStatus.SC_OK);
    }

}
