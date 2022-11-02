package com.nopcommerce.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}

	// Email field 
	@FindBy(xpath = "//input[@id='Email']")
	@CacheLookup
	WebElement txtEmail;
	
	// PasswordField
	@FindBy(id ="Password")
	@CacheLookup
	WebElement txtPassword;
	
	//Login Button
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	@CacheLookup
	WebElement btnLogin;
	
	
	//Logout Link
	@FindBy(linkText = "Logout")
	@CacheLookup
	WebElement lnkLogout;
	
	
	public void enterEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void enterPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clicklogin()
	{
		btnLogin.click();
	}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
}
