package com.Testng;

import org.testng.annotations.Test;

import com.utility.Library;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


public class Flipkart extends Library{
	
  @Test(priority = 1)
  public void loadFlipkartPage() {
	  driver.get(objProperties.getProperty("Flipkart"));
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  
	  
  }
  @Test(priority = 2)
  public void loginValidation() {
	  
	  driver.findElement(com.pages.Flipkart.loginid).sendKeys("7841888739");
	  driver.findElement(com.pages.Flipkart.pass).sendKeys("Kanchan@123");
	  
  }
  
  @Test(priority = 3)
  public void action() {
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before starting test ;oading chrome driver");
	  LaunchBrowser();
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Flipcat automation");
	  ReadPropertiesFile();
  }

  @AfterSuite
  public void afterSuite() {
  }

}
