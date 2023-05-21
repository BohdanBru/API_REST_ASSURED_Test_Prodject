import config.TestConfig;
import org.testng.annotations.Test;

import static constants.Constants.Actions.*;
import static io.restassured.RestAssured.given;


/**
 * @author Bohdan Brukhovets
 * @link https://www.linkedin.com/in/bohdan-brukhovets/
 */
public class JsonPlaceHolderTest extends TestConfig {
    @Test
    public void GET(){
        given().queryParam("postId", 1).log().uri().when().get(JSONPLACEHOLDER_GET).then().log().body().statusCode(200);
    }
    @Test
    public void PUT(){
        String putBodyJson = "{\n" +
                "\"id\":1,\n" +
                "\"title\":\"foo\",\n" +
                "\"body\":\"bar\",\n" +
                "\"userId\":1,\n" +
                "}";
        given().body(putBodyJson).log().uri().
                when().put(JSONPLACEHOLDER_PUT).
                then().log().body().statusCode(200);
    }
    @Test
    public void DELETE(){
        given().log().uri().
                when().delete(JSONPLACEHOLDER_DELETE).then().log().body().statusCode(200);
    }
    @Test
    public void PostWithJson(){
        String postJsonBody= "{\n" +
                "\"title\":\"foo\",\n" +
                "\"body\":\"bar\",\n" +
                "\"userId\":1,\n" +
                "}";
        given().body(postJsonBody).log().all().
                when().post(JSONPLACEHOLDER_POST).
                then().spec(responseSpecificationForPost).log().body();

    }
    @Test
    public void PostWithXml(){
        String postXmlBody="<note>\n" +
                "<to>You</to>\n" +
                "<from>Me</from>\n" +
                "<heading>Reminder</heading>\n" +
                "<body>I'm really good! You need me! Don't forget me this weekend!</body>\n" +
                "</note>";
        given().spec(requestSpecificationForTestProjectXml).body(postXmlBody).log().uri().
                when().post("").
                then().spec(responseSpecificationForGet).log().body();

    }
}
