package com.shop.generic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Basepage implements Autoconstant{
	public WebDriver driver;
	public Basepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void pageload(long time)
	{
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
	}
	public void Select(WebElement wb,int index)
	{
		Select sel=new Select(wb);
		sel.selectByIndex(index);
		
	}
	public void Action(WebDriver driver,WebElement wb)
	{
		Actions act=new Actions(driver);
		act.moveToElement(wb).click().perform();
		
	}

}
