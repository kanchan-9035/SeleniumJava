package com.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlerts {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
	// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       driver= new ChromeDriver();
       driver.get("https://demoqa.com/alerts");
       driver.manage().window().maximize();
       
       //operations of test page
       String pageTitle=driver.getTitle();
       System.out.println("Title of alert page is"+" "+ pageTitle);
       driver.findElement(By.id("alertButton")).click();

       //Switching to alert
       Alert objAlert= driver.switchTo().alert();
       System.out.println("Text of thr alert window "+ objAlert.getText());
       objAlert.accept();
       
       
     // assignemt link
     //  https://tutorialshut.com/demo-website-for-selenium-automation-practice/
       
       
       
	}

}
