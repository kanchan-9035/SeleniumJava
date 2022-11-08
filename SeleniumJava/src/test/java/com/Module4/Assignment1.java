package com.Module4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pages.Facebook;

//Automate Facebook Registration Page using Direct Locator's in Chrome Browser
public class Assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Way to dreams\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("Title of page :: "+driver.getTitle());
		
		//go for new registration
		driver.findElement(Facebook.createAccount).click();
		
		driver.findElement(Facebook.firstName).sendKeys("Shreeram");
		driver.findElement(Facebook.surName).sendKeys("Rane");
		driver.findElement(Facebook.mobNumber).sendKeys("7841888739");
		driver.findElement(Facebook.passWordNew).sendKeys("78989@123");
		
		Select objSel=new Select(driver.findElement(Facebook.day));
		objSel.selectByValue("17");
		

		Select objSel1=new Select(driver.findElement(Facebook.month));
		objSel1.selectByVisibleText("Feb");

		Select objSel2=new Select(driver.findElement(Facebook.year));
		objSel2.selectByValue("1995");
		
		driver.findElement(Facebook.genderFemale).click();
		driver.findElement(Facebook.signUp).click();
		driver.close();

	}

}
