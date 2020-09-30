package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UWhishList {
WebDriver driver1;


@Given("^user is on the  viewWhishlist$")
public void user_is_on_the_viewWhishlist() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "E:\\\\New folder (3)\\\\selenium softwares\\\\chromedriver_win32\\\\chromedriver.exe");
	driver1 = new ChromeDriver();
	driver1.get("http://localhost:4200/viewWhishlist");
	driver1.findElement(By.xpath("//a[contains(text(),'AddWhishlist')]")).click();
}

@When("^user clicks on the Addwhishlist$")
public void user_clicks_on_the_Addwhishlist() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver1.findElement(By.xpath("//input[@id='whishlistId']")).sendKeys("70");
	driver1.findElement(By.xpath("//input[@id='productId']")).sendKeys("78");
	driver1.findElement(By.xpath("//input[@id='productName']")).sendKeys("thewar");
	
	driver1.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
}

@Then("^user see the add new whishlist page$")
public void user_see_the_add_new_address_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Added Successfully");
}

}
