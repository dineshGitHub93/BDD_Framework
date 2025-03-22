package stepDefinitions;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class SingleDataTableSteps {

	@Given("the following items:")
	public void the_following_items(DataTable dataTable) {

		List<String> data = dataTable.asList(String.class);

		System.out.println("Data "+data);

	}

	@Given("the following field and values items")
	public void the_following_field_and_values_items(io.cucumber.datatable.DataTable dataTable) {

		Map<String, String> userCred = dataTable.asMap();
		System.out.println(userCred);


		for(Map.Entry<String, String> user : userCred.entrySet()) {
			
			System.out.println("username : "+user.getKey() +"; password : "+user.getValue());
		}
		


	}

	@Given("the following users:")
	public void the_following_users(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> users = dataTable.asMaps();
		System.out.println(users);

		users.stream().forEach(System.out::println);

		for(Map<String, String> user : users) {
			
			 System.out.println("Username: " + user.get("Username"));
		        System.out.println("Password: " + user.get("Password"));
		        System.out.println("Role: " + user.get("Role"));
		        System.out.println("-----------");
		}
	}
}
