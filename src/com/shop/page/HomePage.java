package com.shop.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shop.generic.Basepage;

public class HomePage extends Basepage{

	public HomePage(WebDriver driver) {
		
		super(driver);
		
	}
	@FindBy(xpath="//a[text()='Sign In']")
	private WebElement Signin;
	
	@FindBy(xpath="//input[@id='main_user_login']")
	private WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//a[@id='login_button']")
	private WebElement login;
	
	public void signin()
	{
		Signin.click();
	}
	
	public void enterusername(String un)
	{
		username.sendKeys(un);
	}
	
	public void enterpwd(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickonsign(){
		login.click();
	}

}
