package com.module2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

/*/*
	 * TC-1 Launch firefox Browser 
 TC-2 Goto Test URL https://www.google.com 
 TC-3 Specify Wait Time for 5 Sec 
 TC-4 Get the Title of Page into Console 
 TC-5 Close the Browser*/

public class Assignment3 {
static WebDriver driver;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 WebDriverManager.firefoxdriver().setup(); 
//		  DesiredCapabilities caps =DesiredCapabilities.firefox();
//		 caps.setCapability("acceptInsecureCerts",true); 
//		 // driver = new FirefoxDriver(caps); 
		
		System.setProperty("webdriver.gecko.driver", "D:\\Way to dreams\\Software\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		
		driver=new FirefoxDriver();
		driver.get("https://www.google.com"); //
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); 
		System.out.println("Title of page is "+ driver.getTitle());
		 
		
		
		driver.close();
	}

}
