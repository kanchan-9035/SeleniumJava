package com.pages;

import org.openqa.selenium.By;

public class Oracle {
	//public static By emailId=By.xpath("//input[@id='sView1:r1:0:email::content']");
	
	public static By emailId=By.name("sView1:r1:0:email");
	
	
	public static By password=By.xpath("//input[@id='sView1:r1:0:password::content']");
	public static By resetPassword= By.xpath("//input[contains(@name,'sView1:r1:0:retypePassword')]");
	public static By country=By.xpath("//select[@id='sView1:r1:0:country::content']");
	public static By firstName=By.xpath("//input[@name='sView1:r1:0:firstName']");
	public static By lastName=By.xpath("//input[@name='sView1:r1:0:lastName']");
	public static By jobTitle= By.xpath("//input[@name='sView1:r1:0:jobTitle']");
	public static By workPhone= By.xpath("//input[@name='sView1:r1:0:workPhone']");
	public static By companyName= By.xpath("//*[@id=\"sView1:r1:0:companyName\"]");
	public static By address= By.xpath("//*[@id=\"sView1:r1:0:address1::content\"]");
	public static By city= By.xpath("//input[@id='sView1:r1:0:city::content']");
	public static By state= By.xpath("//select[@id='sView1:r1:0:state::content']");
	
	public static By zipCode= By.xpath("//input[@id='sView1:r1:0:postalCode::content']");
	public static By createAccount= By.xpath("//div[@id='sView1:r1:0:b1']");
	
}
