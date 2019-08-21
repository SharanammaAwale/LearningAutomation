package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SecondMavenTest {
	
	@Test
	public void TC2()
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Apps\\Webdriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		
	}

}
