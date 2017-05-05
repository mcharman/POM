package com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.Pages.LoginPage;

public class VerifyWordpressLogin 
{
	@Test
	public void verifyValidLogin()
	{
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		LoginPage login = new LoginPage(driver);
		login.typeUserName();
		
		login.typePassword();
		
		login.clickOnLoginButton();
		
		driver.quit();
		
	}
		
	
}
