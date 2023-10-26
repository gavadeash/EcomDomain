package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	public WebDriver driver;
	public Properties properties; 
	public WebDriver launchTheweb(String Url) throws IOException {
	
	   FileInputStream file = new FileInputStream(".\\src\\main\\resources\\property\\confg.properties");
	   
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		properties = new Properties();
		
		  properties.load(file);
		   
		
		driver.get(	properties.getProperty("weburl1"));
		return driver;
		
	
		
		
	
		
		
	    
	}

}
