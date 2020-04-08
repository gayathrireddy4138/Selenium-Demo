package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JPetCatsPage 
{
	@FindBy(xpath = "//*[@id=\"MainImageContent\"]/map/area[5]")
	WebElement catimage;
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
	WebElement productid;
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
	WebElement itemid;
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a")
	WebElement addcart;
	@FindBy(xpath = "//*[@id=\"Cart\"]/a")
	WebElement proceed;
	
	
	public JPetCatsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		public void cats_catimage()
		{
			catimage.click();	
			
		}
		public void cats_productid()
		{
			productid.click();
			
		}
		public void cats_itemid()
		{
			itemid.click();
			
		}
		public void cats_addcart()
		{
			addcart.click();
			
		}
		public void cats_proceed()
		{
			proceed.click();
			
		}
}
