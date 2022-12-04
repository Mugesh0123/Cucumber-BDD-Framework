package org.commonUttil;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.checkerframework.common.reflection.qual.GetClass;
import org.constant.Constants;

public class CommonUtil {

	public void loadProperties()  {
		
//		FileReader reader =null;
//		try {
//			reader = new FileReader("C:\\Users\\muges\\eclipse-workspace\\project1\\src\\test\\resources\\config.properties");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		try {
//			//properties.load(reader);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	    
		Properties properties = new Properties();
		
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
					
		Constants.URL = properties.getProperty("url");
		Constants.USERNAME = properties.getProperty("username");
		Constants.PASSWORD =properties.getProperty("password");
		
	}
}
