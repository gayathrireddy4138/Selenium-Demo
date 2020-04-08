package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JPetDogsPage 
{
	
	@FindBy(xpath = "//*[@id=\"MainImageContent\"]/map/area[3]")
	WebElement dogimage;
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[5]/td[1]/a")
	WebElement productid;
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
	WebElement itemid;
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a")
	WebElement addcart;
	@FindBy(xpath = "//*[@id=\"Cart\"]/a")
	WebElement proceed;
	
	public JPetDogsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		public void dogs_dogimage()
		{
			dogimage.click();	
			
		}
		public void dogs_productid()
		{
			productid.click();
			
		}
		public void dogs_itemid()
		{
			itemid.click();
			
		}
		public void dogs_addcart()
		{
			addcart.click();
			
		}
		public void dogs_proceed()
		{
			proceed.click();
			
		}
}
