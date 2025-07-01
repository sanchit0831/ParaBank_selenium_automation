package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TransferAmount {

	WebDriver driver = Hooks.driver;

	@When("user clicks on Transfer Funds")
	public void user_clicks_on_transfer_funds() throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space()='Transfer Funds']")).click();
		Thread.sleep(2000);
	}

	@And("user enters {int} in the Amount textbox")
	public void user_enters_in_the_amount_textbox(Integer int1) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("50");
		Thread.sleep(2000);
	}

	@And("user select from and to account dropbox")
	public void user_select_from_and_to_account_dropbox() throws InterruptedException {
		// Locate the dropdown element by its ID (or another locator)
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='fromAccountId']"));
		
		// Create an instance of the Select class and pass the dropdown WebElement
		Select dropdown = new Select(dropdownElement);
		
		// Select the second item by index (index starts from 0, so second item is at index 1)
		dropdown.selectByIndex(0);
		
		// Locate the dropdown element by its ID (or another locator)
		WebElement dropdownElement2 = driver.findElement(By.xpath("//select[@id='toAccountId']"));
				
		// Create an instance of the Select class and pass the dropdown WebElement
		Select dropdown2 = new Select(dropdownElement2);
				
		// Select the second item by index (index starts from 0, so second item is at index 1)
		dropdown2.selectByIndex(1);
		
		Thread.sleep(2000);

	}

	@And("user clicks on Transfer button")
	public void user_clicks_on_transfer_button() throws InterruptedException {
		driver.findElement(By.xpath("//input[@value='Transfer']")).click();
		Thread.sleep(2000);
	}

	@Then("amount is transfered successfully")
	public void amount_is_transfered_successfully() throws InterruptedException {
		System.out.println("Transfer completed? "+ driver.getPageSource().contains("Transfer Complete"));
		Thread.sleep(2000);
	}

}
