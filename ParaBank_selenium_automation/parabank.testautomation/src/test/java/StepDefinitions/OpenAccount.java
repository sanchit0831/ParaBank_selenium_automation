package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenAccount {
	
	WebDriver driver = Hooks.driver;
	
	@When("user clicks Open new account button")
	public void user_clicks_open_new_account_button() throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space()='Open New Account']")).click();
		Thread.sleep(2000);
	}

	@And("user select Saving as type of account")
	public void user_select_saving_as_type_of_account() throws InterruptedException {
		// Locate the dropdown element by its ID (or another locator like name, xpath, etc.)
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='type']"));
		// Create an instance of the Select class and pass the dropdown WebElement
		Select dropdown = new Select(dropdownElement);
		// Select an option by visible text
		dropdown.selectByVisibleText("SAVINGS");
		Thread.sleep(2000);
	}

	@And("user clicks on Open New Account button")
	public void user_clicks_on_open_new_account_button() throws InterruptedException {
		driver.findElement(By.xpath("//input[@value='Open New Account']")).click();
		Thread.sleep(2000);
	}

	@Then("user new saving account is openned")
	public void user_new_saving_account_is_openned() throws InterruptedException {
		System.out.println("Account openned successfully? " + driver.getPageSource().contains("Account Opened"));
		Thread.sleep(2000);
	}

}
