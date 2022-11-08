package com.module2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*/*
 * TC-1 Launch IE Browser 
 TC-2 Goto Test URL https://www.google.com 
 TC-3 Specify Wait Time for 5 Sec 
 TC-4 Get the Title of Page into Console 
 TC-5 Close the Browser*/
public class Assignment4 {
static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String Title=driver.getTitle();
		System.out.println("Title of page is" + Title);
		
	}

}
