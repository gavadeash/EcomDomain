package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class LoginPom extends Baseclass {
	
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[text()='username : Admin']")
	private WebElement username;
	@FindBy(xpath="//p[text()='password : admin123']")
	private WebElement password;
	@FindBy(name ="username") private WebElement inputusername;
	@FindBy(name ="Password") private WebElement inputpassword;
	@FindBy(xpath="//button[@type='submit']")private WebElement Loginbutton;
	@FindBy(xpath=" ")private WebElement abc;
	
	public String getUsername()
	{
		String uname= username.getText();
		return uname.substring(uname.indexOf(':'),uname.length()-1);
		
	}
	
	public String getpassword()
	{
		String pass = password.getText();
		
		return pass.substring(pass.indexOf(':'),pass.length()-1);
	}
	public void clickonloginbutton()
	{
		Loginbutton.click();
	}
	
	public void setinputusername(String setusername)
	{
		inputusername.sendKeys(setusername);
	}
	
	public void setinputpassword(String setpassword)
	{
		inputpassword.sendKeys(setpassword);
	}
	
	
	
	


}
