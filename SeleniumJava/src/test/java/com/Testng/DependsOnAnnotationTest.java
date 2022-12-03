package com.Testng;

import org.testng.annotations.Test;

public class DependsOnAnnotationTest {
  @Test(dependsOnGroups = "Test2")
  public void Test1() {

	  System.out.println("test 2");
	  
  }
  public void Test2() {
	  System.out.println("test 2");
  }
}
