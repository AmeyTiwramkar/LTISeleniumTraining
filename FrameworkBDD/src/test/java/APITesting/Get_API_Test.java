package APITesting;


	

	import org.testng.annotations.Test;

	import io.restassured.RestAssured;
	import io.restassured.response.Response;

	public class Get_API_Test {
		@SuppressWarnings("static-access")
		@Test
		
		public void get_Test() {
			RestAssured request =new RestAssured();
			Response response =RestAssured.get("https://reqres.in/api/users?page=2");
			System.err.println(response.body());
			
		}

	}


