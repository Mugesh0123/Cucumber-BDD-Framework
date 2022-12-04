package org.baseClass;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.elementClass.loginElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	private static final Logger LOGGER = LogManager.getLogger(BaseClass.class);
	
	public static void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		
	    
		public static void edgeBrowser() {
	    	LOGGER.info("CHROME BROWSER START");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			}
		
		public static void url(String url) {
			driver.get(url);
		}
		
		public static void fillTextBox(WebElement e1, String string) {
			e1.sendKeys(string);
		}
		
		public static void ElementClick(WebElement e2) {
			e2.click();
		}
		
		public static void initElements() {
			try {
				PageFactory.initElements(driver, loginElement.getInstance());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
