package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteAddressUser {
WebDriver driver;
@Given("^user is on the  viewAddressList pageManagement$")
public void user_is_on_the_viewAddressList() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "E:\\\\New folder (3)\\\\selenium softwares\\\\chromedriver_win32\\\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://localhost:4200/viewAddressList");
	driver.manage().window().maximize();
}

@When("^user clicks on the Delete$")
public void user_clicks_on_the_Delete() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.xpath("//body/app-root[1]/app-address[1]/table[1]/tr[2]/td[7]/button[1]")).click();
  
}

@Then("^user see the  Deleted page$")
public void user_see_the_Deleted_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Successfully deleted");
    
}

}
