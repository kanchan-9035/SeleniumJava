package com.Testng;

import org.testng.annotations.Test;

import com.utility.Library;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest extends Library{
  @Test
  public void checkWindow() {
	  System.out.println("Checking page");
	  
	  driver.get("https://netbanking.hdfcbank.com/netbanking/");
	  PageLoadTimeOut();
	  WebElement knowMore=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/span[2]/a[1]"));
	  knowMore.click();
	  
		/*
		 * driver.get("https://www.hdfcbank.com/personal/useful-links/security"); String
		 * title= driver.getTitle(); System.out.println(title);
		 */
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeTest
  public void beforeTest() {
	  LaunchBrowser();
  }

  @AfterTest
  public void afterTest() {
  }
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before suite executed");
	  ReadPropertiesFile();
	  
  }
}
