import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static builders.PetStoreUserGenerate.setUserData;
import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class PetStoreApiTest {



    @Test
    public void postNewUserWithCode200(){
        given()
                .basePath("/user")
                .baseUri("https://petstore.swagger.io/v2")
                .contentType(JSON)
                .accept(JSON)
                .body(setUserData())
                .when().post()
                .then().assertThat().body("message", CoreMatchers.equalTo(String.valueOf((setUserData().getId()))));
    }
}
