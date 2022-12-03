package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Library {
	public static WebDriver driver;
	public static Properties objProperties;
	public static HashMap<String, String> hmap=new HashMap<String, String>();
	
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
	
	public static HashMap<String, String> ReadExcelFile(int RowNumber, XSSFSheet obSheet){
		
		DataFormatter objFormatter=new DataFormatter();
		//map.put("RunMode", obSheet.getRow(RowNumber).getCell(0).getStringCellValue());
		hmap.put("TestCaseName", obSheet.getRow(RowNumber).getCell(1).getStringCellValue());
		hmap.put("FirstName", obSheet.getRow(RowNumber).getCell(2).getStringCellValue());
		hmap.put("LastName", obSheet.getRow(RowNumber).getCell(3).getStringCellValue());
		hmap.put("Address", obSheet.getRow(RowNumber).getCell(4).getStringCellValue());
		hmap.put("Email Address", obSheet.getRow(RowNumber).getCell(5).getStringCellValue());
		hmap.put("PhoneNumber", objFormatter.formatCellValue(obSheet.getRow(RowNumber).getCell(5)));
		//hmap.put("PhoneNumber", obSheet.getRow(RowNumber).getCell(6).getStringCellValue());
		hmap.put("Gender", obSheet.getRow(RowNumber).getCell(7).getStringCellValue());
		hmap.put("Hobbies", obSheet.getRow(RowNumber).getCell(8).getStringCellValue());
		hmap.put("Languages", obSheet.getRow(RowNumber).getCell(9).getStringCellValue());

		hmap.put("Skills", obSheet.getRow(RowNumber).getCell(10).getStringCellValue());
		hmap.put("Country", obSheet.getRow(RowNumber).getCell(11).getStringCellValue());
		hmap.put("SelectCountry", obSheet.getRow(RowNumber).getCell(12).getStringCellValue());
		hmap.put("DOB_YY", objFormatter.formatCellValue(obSheet.getRow(RowNumber).getCell(13)));
		
		//hmap.put("DOB_YY", obSheet.getRow(RowNumber).getCell(13).getStringCellValue());
		hmap.put("DOB_MM", obSheet.getRow(RowNumber).getCell(14).getStringCellValue());
		//hmap.put("DOB_DD", obSheet.getRow(RowNumber).getCell(15).getStringCellValue());
		hmap.put("DOB_DD", objFormatter.formatCellValue(obSheet.getRow(RowNumber).getCell(15)));
		
		hmap.put("Password", obSheet.getRow(RowNumber).getCell(16).getStringCellValue());
		hmap.put("confirm Password", obSheet.getRow(RowNumber).getCell(17).getStringCellValue());
	//	hmap.put("Result", obSheet.getRow(RowNumber).getCell(18).getStringCellValue());
		return hmap;
		
	}
	
}
