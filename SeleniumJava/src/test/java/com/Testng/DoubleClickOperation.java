package com.Testng;

import org.testng.annotations.Test;

import com.utility.Library;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DoubleClickOperation extends Library{

  @Test(priority = 1)
  public void openDoubleClickPage() {
	  
	  PageLoadTimeOut();
	  System.out.println("Loading Page");
	  String URL= objProperties.getProperty("mouseOpeartionDoubleClick");
	  driver.get(URL);
  }
  @Test(priority = 2)
  public void scrollDown() {
	  
	  System.out.println("Scrolling down to frame");
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  WebElement element= driver.findElement(By.xpath("//iframe"));
	  js.executeScript("arguments[0].scrollIntoView(true);", element);
  } 
  
  @Test(priority = 3)
  public void moveintoFrame() {
	  
	  driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
	  WebElement box=driver.findElement(By.xpath("//span[contains(text(),'Double click the block')]//preceding::div"));
	  
	  Actions act=new Actions(driver);
	  act.doubleClick(box).build().perform();
	  driver.switchTo().defaultContent();
	  
  } 
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("before method ");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method ");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class ");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class ");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test");
	  LaunchBrowser();
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test ");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
	  System.out.println("Before starting test, Loading read prooperties");
	  ReadPropertiesFile();
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suite ");
	  driver.close();
  }

}
