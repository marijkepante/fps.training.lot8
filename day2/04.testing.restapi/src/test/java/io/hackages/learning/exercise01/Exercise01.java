package io.hackages.learning.exercise01;

import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;

import static io.restassured.RestAssured.given;

/**
 * Using Query parameters
 *
 */
public class Exercise01 {

    @Test
    public void test_using_query_parameter_example() throws URISyntaxException {
        given()
            .accept(ContentType.JSON)
            .param("search_query", "sfpd")
            .when()
            .get("https://www.youtube.com/results")
            .then()
            .assertThat()
            .statusCode(HttpStatus.SC_OK);
    }

}
