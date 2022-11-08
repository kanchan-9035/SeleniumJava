package com.pages;

import org.openqa.selenium.By;

public class Facebook {

	public static By emailAddress=By.xpath("//input[@id=\"email\"]");
	public static By Password = By.xpath("//input[@id=\"pass\"]");
	public static By createAccount=By.xpath("//a[text()=\"Create New Account\"]");
	public static By login=By.xpath("//button[@name=\"login\"]");
	public static By forgetPassword=By.xpath("//a[text()=\"Forgotten password?\"]");
	public static By firstName=By.name("firstname");
	public static By surName=By.name("lastname");
	public static By mobNumber=By.name("reg_email__");
	public static By passWordNew=By.id("password_step_input");
	public static By day=By.id("day");
	public static By month= By.id("month");
	public static By year=By.id("year");
	public static By genderFemale= By.xpath("//*[contains(text(),'Female')]");
	public static By genderMale= By.xpath("//*[contains(text(),'Male')]");
	public static By genderCustom= By.xpath("//*[contains(text(),'Custom')]");
	public static By signUp=By.xpath("//*[contains(@name,'websubmit')]");
	
	
	public static By getFirstName() {
		return firstName;
	}
	public static void setFirstName(By firstName) {
		Facebook.firstName = firstName;
	}
	public static By getSurName() {
		return surName;
	}
	public static void setSurName(By surName) {
		Facebook.surName = surName;
	}
	public static By getMobNumber() {
		return mobNumber;
	}
	public static void setMobNumber(By mobNumber) {
		Facebook.mobNumber = mobNumber;
	}
	public static By getPassWordNew() {
		return passWordNew;
	}
	public static void setPassWordNew(By passWordNew) {
		Facebook.passWordNew = passWordNew;
	}
	public static By getEmailAddress() {
		return emailAddress;
	}
	public static void setEmailAddress(By emailAddress) {
		Facebook.emailAddress = emailAddress;
	}
	public static By getPassword() {
		return Password;
	}
	public static void setPassword(By password) {
		Password = password;
	}
	
	
}
