package com.Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.AlertPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlertAssignment {

	// driver instance and alert instance
	static WebDriver driver;
	static Alert objAlert;
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        
        //Load the URL
        driver.navigate().to("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        
        // Adding timeout for page
        driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
        //Implicitly wait till 60 sec
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        
        //find alertclick button and click operation
        driver.findElement(AlertPage.alertButton).click();
        
        //Now switch to alert of window
        objAlert=driver.switchTo().alert();
        String alertText="You clicked a button";
        String actualAlertText=objAlert.getText();
        
        // validating the alert window
        if(actualAlertText.equalsIgnoreCase(alertText))
        {
        	System.out.println("first alert confirmed tested");
        	objAlert.accept();
        }
        else {
        	System.out.println("the correct window is not open for alert");
        }
        
        // checking next alert which opened after sometime of click operation
        
        driver.findElement(AlertPage.timerAlertButton).click();
        //we have to wait to appear the popup so explicit wait applicable
        
        WebDriverWait wait= new WebDriverWait(driver,30);
        
        wait.until(ExpectedConditions.alertIsPresent());
        objAlert=driver.switchTo().alert();
        String text="This alert appeared after 5 seconds";
        String actualAlertText1=objAlert.getText();
        
        if (actualAlertText1.equalsIgnoreCase(text)) {
        	
        	System.out.println("alert appears after 5 sec");
        	objAlert.accept();
        }else {
        	System.out.println("alert text not apperas after 5 sec");
        	
        }
        // testing OK cancel buttons--> Confirm button
        driver.findElement(AlertPage.confirmButton).click();
        objAlert=driver.switchTo().alert();
        String confirmAlertText= objAlert.getText();
        String confirmText="Do you confirm action?";
        
        if(confirmAlertText.equalsIgnoreCase(confirmText))
        {
        	objAlert.dismiss();
        	System.out.println("Dismiss operation is performed");
        }else {
        	System.out.println("Confirmation alert not validated");
        }
        String Confirmresult= driver.findElement(By.id("confirmResult")).getText();
        System.out.println("The confirm alert Result"+Confirmresult);
        
        if(Confirmresult.equalsIgnoreCase("You selected Cancel")) {
        	System.out.println("Cancel operation is done");
        }
        else {
        	System.out.println("Cancel operation is not validated");
        }
       
        //prompt alert
        driver.findElement(AlertPage.promtButton).click();
        objAlert=driver.switchTo().alert();
        objAlert.sendKeys("handling prompt alert");
        objAlert.accept();
        
        String result=driver.findElement(By.id("promptResult")).getText();
        if(result.equalsIgnoreCase("You entered handling prompt alert"))
        {
        	System.out.println("promt result validated");
        }
        else {
        	System.out.println("promt result is not validated");
        }
        
        
        
        
        
        
        
	}

}
