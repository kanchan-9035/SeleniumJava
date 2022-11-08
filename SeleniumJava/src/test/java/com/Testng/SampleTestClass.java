package com.Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SampleTestClass {
  @Test
  public void testUrl() {
	  System.out.println("we are running testng suite test case 1");
  }
  
  @Test
  public void testUrl2() {
	  System.out.println("we are running testng suite test case 2");
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("befor method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("print after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("print before class");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("print after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	 System.out.println("before test suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after test suite end of execution");
	  System.out.println("why not executing me");
  }

}
