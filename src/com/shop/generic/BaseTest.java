package com.shop.generic;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public abstract class BaseTest implements Autoconstant{
	public static WebDriver driver;
	public Logger log=Logger.getLogger("log4j.properties");
	@BeforeMethod
	public void precondition()
	{
		System.setProperty(Chrome_key,Chrome_value);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.shopclues.com/");

		
	}
	@AfterMethod
	public void postcondition()
	{
		driver.close();
	}

}
