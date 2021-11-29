package APITesting;

import java.util.HashMap;

import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
public class Post_API_Test {
	
	
	@Test
	public void post_Api() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "Amey");
		map.put("Job","psc");
		System.out.println("Printing map"+map);
		
		JSONObject requestBody=new JSONObject(map);
		System.out.println("Printing Request Body"+requestBody);
		System.out.println("Printing Request Body as string"+requestBody.toJSONString());
		
		//Now to create request 
//		given()
//		.body(requestBody.toJSONString())
//		.when()
//		.post("https://reqres.in/api/users")
//		.then()
//		.statusCode(201);
		
		
		//ANOTHER METHOD  WITHOUT USING HASH MAP
		
		JSONObject newBody=new JSONObject();
		newBody.put("name", "Amey");
		newBody.put("job", "Psc");
		System.out.println(newBody);
		
		//Now to create request 
			given()
			.body(newBody.toJSONString())
			.when()
			.post("https://reqres.in/api/users")
			.then()
			.statusCode(201);
		

	}

}
