package com.module_3;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.pages.HdfcPage;
import com.utility.Library;

/*
 TC-1 Launch Firefox Browser 
 TC-2 Go to Test URL - https://netbanking.hdfcbank.com/netbanking/
 TC-3 Maximize the Browser Window 
 TC-4 Get the Title of Page 
 TC-5 Click on know more Link Text 
 TC-6 Switch from 0th Window to 1st Window 
 TC-7 After Switching Get the Title of Page 
 TC-8 Close 1st Window 
 TC-8 Switch from 1st Window to 0th Window 
 TC-9 After Switching Get the Title of Page 
 TC-10 Close 0th Window*/
public class Assignment4 extends Library{

	public static void main(String[] args) {
		System.out.println("Module3 :: Assignent 4");
		
        System.setProperty("webdriver.gecko.driver", "D:\\Way to dreams\\Software\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		PageLoadTimeOut();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		//String titleOfPage=driver.getTitle();
		System.out.println("Title of the page is :: "+ driver.getTitle());
		String mainWindow=driver.getWindowHandle();
		
		driver.switchTo().frame(0); 
		driver.findElement(HdfcPage.knowMore).click();
		
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.switchTo().window(tabs.get(1));
		
		//String title=driver.getTitle();
		System.out.println("Title of the second page is :: "+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(mainWindow); 
		//String currentTitle=driver.getTitle();
		System.out.println("Title of page after switch is :: "+ driver.getTitle());
		driver.close();
		

	}

}
