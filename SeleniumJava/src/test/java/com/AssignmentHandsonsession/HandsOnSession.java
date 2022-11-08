package com.AssignmentHandsonsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandsOnSession {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.linkText("Create New Account"));
		Thread.sleep(2000);
		
	//	driver.findElement(By.name("firstname")).sendKeys("Jonney");
	//	driver.findElement(By.name("lastname")).sendKeys("Deep");
	//	driver.findElement(By.name("reg_email__")).sendKeys("jonney@gmail.com");
		
		
	}

}
