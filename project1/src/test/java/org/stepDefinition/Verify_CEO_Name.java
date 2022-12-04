package org.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.baseClass.BaseClass;
import org.elementClass.loginElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_CEO_Name extends BaseClass{
	private static final Logger LOGGER = LogManager.getLogger(Verify_CEO_Name.class);
	//static loginElement instance = loginElement.getInstance();
	@Given("The user is logged in successfully and is on home Page")
	public void the_user_is_logged_in_successfully_and_is_on_home_page() {
		chromeBrowser();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);	
		url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
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

	@When("The User click on the directory Option from the menu bar")
	public void the_user_click_on_the_directory_option_from_the_menu_bar() {
		ElementClick(loginElement.getInstance().getDirectory());
		LOGGER.info("The User click on the directory Option from the menu bar");
	}

	@And("The user select teh job title as {string} from the drop down")
	public void the_user_select_teh_job_title_as_from_the_drop_down(String jobTile) {
		ElementClick(loginElement.getInstance().getJobTitle());
		Select select = new Select(loginElement.getInstance().getJobTitle());
		select.selectByVisibleText(jobTile);
		LOGGER.info("The user select teh job title as {string} from the drop down");
	}

	@And("click the search button")
	public void click_the_search_button() {
		ElementClick(loginElement.getInstance().getSearch());		
		LOGGER.info("click the search button");
	}

	@Then("The user should see the ceo name as {string}")
	public void the_user_should_see_the_ceo_name_as(String name) {
		fillTextBox(loginElement.getInstance().getSearch(), name);
		
		String text = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div/div/p[1]")).getText();
		
		if (text.equalsIgnoreCase(name)) {
			LOGGER.info("yes name is there");
		}		
		LOGGER.info("The user should see the ceo name as {string}" + name);
	    
	}
}
