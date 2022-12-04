package org.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.baseClass.BaseClass;
import org.elementClass.loginElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_Pending_Timesheet_Step_Definition extends BaseClass{
	private static final Logger LOGGER = LogManager.getLogger(Verify_Pending_Timesheet_Step_Definition.class);
	
//	static loginElement instance = loginElement.getInstance();
	@Given("The user is on the home page")
	public void the_user_is_on_the_home_page() {
		chromeBrowser();
		url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);		
		fillTextBox(loginElement.getInstance().getUsername(), "Admin");
		fillTextBox(loginElement.getInstance().getPassWord(), "admin123");
		ElementClick(loginElement.getInstance().getLogin());
		WebElement profile = driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']"));
		if(profile.isDisplayed()) {
			LOGGER.info("The user is on the home page");
		}else {
			LOGGER.info("The user is'nt on the home page");
		}
	}

	@When("The user click on the time option from the menu")
	public void the_user_click_on_the_time_option_from_the_menu() {
		
		ElementClick(loginElement.getInstance().getTimeSheet());
		
		LOGGER.info("The user click on the time option from the menu");
	}

	@And("The user enters the name as\"John Smith\"")
	public void the_user_enters_the_name_as_john_smith() {
		
		fillTextBox(loginElement.getInstance().getEmployeeName(), "John Smith");
		
		LOGGER.info("The user enters the name as\"John Smith\"");
	}

	@And("Click on the view button")
	public void click_on_the_view_button() {
		ElementClick(loginElement.getInstance().getViewButton());
		
		LOGGER.info("Click on the view button");
	}

	@Then("The user should see the message as {string}")
	public void the_user_should_see_the_message_as(String string) {
		WebElement required = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[1]/div/div/div/span"));
		
		if(required.isDisplayed()) {
			LOGGER.info("not available : " + string);
		}
	
		LOGGER.info("The user should see the message as {string}" + string);
	}
}
