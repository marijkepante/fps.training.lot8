package io.hackages.learning.exercise02;

import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.Test;

import java.net.URI;
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

    @Test
    public void test_scenario1() throws URISyntaxException {

        // Fetch a record
        URI uri = new URI("http://localhost:3000/catFacts/_id/591d9b2f227c1a0020d26823");
        given().accept(ContentType.JSON)
                .when()
                .get(uri)
                .then().assertThat().statusCode(HttpStatus.SC_OK);


        // Delete the record
        given().accept(ContentType.JSON)
                .when()
                .delete(uri)
                .then().assertThat().statusCode(HttpStatus.SC_OK);

        // Fetch the previous record
        given().accept(ContentType.JSON)
                .when()
                .get(uri)
                .then().assertThat().statusCode(HttpStatus.SC_NOT_FOUND);

        /*
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

         */
    }

}
