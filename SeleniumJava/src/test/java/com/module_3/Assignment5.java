package com.module_3;

import com.utility.Library;

/*
 TC-1 Launch Chrome Browser 
 TC-2 Go to Test URL - https://www.google.com
 TC-3 Maximize the Browser Window 
 TC-4 Get the URL of Page 
 TC-5 Navigate to Test URL - https://www.selenium.dev/
 TC-6 Get the URL of Page 
 TC-7 Navigate back to Test URL - https://www.google.com
 TC-8 Get the URL of Page 
 TC-8 Navigate one step forward to Test URL - https://www.selenium.dev/ 
 TC-9 Get the URL of Page 
 TC-10 Refresh the Current Page 
 TC-11 Get the URL of Page 
 TC-12 Close the Browser*/
public class Assignment5 extends Library{

	public static void main(String[] args) {
		System.out.println("Module3 :: Assignent 5");
		
		ReadPropertiesFile();
		LaunchBrowser();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println("URL of the current page is  :: "+ driver.getCurrentUrl());
		
		driver.navigate().to("https://www.selenium.dev/");
		System.out.println("URL of the current page is  :: "+ driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println("URL of the current page is  :: "+ driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println("URL of the current page is  :: "+ driver.getCurrentUrl());
		
		driver.navigate().refresh();
		System.out.println("URL of the current page after refresh is  :: "+ driver.getCurrentUrl());
		driver.close();
		
	}

}
