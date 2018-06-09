package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", 
//				"/Users/mozka002/Documents/selenium dependencies/drivers/chromedriver");//path of the chrome driver location/chromedriver.
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://cybertekschool.com");
		System.setProperty("webdriver.gecko.driver", 
				"/Users/mozka002/Documents/selenium dependencies/drivers/geckodriver");//path of the chrome driver location/chromedriver.
		WebDriver driverM = new FirefoxDriver();
		driverM.get("http://cybertekschool.com");
		System.out.println(driverM.getTitle());
	}
}
