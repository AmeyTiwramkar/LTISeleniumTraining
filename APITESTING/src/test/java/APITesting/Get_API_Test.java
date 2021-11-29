package APITesting;


import static io.restassured.RestAssured.given;

import io.restassured.*;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static org.hamcrest.CoreMatchers.equalTo;

public class Get_API_Test {
	@SuppressWarnings("static-access")
	@Test
	public void get_Test() {
		RestAssured request =new RestAssured();
		Response response =request.get("https://reqres.in/api/users?page=2");
		
		//System.out.println(response.body());

		//System.out.println(response.getBody());

		System.out.println(response.getBody().asString());
		
	}

	
	@Test
	public void get_Test_BDD() {
		given()

		.get("https://reqres.in/api/users?page=1")
		.then()
		.statusCode(200) // will verify if status code is matching for the output
		//.body("data.first_name",hasItems("Michael"))

		.body("data.id[0]", equalTo(1))
		
		.log().all();

	}

	
	
}
