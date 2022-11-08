package com.Module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Automate Facebook Registration Page using Absolute X-path in Chrome Browser 
//https://www.facebook.com/
public class Assignment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Way to dreams\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Number of links on page
		int links=driver.findElements(By.tagName("a")).size();
		System.out.println("Number of links on page :: "+links);

		driver.close();

	}

}
