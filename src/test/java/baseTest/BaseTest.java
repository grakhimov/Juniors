package baseTest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import java.util.Iterator;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class BaseTest {
    private static Logger logger = LogManager.getLogger(BaseTest.class);

    /*@BeforeSuite
    public void beforeSuite(){

    }

    @BeforeClass
    public void beforeClass(){

    }

    @BeforeTest
    public void beforeTest(){
        //create test data right for test
    }*/

    @DataProvider(name = "LoginDataProvider")
    public Object[][] LoginData(){ //[ [[1] [2] [3]], [[4] [5] [6]] ]
        return new Object[][] {
                { "abc" },
                { "xyz" },
                { "mno" }
        };
    }

    @Test(dataProvider = "LoginDataProvider", dependsOnMethods = "test2")
    //add to suite1
    public void test1(String test){
        System.out.println("We're running test1" + test);
        //logger.info("info");
        //logger.warn("warn");
        logger.error("error");

        /*ResponseSpecification responseSpec = new ResponseSpecBuilder().expectStatusCode(200).build();
        RequestSpecification requestSpec = new RequestSpecBuilder().addParam("parameter1", "value1").build();
        given().
                spec(requestSpec).
                when().
                get("/lotto/{id}", 5).
                then().
                statusCode(200).
                body("lotto.lottoId", equalTo(5),
                        "lotto.winners.winnerId", hasItems(23, 54));*/
    }

    @Test
    //add to suite2
    public void test2(){
        System.out.println("We're running test2");
    }

    @Test
    //add to suite2
    public void test3(){
        System.out.println("We're running test3");
    }

    @Test
    //add to suite2
    public void test4(){
        System.out.println("We're running test4");
    }
}
