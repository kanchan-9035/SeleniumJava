package com.Module4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.Oracle;

/*
 * Automate Oracle Registration Page in Chrome Browser 
 https://profile.oracle.com/myprofile/account/create-account.jspx*/
public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Way to dreams\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		System.out.println("Title of page :: "+driver.getTitle());
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement email=driver.findElement(Oracle.emailId);
		
		email.sendKeys("kanchanpatil9035@gmail.com");
		email.sendKeys(Keys.RETURN);
		
		driver.findElement(Oracle.password).sendKeys("OraclePassword@123");
	    driver.findElement(Oracle.resetPassword).sendKeys("OraclePassword@123");
	    
	    Select objSel=new Select(driver.findElement(Oracle.country));
	    objSel.selectByVisibleText("India");
	    
	    Thread.sleep(1000);
	    driver.findElement(Oracle.firstName).sendKeys("Aishwarya");
	    driver.findElement(Oracle.lastName).sendKeys("patil");
	    driver.findElement(Oracle.jobTitle).sendKeys("Devloper");
	    driver.findElement(Oracle.workPhone).sendKeys("7841888739");
	    
	    driver.findElement(Oracle.companyName).sendKeys("Techie");
	    driver.findElement(Oracle.address).sendKeys("Shantiniketan colony");
	    
		driver.findElement(Oracle.city).sendKeys("Parbhani");
		
		Select objSel1=new Select(driver.findElement(Oracle.state));
	    objSel1.selectByValue("20");
	    
		driver.findElement(Oracle.zipCode).sendKeys("431401");
		driver.findElement(Oracle.createAccount).click();
		
		driver.close();

	}

}
