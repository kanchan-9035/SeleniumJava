package com.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.WebTablePage;
import com.utility.Library;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class ValidateWebTable extends Library{
  @Test
  public void ValidateWebPageLoad() {
	  
	  driver.get(objProperties.getProperty("WebTableURL"));
	  PageLoadTimeOut();
	  System.out.println(driver.getTitle());
	  Assert.assertEquals(driver.getTitle(), objProperties.getProperty("TitleOfWebTable"));
  }
  @Test
  public void verifyTableInfo() throws InterruptedException{
	  
	System.out.println("verifying the table existance");
	//scroll operation
	// as executing the script isn selenium so assigning dirver 
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	WebElement element = driver.findElement(By.xpath("//table"));
	js.executeScript("arguments[0].scrollIntoView(true);", element);
	Thread.sleep(500); 
	
	List<WebElement> elements=driver.findElements(WebTablePage.LastName);
	int noOfRows=elements.size();
	
	for(int row=1;row<=noOfRows;row++)
	{
		String name=elements.get(row).getText();
		System.out.println(name);
		int rowNo=row+1;
		if(name.equalsIgnoreCase("Williamson"))
		{
			String FirstName = driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+rowNo+"]/td[2]")).getText();
			  String Last_Name = driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+rowNo+"]/td[3]")).getText();
			  String Position = driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+rowNo+"]/td[4]")).getText();
			  String Office = driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+rowNo+"]/td[5]")).getText();
			  String StartDate = driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+rowNo+"]/td[6]")).getText();
			  String Salary = driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+rowNo+"]/td[7]")).getText();
			  
			  System.out.println("FirstName:"+FirstName);
			  System.out.println("Last_Name:"+Last_Name);
			  System.out.println("Position:"+Position);
			  System.out.println("Office:"+Office);
			  System.out.println("StartDate:"+StartDate);
			  System.out.println("Salary:"+Salary);
		  break;
		  
		}
		
	}
	

  }
	  
  @BeforeSuite
  public void beforeSuite() {
	  //code for the opening browser 
	  ReadPropertiesFile();
	  LaunchBrowser();
	   //waits
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
  }

  @AfterSuite
  public void afterSuite() {
  }


  
}
