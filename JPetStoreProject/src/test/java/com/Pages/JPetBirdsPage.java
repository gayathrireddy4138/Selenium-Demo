package com.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JPetBirdsPage 
{
	
	@FindBy(id = "MainImageContent")
	WebElement birdimage;
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
	WebElement productid;
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
	WebElement itemid;
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a")
	WebElement addcart;
	@FindBy(xpath = "//*[@id=\"Cart\"]/a")
	WebElement proceed;
	
	public JPetBirdsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		public void birds_birdimage()
		{
			birdimage.click();	
		}
		public void birds_productid()
		{
			productid.click();
		}
		public void birds_itemid()
		{
			itemid.click();
		}
		public void birds_addcart()
		{
			addcart.click();
		}
		public void birds_proceed()
		{
			proceed.click();
		}
}
