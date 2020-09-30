package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddAddress {
	WebDriver driver;
@Given("^user is on the  viewAddressList$")
public void user_is_on_the_viewAddressList() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "E:\\\\New folder (3)\\\\selenium softwares\\\\chromedriver_win32\\\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://localhost:4200/viewAddressList");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[contains(text(),'Add Address')]")).click();
    
}

@When("^user clicks on the AddAddress$")
public void user_clicks_on_the_AddAddress() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//input[@id='addressId']")).sendKeys("70");
	driver.findElement(By.xpath("//input[@id='buildingNo']")).sendKeys("vikash");
	driver.findElement(By.xpath("//input[@id='city']")).sendKeys("thewar");
	driver.findElement(By.xpath("//input[@id='state']")).sendKeys("storybased");
	driver.findElement(By.xpath("//input[@id='field']")).sendKeys("8");
	driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("U");
	
	driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
   
}

@Then("^user see the add new address page$")
public void user_see_the_add_new_address_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("Added Successfully");
	    driver.close();
   
}


}
