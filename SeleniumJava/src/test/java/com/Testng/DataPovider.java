package com.Testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataPovider {
	
  @Test(dataProvider = "test")
  public void f(Integer n, String s) {
	  System.out.println("test data is :: "+ n + " "+s);
	  
  }
  
  @Test(dataProvider = "strings")
  public void test(String str) {
	  
	  System.out.println("Value is  ::" +str);
	  
  }
  @DataProvider(name = "strings")
  public Object[] stringArray(){
	return new Object[]{
			 new String("hello"),
			 new String("string"),
			 new String("in"),
			 new String("eclipse")
	}; 
	  
  }

  
  @DataProvider
  public Object[][] test() {
	  
    return new Object[][] {
    	new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
