import org.apache.http.HttpStatus;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ReqRes2Tests extends BaseTest {

    @Test
    public void getSingleUserTest() {
        given()
                .get("users/2")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .body("data.id", equalTo(2));
    }

    @Test
    public void getSingleUserTest2() {
        given()
                .get("users/2")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .body("data.id", equalTo(2));
    }

    @Test
    public void destinatedToFail() {
        given()
                .get("users/2")
                .then()
                .statusCode(HttpStatus.SC_NO_CONTENT)
                .body("data.id", equalTo(2));
    }

    @Test
    public void destinatedToFail2() {
        given()
                .get("users/2")
                .then()
                .statusCode(HttpStatus.SC_NO_CONTENT)
                .body("data.id", equalTo(2));
    }

}
