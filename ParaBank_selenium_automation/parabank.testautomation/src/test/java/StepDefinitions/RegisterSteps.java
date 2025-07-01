package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {

	WebDriver driver = Hooks.driver;
	
	@Given("user is on ParaBank home page")
	public void user_is_on_para_bank_home_page() throws InterruptedException {
		System.out.println("User is on homepage? " + driver.getCurrentUrl().contains("parabank/index.htm"));
		Thread.sleep(2000);
	}

	@And("user clicks on register button")
	public void user_clicks_on_register_button() throws InterruptedException {
		
		WebElement e1 = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		e1.click();
		Thread.sleep(2000);
	}

	@When("^user enters (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*) and (.*)$")
	public void user_enters_firstname_lastname_address_city_state_zip_phone_ssn_username_and_password(
			String firstname, String lastname, String address, String city, String state, 
			String zip, String phone, String ssn, String username, String  password) throws InterruptedException {
		WebElement e1 = driver.findElement(By.xpath("//input[@id='customer.firstName']"));
		e1.sendKeys(firstname);
		Thread.sleep(1000);
		
		WebElement e2 = driver.findElement(By.xpath("//input[@id='customer.lastName']"));
		e2.sendKeys(lastname);
		Thread.sleep(1000);
		
		WebElement e3 = driver.findElement(By.xpath("//input[@id='customer.address.street']"));
		e3.sendKeys(address);
		Thread.sleep(1000);
		
		WebElement e4 = driver.findElement(By.xpath("//input[@id='customer.address.city']"));
		e4.sendKeys(city);
		Thread.sleep(1000);
		
		WebElement e5 = driver.findElement(By.xpath("//input[@id='customer.address.state']"));
		e5.sendKeys(state);
		Thread.sleep(1000);
		
		WebElement e6 = driver.findElement(By.xpath("//input[@id='customer.address.zipCode']"));
		e6.sendKeys(zip);
		Thread.sleep(1000);
		
		WebElement e7 = driver.findElement(By.xpath("//input[@id='customer.phoneNumber']"));
		e7.sendKeys(phone);
		Thread.sleep(1000);
		
		WebElement e8 = driver.findElement(By.xpath("//input[@id='customer.ssn']"));
		e8.sendKeys(ssn);
		Thread.sleep(1000);
		
		WebElement e9 = driver.findElement(By.xpath("//input[@id='customer.username']"));
		e9.sendKeys(username);
		Thread.sleep(1000);
		
		WebElement e10 = driver.findElement(By.xpath("//input[@id='customer.password']"));
		e10.sendKeys(password);
		Thread.sleep(1000);
		
		WebElement e11 = driver.findElement(By.xpath("//input[@id='repeatedPassword']"));
		e11.sendKeys(password);
		Thread.sleep(1000);
	}

	@And("user click on register button")
	public void user_click_on_register_button() throws InterruptedException {
		WebElement e1 = driver.findElement(By.xpath("//input[@value='Register']"));
		e1.click();
		Thread.sleep(2000);
	}

	@Then("user is redirected to home page")
	public void user_is_redirected_to_home_page() throws InterruptedException {
		System.out.println("User is redirected to home page");
		WebElement e1 = driver.findElement(By.xpath("//a[normalize-space()='Log Out']"));
		e1.click();
		Thread.sleep(2000);
	}
	
}
