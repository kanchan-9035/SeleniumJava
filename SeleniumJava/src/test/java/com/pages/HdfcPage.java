package com.pages;

import org.openqa.selenium.By;

public class HdfcPage {

	public static By customerId= By.xpath("//input[@type=\"text\"]");
	public static By forgotPassword=By.linkText("Forgot Customer ID");
	public static By continueToNextPage=By.linkText("CONTINUE");
	public static By knowMore=By.partialLinkText("Know More..");
	public static By register=By.linkText("Register Now ");
	public static By getCustomerId() {
		return customerId;
	}
	public static void setCustomerId(By customerId) {
		HdfcPage.customerId = customerId;
	}
	public static By getForgotPassword() {
		return forgotPassword;
	}
	public static void setForgotPassword(By forgotPassword) {
		HdfcPage.forgotPassword = forgotPassword;
	}
	public static By getContinueToNextPage() {
		return continueToNextPage;
	}
	public static void setContinueToNextPage(By continueToNextPage) {
		HdfcPage.continueToNextPage = continueToNextPage;
	}
	public static By getKnowMore() {
		return knowMore;
	}
	public static void setKnowMore(By knowMore) {
		HdfcPage.knowMore = knowMore;
	}
	public static By getRegister() {
		return register;
	}
	public static void setRegister(By register) {
		HdfcPage.register = register;
	}
	
	//getters
	
	
}
