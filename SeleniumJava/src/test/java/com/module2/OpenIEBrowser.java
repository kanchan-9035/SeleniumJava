package com.module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenIEBrowser {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * this is not working 
		WebDriverManager.iedriver().setup();
		driver= new InternetExplorerDriver();
		driver.get("https://bing.com");
		*/
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\kanch\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		//Creating an object of EdgeDriver
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		//Deleting all the cookies
		driver.manage().deleteAllCookies();
		
		driver.get("https://bing.com");
		
	}

}
