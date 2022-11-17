package com.Testng;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestngFactoryAnnotation {
	private String param=""; 
	
	public TestngFactoryAnnotation(String parameter) 
	{
		this.param=parameter;
	}
  @Test
  public void Test2() {
	  System.out.println("TC2 :: "+param);
		
  }
  @Test
  public void Test1() {
	  System.out.println("TC1 :: "+param);
		
  }
  @Test
  public void Test3() {
	  System.out.println("TC3 :: ");
		
  }
  @Test
  public void Test4() {
	  System.out.println("TC4 :: "+param);
		
  }
  @Factory
  public Object[] FactoryMethod() {
	return new Object[]  {
		new TestngFactoryAnnotation("Hello ")
	};
	  
  }
}
