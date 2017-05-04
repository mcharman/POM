package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By username = By.id("user_login");
	By password = By.id("user_pass");
	By loginButton = By.id("wp-submit");
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void typeUserName()
	{
		driver.findElement(username).sendKeys("admin");
	}
	
	public void typePassword()
	{
		driver.findElement(password).sendKeys("demo123");
	}
	
	public void clickOnLoginButton()
	{
		driver.findElement(loginButton).click();
	}
}
