package org.elementClass;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class loginElement extends BaseClass{
	
	private static loginElement Loginstance;
		
	private  loginElement() {
		
	}
	
	public static loginElement getInstance() {
		if(Loginstance == null) {
			Loginstance = new loginElement();
		}
		
		return Loginstance;
		
	}
	
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	private WebElement username;	
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	private WebElement passWord;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	private WebElement login;
	
	
	@FindBy(linkText = "Directory")
	private WebElement directory;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")
	private WebElement jobTitle;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")
	private WebElement search;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a/span")
	private WebElement timeSheet;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[1]/div/div/div/div[2]/div/div/input")
	private WebElement employeeName;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[2]/button")
	private WebElement viewButton;
	
	public WebElement getDirectory() {
		return directory;
	}
	

	public WebElement getUsername() {
		BaseClass.initElements();
		return username;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLogin() {
		return login;
	}


	public WebElement getJobTitle() {
		return jobTitle;
	}


	public WebElement getSearch() {
		return search;
	}


	public WebElement getTimeSheet() {
		return timeSheet;
	}


	public WebElement getEmployeeName() {
		return employeeName;
	}


	public WebElement getViewButton() {
		return viewButton;
	}
}
