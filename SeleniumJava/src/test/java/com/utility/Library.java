package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Library {
	public static WebDriver driver;
	public static Properties objProperties;
	
	public static void ReadPropertiesFile() {
		System.out.println("Location of the project :: "+System.getProperty("user.dir"));
		File objFile=new File(System.getProperty("user.dir")+"//src//test//resources//Config.Properties");
		
		objProperties=new Properties();
		try {
			FileInputStream objInputStream= new FileInputStream(objFile);
			objProperties.load(objInputStream);
			System.out.println("Selected browser is"+ objProperties.getProperty("browser"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public static void LaunchBrowser() {
		
		String browserProperty=objProperties.getProperty("browser");
		System.out.println(browserProperty);
		
		switch(browserProperty)
		{
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			break;
			
		case "chrome":
			WebDriverManager.chromedriver().setup();
			//driver=new ChromeDriver();
			ChromeOptions objChromeOptions = new ChromeOptions();
			Map<String, Object> chromePreferences = new HashMap<String, Object>();
			chromePreferences.put("download.default_directory", System.getProperty("user.dir"));
			objChromeOptions.setExperimentalOption("prefs", chromePreferences);
			driver = new ChromeDriver(objChromeOptions);
		
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
		
	}
	public static void PageLoadTimeOut() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
}
