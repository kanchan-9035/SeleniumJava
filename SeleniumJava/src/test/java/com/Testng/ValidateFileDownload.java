package com.Testng;

import org.testng.annotations.Test;

import com.pages.FileUploadPage;
import com.pages.UploadFilePage;
import com.utility.Library;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ValidateFileDownload extends Library{
  @Test(priority = 1)
  public void validatePageLoad() {
	  driver.get(objProperties.getProperty("FileDownload"));
		PageLoadTimeOut();
		System.out.println("inside ValidateFileUploadPageSuccessfully");
		String TitleOfJqueryPage = driver.getTitle();
		System.out.println("Title Of File DownloadPage:"+TitleOfJqueryPage);
		Assert.assertEquals(TitleOfJqueryPage, objProperties.getProperty("titleOfFileDownloadPage"));
	  
  }
  @Test(priority = 2)
  public void ValidFileDownload() throws InterruptedException {
	 System.out.println("Download valid file");
	 WebElement downloadFile= driver.findElement(UploadFilePage.downloadFile);
	 PageLoadTimeOut();
	 WebElement element = driver.findElement(By.xpath("//table[//table[@id='table-files']]"));
	 
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", element);
	// js.executeScript("window.scrollBy(0,450)");
	 
	 System.out.println("scroll down completed");
	 driver.findElement(UploadFilePage.downloadFile).click();
	 Thread.sleep(5000);
	 
	 File ObjFile=new File(System.getProperty("user.dir"));
	 
	 File[] allFiles=ObjFile.listFiles();
	 for(File individual: allFiles) {
		 String fileName=individual.getName();
		 System.out.println("File name " + fileName);
		 Boolean fileFound=false;
		 if(fileName.contains(objProperties.getProperty("TypeOfDownloadedFile"))) {
			 fileFound=true;
			 Assert.assertTrue(fileFound, " filedownloaded is not recognized");
			 individual.deleteOnExit();
		 }
		 
	 }
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  LaunchBrowser();
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
	  ReadPropertiesFile();
	  
  }

  @AfterSuite
  public void afterSuite() {
  }

}
