package com.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JPetFishPage 
{
	
	@FindBy(xpath = "//*[@id=\"MainImageContent\"]/map/area[2]")
	WebElement fishimage;
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[5]/td[1]/a")
	WebElement productid;
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
	WebElement itemid;
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a")
	WebElement addcart;
	@FindBy(xpath = "//*[@id=\"Cart\"]/a")
	WebElement proceed;
	
	
	public JPetFishPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		public void fish_fishimage()
		{
			fishimage.click();	
			
		}
		public void fish_productid()
		{
			productid.click();
			
		}
		public void fish_itemid()
		{
			itemid.click();
			
		}
		public void fish_addcart()
		{
			addcart.click();
			
		}
		public void fish_proceed()
		{
			proceed.click();
			
		}
}
