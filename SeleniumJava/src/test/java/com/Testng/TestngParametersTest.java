package com.Testng;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class TestngParametersTest {
	
  @Parameters({"BrowserName"})
  @Test(priority = 1)
  public void browsername(String BrowserName) {
	  System.out.println( BrowserName);
  }
  
  @Parameters({"Username","Password"})
  @Test(priority = 2)
  public void userDetails(String username,String pass ) {
	  
	  System.out.println( username + " "+ pass);
  }

  @Parameters({"Email"})
  @Test(priority = 3)
  public void userEmail(String email ) {
	  
	  System.out.println( email);
  }
 

}
