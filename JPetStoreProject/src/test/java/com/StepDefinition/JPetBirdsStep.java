package com.StepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Pages.JPetBirdsPage;
import com.Pages.JPetLoginPage;
import com.baseclass.LibraryFile;
import com.seleniumutility.UtilityFile;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JPetBirdsStep extends LibraryFile
{
	JPetLoginPage login;
	UtilityFile util;
	JPetBirdsPage birdspage;
	final static Logger LOG = LogManager.getLogger(JPetBirdsStep.class.getName());
	
	@When("^Bird JPetStore Page opened$")
	public void bird_JPetStore_Page_opened() throws InterruptedException 
	{
		login = new JPetLoginPage(driver);
		login.login_username("Reddy4138");
		login.login_password("chitti@413");
		login.login_loginbtn();
		Thread.sleep(1000);
		LOG.info("entered username and password for login");
	}

	@Then("^Click The Birds Image$")
	public void click_The_Birds_Image() throws InterruptedException
	{
		birdspage = new JPetBirdsPage(driver);
		birdspage.birds_birdimage();
		Thread.sleep(1000);
		//System.out.println("Bird Image clicked");
		LOG.info("Bird Image clicked");
	}

	@Then("^Click The ProductID of Bird$")
	public void click_The_ProductID_of_Bird() throws InterruptedException
	{
		birdspage.birds_productid();
		Thread.sleep(1000);
		LOG.info("Bird ProductID clicked");
	}

	@Then("^Click The ItemId of Bird$")
	public void click_The_ItemId_of_Bird() throws InterruptedException
	{
		birdspage.birds_itemid();
		Thread.sleep(1000);
		LOG.info("Bird ItemID clicked");
		
		util = new UtilityFile(driver);
		util.takeSnapShot("G:\\Project\\src\\test\\resources\\JPetScreenShot\\Birds.png");
		LOG.info("Bird page opened and ScreenShot taken");
	}

	@Then("^Click The AddToCart$")
	public void click_The_AddToCart() throws InterruptedException
	{
		birdspage.birds_addcart();
		Thread.sleep(1000);
		LOG.info("AddToCart clicked");
	}

	@Then("^Click The ProceedToCheckOut$")
	public void click_The_ProceedToCheckOut() throws InterruptedException
	{
		birdspage.birds_proceed();
		Thread.sleep(1000);
		LOG.info("Bird added to cart and Proceed clicked");
		LOG.info("Payment Page is opened");
		
		Thread.sleep(2000);
		driver.quit();
	}


}
