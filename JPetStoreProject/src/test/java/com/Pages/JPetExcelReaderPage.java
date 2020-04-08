package com.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JPetExcelReaderPage 
{
    
	
	@FindBy(name = "username")
	WebElement username;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(id = "login")
	WebElement loginbtn;
	
	public JPetExcelReaderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void login_username(String uname)
	{
		username.sendKeys(uname);	
		
	}
	public void login_password(String pass)
	{
		username.sendKeys(pass);	
		
	}
	
	public void login_loginbtn() 
	{
		loginbtn.click();
	}
}
