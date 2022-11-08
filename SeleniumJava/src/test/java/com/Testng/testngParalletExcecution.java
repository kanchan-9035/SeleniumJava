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

public class testngParalletExcecution {
  @Test
  public void TC1() {
	  System.out.println("Excecuting Tc1");
  }
  
  @Test
  public void TC2() {
	  System.out.println("Excecuting Tc1");
  }
  
  @Test
  public void TC3() {
	  System.out.println("Excecuting Tc1");
  }
  
  @Test
  public void TC4() {
	  System.out.println("Excecuting Tc1");
  }
  
  @Test(invocationCount = 2)
  public void TC5() {
	  System.out.println("Excecuting Tc1");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Excecuting beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Excecuting afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Excecuting beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Excecuting afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Excecuting beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Excecuting afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Excecuting beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Excecuting afterSuite");
  }

}
