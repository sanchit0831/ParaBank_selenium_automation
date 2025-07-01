package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver = Hooks.driver;

	@When("^user enters the (.*) and (.*)$")
	public void user_enters_the_username_and_password(String username, String password) throws InterruptedException {
		
		WebElement e1 = driver.findElement(By.xpath("//input[@name='username']"));
		e1.sendKeys(username);
		Thread.sleep(2000);
		
		WebElement e2 = driver.findElement(By.xpath("//input[@name='password']"));
		e2.sendKeys(password);
		Thread.sleep(2000);
	}

	@And("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		WebElement e1 = driver.findElement(By.xpath("//input[@value='Log In']"));
		e1.click();
		Thread.sleep(6000);
	}
	
	@Then("user is logged in successfully")
	public void user_is_logged_in_successfully() {
		if(driver.getCurrentUrl().contains("overview.htm")) {
			System.out.println("User logged in successfully!");
		}
		else {
			System.out.println("Login failed!");
		}
		
	}
	

}
