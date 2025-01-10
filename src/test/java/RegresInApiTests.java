import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pojo.GetUsersData;

import java.util.List;

import static io.restassured.RestAssured.given;

public class RegresInApiTests {

    @Test
    public void getUsersWithCode200(){
         given()
                 .accept(ContentType.JSON)
                 .contentType(ContentType.JSON)
                 .baseUri("https://reqres.in/")
                 .basePath("/api/users?page=2")
                 .when().get()
                 .then().log().body().statusCode(200);
    }
    @Test
    public void checkUserEmail(){
        List<GetUsersData> users = given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri("https://reqres.in/")
                .basePath("/api/users?page=2")
                .when().get()
                .then().log().body().extract().jsonPath().getList("data", GetUsersData.class);

        users.forEach(user -> System.out.println(user.getEmail()));


        users.forEach(user -> Assertions.assertTrue(user.getEmail().endsWith("@regres.in")));

//        for(GetUsersData user : users){
//            Assertions.assertTrue(user.getEmail().endsWith("@regres.in"));
//        }
    }
}
