package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/mozka002/Documents/selenium dependencies/drivers/chromedriver");//path of the chrome driver location/chromedriver.
		WebDriver driver = new ChromeDriver();
		driver.get("http://etsy.com");
	}

}
