package com.shop.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import com.shop.generic.BaseTest;

import com.shop.generic.ExcelData1;
import com.shop.page.HomePage;
@Listeners

public class logintest extends BaseTest{
	@Test
	public void testlogin() throws EncryptedDocumentException, InvalidFormatException, IOException{
		
	
	String un=ExcelData1.Getdata("Sheet1",1,0);
	String pwd=ExcelData1.Getdata("Sheet1",1,1);
	System.out.println(un);
	System.out.println(pwd);
	HomePage hp=new HomePage(driver);
	hp.signin();
	log.info("click on signin button");
	
	
	hp.enterusername(un);
	hp.enterpwd(pwd);
	
	hp.clickonsign();
	

}}
