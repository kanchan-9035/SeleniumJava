package com.module_3;

import java.util.ArrayList;
import org.testng.Assert;

import com.pages.HdfcPage;
import com.utility.Library;
/*TC-1 Launch Chrome Browser 
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

public class Assignment2 extends Library{

	public static void main(String[] args) {
		System.out.println("Module3 :: Assignent 2");
		ReadPropertiesFile();
		LaunchBrowser();
		PageLoadTimeOut();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		String titleOfPage=driver.getTitle();
		System.out.println("Title of the page is ::"+ titleOfPage);
		String mainWindow=driver.getWindowHandle();
		
		driver.switchTo().frame(0);
		driver.findElement(HdfcPage.knowMore).click();
		
		ArrayList<String> allWindow=new ArrayList<String>(driver.getWindowHandles());
		
		//switch from 0th to 1st window
		driver.switchTo().window(allWindow.get(1));
		String linkTitle=driver.getTitle();
		System.out.println("Title of the switched tab is :: "+linkTitle);
		Assert.assertEquals(linkTitle, objProperties.getProperty("Hdfc_knowMoreTitle"));
		driver.close();
		
		driver.switchTo().window(mainWindow);
		String currentTitle=driver.getTitle();
		System.out.println("Current Title is  :: "+ currentTitle);
		driver.close();

	}

}
