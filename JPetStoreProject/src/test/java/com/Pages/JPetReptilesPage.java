package com.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JPetReptilesPage 
{		
		@FindBy(xpath = "//*[@id=\"MainImageContent\"]/map/area[4]")
		WebElement reptileimage;
		@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
		WebElement productid;
		@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
		WebElement itemid;
		@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a")
		WebElement addcart;
		@FindBy(xpath = "//*[@id=\"Cart\"]/a")
		WebElement proceed;
		
		
		public JPetReptilesPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
			public void reptiles_reptileimage()
			{
				reptileimage.click();	
				
			}
			public void reptiles_productid()
			{
				productid.click();
				
			}
			public void reptiles_itemid()
			{
				itemid.click();
				
			}
			public void reptiles_addcart()
			{
				addcart.click();
				
			}
			public void reptiles_proceed()
			{
				proceed.click();
				
			}
}
