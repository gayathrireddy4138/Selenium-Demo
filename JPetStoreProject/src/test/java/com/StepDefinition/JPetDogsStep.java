package com.StepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Pages.JPetDogsPage;
import com.Pages.JPetLoginPage;

import com.baseclass.LibraryFile;
import com.seleniumutility.UtilityFile;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JPetDogsStep extends LibraryFile
{
	JPetLoginPage login;
	UtilityFile util;
	JPetDogsPage dogspage;
	final static Logger LOG = LogManager.getLogger(JPetDogsStep.class.getName());
	
	@When("^Dogs JPetStore Page opened$")
	public void dogs_JPetStore_Page_opened() throws InterruptedException
	{
		login = new JPetLoginPage(driver);
		login.login_username("Reddy4138");
		login.login_password("chitti@413");
		login.login_loginbtn();
		Thread.sleep(1000);
		LOG.info("Login done JPetStore Menu page opened");
	}

	@Then("^Clicks The Dogs Image$")
	public void clicks_The_Dogs_Image() throws InterruptedException
	{
		dogspage = new JPetDogsPage(driver);
		dogspage.dogs_dogimage();
		Thread.sleep(1000);
		LOG.info("Dog Image clicked");
	}

	@Then("^Clicks The ProductID for Dogs$")
	public void clicks_The_ProductID_for_Dogs() throws InterruptedException
	{
		dogspage.dogs_productid();
		Thread.sleep(1000);
		LOG.info("Dog ProductID clicked");
	}

	@Then("^Clicks The ItemId for Dogs$")
	public void clicks_The_ItemId_for_Dogs() throws InterruptedException
	{
		dogspage.dogs_itemid();
		Thread.sleep(1000);
		LOG.info("Dog ItemID clicked");
		
		util = new UtilityFile(driver);
		util.takeSnapShot("G:\\Project\\src\\test\\resources\\JPetScreenShot\\Dogs.png");
		LOG.info("Dog page opened and ScreenShot taken");
	}

	@Then("^Clicks The AddToCart for Dogs$")
	public void clicks_The_AddToCart_for_Dogs() throws InterruptedException
	{
		dogspage.dogs_addcart();
		Thread.sleep(1000);
		LOG.info("AddToCart clicked");
	}

	@Then("^Clicks The ProceedToCheckOut for Dogs$")
	public void clicks_The_ProceedToCheckOut_for_Dogs() throws InterruptedException
	{
		dogspage.dogs_proceed();
		Thread.sleep(1000);
        LOG.info("Dog added to cart and Proceed clicked");
		LOG.info("Payment Page is opened");
		
		Thread.sleep(2000);
		driver.quit();
	}

}
