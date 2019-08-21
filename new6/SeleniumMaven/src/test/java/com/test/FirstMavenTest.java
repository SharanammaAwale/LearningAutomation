package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstMavenTest {
	
	@Test 
	public void TC1()
	{
		// need to add the selenium and testNG dependencies to the pom.xml
		
		System.setProperty("webdriver.gecko.driver", "C:\\Apps\\Webdriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
 driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium ");
	}
	
		
		
		
		
	

}
