package com.Testng;

import org.testng.annotations.Test;

import com.pages.MultipleWindowPage;
import com.utility.Library;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
// to be asked
public class ValidateMultipleWindow extends Library{
  @Test(priority = 1)
  public void PageLoadSucess() {
	  System.out.println("checking multiple window page load sucess");
	  driver.get(objProperties.getProperty("nxtgenaiacademyURL"));
	  PageLoadTimeOut();
	  String Title=driver.getTitle();
	  Assert.assertEquals(Title, objProperties.getProperty("nxtgenaiacademyTitle"));
  }
  @Test(priority = 2)
  public void NewBrowserWindow() {
	  System.out.println("checking newBrowser window tab");
	 WebElement element= driver.findElement(MultipleWindowPage.newBrowserTab);
	 WebDriverWait wait= new WebDriverWait(driver, 60);
	 wait.until(ExpectedConditions.elementToBeClickable(element));
	 element.click();
	 
	 String mainWindow=driver.getWindowHandle();
	 Set<String> allWindow=driver.getWindowHandles();
	 for(String winow: allWindow) {
		 driver.switchTo().window(winow);
		 String titleNew=driver.getTitle();
		 if(titleNew.equalsIgnoreCase(objProperties.getProperty("newBrowserWindowTitle")))
		 {
			 driver.findElement(MultipleWindowPage.menuTab).click();
			 driver.findElement(MultipleWindowPage.aboutMe);
			 driver.close();
			 
		 }		 
	 }
	 driver.switchTo().window(mainWindow);
	 
	  
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
	  System.out.println("Before Start Test execution");
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

  @AfterSuite
  public void afterSuite() {
  }

}
