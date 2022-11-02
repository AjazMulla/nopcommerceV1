package com.nopcommerce.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nopcommerce.pageObjects.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws InterruptedException
	{
		driver.get(baseURL);
		
		LoginPage lp = new LoginPage(driver);
		//lp.enterEmail(email);
		//lp.enterPassword(pwd);
		lp.clicklogin();
		
		Thread.sleep(5000);
		
		if (driver.getTitle().equals("Dashboard / nopCommerce administration"))
		{
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		lp.clickLogout();
	}
	
	

}
