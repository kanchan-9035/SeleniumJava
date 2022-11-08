package com.pages;

import org.openqa.selenium.By;

public class Oracle {
	public static By emailId=By.xpath("//*[contains(@name,'sView1:r1:0:email')]");
	public static By password=By.xpath("//input[contains(@name,'sView1:r1:0:password')]");
	public static By resetPassword= By.xpath("//input[contains(@name,'sView1:r1:0:retypePassword')]");
	public static By country=By.xpath("//select[@id='sView1:r1:0:country::content']");
	public static By firstName=By.xpath("//input[@name='sView1:r1:0:firstName']");
	public static By lastName=By.xpath("//input[@name='sView1:r1:0:lastName']");
	public static By jobTitle= By.xpath("//input[@name='sView1:r1:0:jobTitle']");
	public static By workPhone= By.xpath("//input[@name='sView1:r1:0:workPhone']");
	public static By companyName= By.xpath("//*[@id=\"sView1:r1:0:companyName\"]");
	public static By address= By.xpath("//*[@id=\"sView1:r1:0:address1::content\"]");
	
	
	
	

}
