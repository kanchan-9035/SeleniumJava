package com.Testng;

import org.testng.annotations.Test;

import com.pages.FileUploadPage;
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

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ValidateFileUpload extends Library{
  @Test(priority = 1)
  public void validatePageLoad() {
	  driver.get(objProperties.getProperty("FileUpload"));
		PageLoadTimeOut();
		System.out.println("inside ValidateFileUploadPageSuccessfully");
		String TitleOfJqueryPage = driver.getTitle();
		System.out.println("TitleOfJqueryPage:"+TitleOfJqueryPage);
		Assert.assertEquals(TitleOfJqueryPage, objProperties.getProperty("TiTleOfFileupload"));
	  
  }
  @Test(priority = 2)
  public void ValidFileUpload() throws InterruptedException {
	  System.out.println("Uploading file");
	 WebElement browser= driver.findElement(FileUploadPage.browseFile);
	 Actions objAction=new Actions(driver);
	 objAction.click(browser).build().perform();
	 
	 File objFile=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\UploadImage.jpeg");
	 //used for datatransfer
	 
	 StringSelection objSelection=new StringSelection(objFile.toString());
	 //copyData data and paster in tab of window
	 Clipboard clipBoard=Toolkit.getDefaultToolkit().getSystemClipboard();
	 clipBoard.setContents(objSelection, null);
	 
	 Transferable objTransferable=clipBoard.getContents(null);
	 
	 if(objTransferable.isDataFlavorSupported(DataFlavor.stringFlavor))
	 {
		 try {
			 System.out.println(objTransferable.getTransferData(DataFlavor.stringFlavor));
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }
	 
	 try {
		 Thread.sleep(6000);
		Robot objRobot=new Robot();
		objRobot.keyPress(KeyEvent.VK_ENTER);
		objRobot.keyRelease(KeyEvent.VK_ENTER);
		//pasete operation
		
		objRobot.keyPress(KeyEvent.VK_CONTROL);
		objRobot.keyPress(KeyEvent.VK_V);
		
		objRobot.keyRelease(KeyEvent.VK_CONTROL);
		objRobot.keyRelease(KeyEvent.VK_V);
		//now enter --open file in browser
		objRobot.keyPress(KeyEvent.VK_ENTER);
		objRobot.keyRelease(KeyEvent.VK_ENTER);
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
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
