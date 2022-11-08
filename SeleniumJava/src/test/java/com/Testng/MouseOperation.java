package com.Testng;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class MouseOperation {
	public WebDriver driver;
  @Test(priority = 1)
  public void validatePageLoad() {
	  System.out.println("verifying correct page load");
	  String title=driver.getTitle();
	  String expectedTitle="jQuery contextMenu (2.x)";
	  //validating title
	  Assert.assertEquals(title, expectedTitle, "Vaidation is completed");
	 
  }
  @Test(priority = 2)
  public void validatingRighClickOperation() throws InterruptedException {
	  // now we are performing right click action 
	  Actions obj=new Actions(driver);
	  WebElement element=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
	  obj.contextClick(element).build().perform();
	  
	//span[text()='Paste']")
	  WebElement copy=driver.findElement(By.xpath("//span[text()='Copy']"));
	  obj.click(copy).build().perform();
	  Thread.sleep(5000);
	  
	  Alert objAlert=driver.switchTo().alert();
	  String alertText=objAlert.getText();
	  Assert.assertEquals(alertText, "clicked: copy");
	  objAlert.accept();
	  
  }
  @Test(priority=3)
  public void VerifyDoubleClickOperation() {
	  System.out.println("validating the double click operation");
	  driver.navigate().to("https://api.jquery.com/dblclick/");
	  //Library.pageLoadTimeout();
	  driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	  //scroll down
	  JavascriptExecutor js= (JavascriptExecutor)driver;
	  WebElement frame=driver.findElement(By.xpath("//iframe"));
	  
	  
	  /*
	   * ScrollByVisibleElement
	   * // Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);*/
	  js.executeScript("arguments[0].scrollIntoView(true);", frame);
	  
	  driver.switchTo().frame(frame);
	  WebElement doubleClickBox=driver.findElement(By.xpath("//span[contains(text(),'Double click')]/preceding-sibling::div"));
	  //now we have to perform double click action so taking action class
	  
	  Actions actionObj=new Actions(driver);
	  System.out.println("performing double click");
	  actionObj.doubleClick(doubleClickBox).build().perform();
	  //now come out of frame
	  driver.switchTo().defaultContent();
  }
  @Test(priority = 4)
  public void VerifyDragAndDrop() {
	  
	  System.out.println("validating drag and drop");
	  driver.navigate().to("https://jqueryui.com/droppable/");
	  driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	  WebElement frame=driver.findElement(By.xpath("//iframe"));
	  driver.switchTo().frame(frame);
	  WebElement source=driver.findElement(By.id("draggable"));
	  WebElement destination=driver.findElement(By.id("droppable"));
	  
	  Actions actObj=new Actions(driver);
	  actObj.dragAndDrop(source, destination).build().perform();
	  
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
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
	  //code for the opening browser 
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	  driver.manage().window().maximize();
	  
	  //waits
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
  }

  @AfterSuite
  public void afterSuite() {
  }

}
