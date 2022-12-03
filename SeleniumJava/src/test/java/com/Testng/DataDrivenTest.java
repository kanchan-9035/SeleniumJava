package com.Testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.utility.Library;

public class DataDrivenTest extends Library{
	
	
  @Test
  public void validatePageLoad() {
	  driver.get(objProperties.getProperty("AutomationRegister"));
		PageLoadTimeOut();
		System.out.println("inside ValidateFileUploadPageSuccessfully");
		String TitleOfJqueryPage = driver.getTitle();
		System.out.println("TitleOfJqueryPage:"+TitleOfJqueryPage);
		Assert.assertEquals(TitleOfJqueryPage, objProperties.getProperty("TitleOfRegisterPage"));  
  }
  
  @Test
  public void verifyDataDrivenFromExcel() throws IOException {
	  System.out.println("inside of data driven test");
	  File objFile=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\AutomationDemoSIte.xlsx");
	  try {
		FileInputStream objFin=new FileInputStream(objFile);
		//if extension of file is xsls
		
		XSSFWorkbook objWorkbook=new XSSFWorkbook(objFin);
		XSSFSheet objSheet=objWorkbook.getSheet("TestData");
		int noOfRow=objSheet.getLastRowNum();
		
		for(int row=1;row<=noOfRow;row++) {
			
			hmap =ReadExcelFile(row, objSheet);
			System.out.println("---------------------------");
			System.out.println(hmap.get("FirstName"));
			System.out.println(hmap.get("LastName"));
			
		}
		
	} catch (FileNotFoundException e) {
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
