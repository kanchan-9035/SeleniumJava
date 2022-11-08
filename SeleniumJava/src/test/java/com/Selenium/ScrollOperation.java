package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollOperation {
	
	 static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/**
		 * Launch Chrome browser.
Maximize the browser.
Open URL: www.javatpoint.com
Scroll down through the web page
Click on "Core Java" link from the Java Technology section.
		 */
		 WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 
		 
		 driver.get("https://www.javatpoint.com/");
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		
		//Scroll down the webpage by 5000 pixels  
	        JavascriptExecutor js = (JavascriptExecutor)driver;  
	        js.executeScript("scrollBy(0, 5000)");   
	        
	        driver.findElement(By.linkText("Java")).click();

	}

}
