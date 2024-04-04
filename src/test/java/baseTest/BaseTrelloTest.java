package baseTest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import root.Configuration;
import root.trello.User;

import static io.restassured.RestAssured.given;

public class BaseTrelloTest {
    Configuration configuration = new Configuration().init();
    protected RequestSpecification requestSpecification = new RequestSpecBuilder()
            .setBaseUri(BASE_URL)
            .addQueryParam("token", configuration.getToken())
            .addQueryParam("key",configuration.getKey())
            .addHeader("Content-Type","application/json")
            .log(LogDetail.ALL)
            .build();

    protected ResponseSpecification responseSpecification = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .expectHeader("Content-Type","application/json; charset=utf-8")
            .expectContentType("application/json")
            .log(LogDetail.BODY)
            .build();

    protected static final String BASE_URL = "https://api.trello.com/";
    protected static final String USER_URL = "1/members/me";

    protected User getUser() {
        return given()
                .spec(requestSpecification)
                .when()
                .get(USER_URL)
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .extract().response().as(User.class);
    }
}
