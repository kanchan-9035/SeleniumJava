package com.Module4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.Oracle;

/*
 * Automate Oracle Registration Page in Chrome Browser 
 https://profile.oracle.com/myprofile/account/create-account.jspx*/
public class Assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Way to dreams\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("Title of page :: "+driver.getTitle());
		
		driver.findElement(Oracle.emailId).sendKeys("kanchanpatil9035@gmail.com");
	//	driver.findElement(Oracle.password).sendKeys("oracle@123");
	//	driver.findElement(Oracle.resetPassword).sendKeys("oracle@123");
		
		

	}

}
