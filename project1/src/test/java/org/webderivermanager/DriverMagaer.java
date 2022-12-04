package org.webderivermanager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.baseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverMagaer {
	private static WebDriver driver =null;
	private static final Logger LOGGER = LogManager.getLogger(DriverMagaer.class);
	
	public static void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
	public static void firefoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver = new ChromeDriver();
		}
}
