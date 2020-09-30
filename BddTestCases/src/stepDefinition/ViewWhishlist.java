package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ViewWhishlist {
WebDriver driver;



@Given("^user is  Already Login\\.$")
public void user_is_Already_Login() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "E:\\\\New folder (3)\\\\selenium softwares\\\\chromedriver_win32\\\\chromedriver.exe");
	driver = new ChromeDriver(); 
}

@When("^user clicks on the ViewListPage$")
public void user_clicks_on_the_ViewListPage() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.get("http://localhost:4200/viewWhishlist");
}

@Then("^user see the add new  WhishlistPage$")
public void user_see_the_add_new_WhishlistPage() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   System.out.println("Successfully displayed"); 
}

}
