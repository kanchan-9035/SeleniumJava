package com.module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenFirefoxBrowser {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.firefoxdriver().setup();
       driver= new FirefoxDriver();
       driver.get("https://testng.org/doc/");
	}

}
