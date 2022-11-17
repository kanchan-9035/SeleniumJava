package com.Testng;

import org.testng.annotations.Test;


//invocation count and threadpoolSize
public class TestngThreadOperation {
  @Test(invocationCount = 5, threadPoolSize = 1)
  public void Tc1() {
	  System.out.println("Executing TC 1");
  }
  
  @Test(invocationCount = 5, threadPoolSize = 2)
  public void Tc2() {
	  System.out.println("Executing TC 2");
  }
  
  @Test(invocationCount = 5, threadPoolSize = 3)
  public void Tc3() {
	  System.out.println("Executing TC 3");
  }
  
  @Test(invocationCount = 5, threadPoolSize = 2)
  public void Tc4() {
	  System.out.println("Executing TC 4");
  }
  
  
}
