package com.testclasses;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Baseclass;
import com.pom.LoginPom;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LoginTest extends Baseclass{
	
	LoginPom login;
	
	
	@BeforeMethod 
	public void Setup()
	{
		login = new LoginPom();
	}
	@Test
	
	public void loginTest()
	{
		login.setinputusername(login.getUsername());
		login.setinputpassword(login.getpassword());
		login.clickonloginbutton();
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
