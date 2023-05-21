package config;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseLogSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;

import static constants.Constants.Path.SWAPI_PATH;
import static constants.Constants.RunVariable.path;
import static constants.Constants.RunVariable.server;
import static constants.Constants.Server.REQUESTBIN_URL;
import static constants.Constants.Server.SWAPI_URL;

/**
 * @author Bohdan Brukhovets
 * @link https://www.linkedin.com/in/bohdan-brukhovets/
 */
public class TestConfig {
protected RequestSpecification requestSpecificationForSwapiTest = new RequestSpecBuilder().setBaseUri(SWAPI_URL).build();
    protected RequestSpecification requestSpecificationForTestProjectXml = new RequestSpecBuilder().
            addHeader("Content-Type", "application/xml").setBaseUri(REQUESTBIN_URL).addCookie("testCookieXML").build();

    protected ResponseSpecification responseSpecificationForGet = new ResponseSpecBuilder().
            expectStatusCode(200).build();
    protected ResponseSpecification responseSpecificationForPost = new ResponseSpecBuilder().
            expectStatusCode(201).build();

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = server;
        //RestAssured.basePath = path;

        RequestSpecification requestSpecificationForTestProjectJson = new RequestSpecBuilder().
                addHeader("Content-Type", "application/json").addCookie("testCookieJSON").build();

        RestAssured.requestSpecification = requestSpecificationForTestProjectJson;
    }
}
