package com.StepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Pages.JPetFishPage;
import com.Pages.JPetLoginPage;
import com.baseclass.LibraryFile;
import com.seleniumutility.UtilityFile;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JPetFishStep extends LibraryFile
{
	JPetLoginPage login;
	UtilityFile util;
	JPetFishPage fishpage;
	final static Logger LOG = LogManager.getLogger(JPetFishStep.class.getName());
	
	@When("^Fish JPetStore Page opened$")
	public void fish_JPetStore_Page_opened() throws InterruptedException
	{
		login = new JPetLoginPage(driver);
		login.login_username("Reddy4138");
		login.login_password("chitti@413");
		login.login_loginbtn();
		Thread.sleep(1000);
		LOG.info("Login done JPetStore Menu page opened");
	}

	@Then("^Clicks The Fish Image$")
	public void clicks_The_Fish_Image() throws InterruptedException
	{
		fishpage = new JPetFishPage(driver);
		fishpage.fish_fishimage();
		Thread.sleep(1000);
		LOG.info("Fish Image clicked");	
	}

	@Then("^Clicks The ProductID for Fish$")
	public void clicks_The_ProductID_for_Fish() throws InterruptedException
	{
		fishpage.fish_productid();
		Thread.sleep(1000);
		LOG.info("Fish ProductID clicked");
	}

	@Then("^Clicks The ItemId for Fish$")
	public void clicks_The_ItemId_for_Fish() throws InterruptedException
	{
		fishpage.fish_itemid();
		Thread.sleep(1000);
		LOG.info("Fish ItemID clicked");
		
		util = new UtilityFile(driver);
		util.takeSnapShot("G:\\Project\\src\\test\\resources\\JPetScreenShot\\Fishes.png");
		LOG.info("Fish page opened and ScreenShot taken");
	}

	@Then("^Clicks The AddToCart for Fish$")
	public void clicks_The_AddToCart_for_Fish() throws InterruptedException
	{
		fishpage.fish_addcart();
		Thread.sleep(1000);
		LOG.info("AddToCart clicked");
	}

	@Then("^Clicks The ProceedToCheckOut for Fish$")
	public void clicks_The_ProceedToCheckOut_for_Fish() throws InterruptedException
	{
		fishpage.fish_proceed();
		Thread.sleep(1000);
		LOG.info("Fish added to cart and Proceed clicked");
		LOG.info("Payment Page is opened");
		
		Thread.sleep(2000);
		driver.quit();
	}
}
