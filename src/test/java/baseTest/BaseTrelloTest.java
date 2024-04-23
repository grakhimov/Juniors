package baseTest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import root.Configuration;
import root.trello.Board;
import root.trello.Organization;
import root.trello.User;

import java.util.Map;
import java.util.Random;

import static io.restassured.RestAssured.given;

public class BaseTrelloTest {
    Configuration configuration = new Configuration().init();
    protected RequestSpecification requestSpecification = new RequestSpecBuilder()
            .setBaseUri(BASE_URL)
            .addQueryParam("token", configuration.getToken())
            .addQueryParam("key", configuration.getKey())
            .addHeader("Content-Type", "application/json")
            .log(LogDetail.ALL)
            .build();

    protected ResponseSpecification responseSpecification = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .expectHeader("Content-Type", "application/json; charset=utf-8")
            .expectContentType("application/json")
            .log(LogDetail.BODY)
            .build();

    protected static final String BASE_URL = "https://api.trello.com";
    protected static final String USER_URI = "/1/members/me/";
    protected static final String CREATE_BOARDS_URI = "/1/boards/";
    protected static final String CREATE_ORGANIZATION_URI = "/1/organizations/";
    protected static final String ORGANIZATION_URI = "/1/organizations/%s";
    protected Organization organization;

    protected User getUser() {
        return given()
                .spec(requestSpecification)
                .when()
                .get(USER_URI)
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .extract().response().as(User.class);
    }

    protected Board postBoard(String name, String orgId) {
        return given()
                .spec(requestSpecification)
                .queryParam("name", name)
                .queryParam("idOrganization", orgId)
                .when()
                .post(CREATE_BOARDS_URI)
                .then()
                .spec(responseSpecification)
                .extract().response().as(Board.class);
    }

    protected Organization postOrganization(String displayName) {
        return given()
                .spec(requestSpecification)
                .queryParam("displayName", displayName)
                .when()
                .post(CREATE_ORGANIZATION_URI)
                .then()
                .spec(responseSpecification)
                .extract().response().as(Organization.class);
    }

    protected Organization getOrganization(String id) {
        return given()
                .spec(requestSpecification)
                .when()
                .get(String.format(ORGANIZATION_URI, id))
                .then()
                .spec(responseSpecification)
                .extract().response().as(Organization.class);
    }

    protected Organization putOrganization(String id, Map<String, String> queryParams) {
        return given()
                .spec(requestSpecification)
                .queryParams(queryParams)
                .when()
                .put(String.format(ORGANIZATION_URI, id))
                .then()
                .spec(responseSpecification)
                .extract().response().as(Organization.class);
    }

    protected void deleteOrganization(String id) {
        given()
                .spec(requestSpecification)
                .when()
                .delete(String.format(ORGANIZATION_URI, id))
                .then()
                .spec(responseSpecification);
    }

    @BeforeClass
    protected void setUp() {
        organization = postOrganization("testOrgName" + new Random().nextInt(1000000));
    }

    @AfterClass
    protected void tearDown() {
        deleteOrganization(organization.getId());
    }
}
