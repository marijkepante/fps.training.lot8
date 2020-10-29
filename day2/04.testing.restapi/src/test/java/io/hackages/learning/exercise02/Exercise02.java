package io.hackages.learning.exercise02;

import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.Test;

import java.net.URISyntaxException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.startsWith;

/**
 * POST Endpoint
 *
 */
public class Exercise02 {

    @Test
    public void test_contact_example() throws URISyntaxException {

        String jsonBody = "{\\r\\n\\t\\\"firstName\\\":\\\"John\\\",\\r\\n\\t\\\"lastName\\\":\\\"Wick\\\",\\r\\n\\t\\\"message\\\":\\\"I am coming for you !!!!\\\",\\r\\n\\t\\\"contact\\\": 123456789\\t\\r\\n}";

        given()
                .contentType(ContentType.JSON)
                .and()
                .body(jsonBody)
                .when()
                .post("https://myfakeapi.com/api/contactus")
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_BAD_REQUEST);
    }

}
