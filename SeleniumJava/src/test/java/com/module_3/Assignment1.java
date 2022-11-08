package com.module_3;

import java.util.ArrayList;
import com.pages.HdfcPage;
import com.utility.Library;


/*
 * TC-1 Launch Chrome Browser 
 TC-2 Go to Test URL - https://netbanking.hdfcbank.com/netbanking/
 TC-3 Maximize the Browser Window 
 TC-4 Get the Title of Page 
 TC-5 Click on know more Link Text 
 TC-6 Switch from 0th Window to 1st Window 
 TC-7 After Switching Get the Title of Page 
 TC-8 Switch from 1sr Window to 0th Window 
 TC-9 After Switching Get the Title of Page 
 TC-10 Close all windows of Browser*/

public class Assignment1 extends Library{
	
	public static void main(String[] args) {
		System.out.println("Module3 :: Assignent 1");
		ReadPropertiesFile();
		LaunchBrowser();
		PageLoadTimeOut();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		String titleOfPage=driver.getTitle();
		System.out.println("Title of the page is :: "+ titleOfPage);
		
		driver.switchTo().frame(0); 
		driver.findElement(HdfcPage.knowMore).click();
	
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String titleOfSecondtab=driver.getTitle();
		System.out.println("Title of the second page is :: "+titleOfSecondtab);
		
		 
		driver.switchTo().window(tabs.get(0));
		String currentTitle=driver.getTitle();
		System.out.println("Title of page after switch is :: "+ currentTitle);
		
		driver.quit();
		
	}
	
}
