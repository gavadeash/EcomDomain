package com.utility;

import java.time.Duration;

import com.base.Baseclass;

public class utility extends Baseclass  {
	
	public void Implicitlywait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	}
	
	

}
