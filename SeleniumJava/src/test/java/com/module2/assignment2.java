package com.module2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment2 {
	/*
	 * TC-1 Launch Chrome Browser 
 TC-2 Goto Test URL https://www.google.com 
 TC-3 Specify Wait Time for 5 Sec 
 TC-4 Get the Title of Page into Console 
 TC-5 Close the Browser*/

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		System.out.println("Title of page is "+ driver.getTitle());
		driver.close();
		
	}

}
