package com.StepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Pages.JPetCatsPage;
import com.Pages.JPetLoginPage;
import com.baseclass.LibraryFile;
import com.seleniumutility.UtilityFile;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JPetCatsStep extends LibraryFile
{
	JPetLoginPage login;
	UtilityFile util;
	JPetCatsPage catspage;
	
	final static Logger LOG = LogManager.getLogger(JPetCatsStep.class.getName());
	
	@When("^Cats JPetStore Page opened$")
	public void cats_JPetStore_Page_opened() throws InterruptedException
	{
		login = new JPetLoginPage(driver);
		login.login_username("Reddy4138");
		login.login_password("chitti@413");
		login.login_loginbtn();
		Thread.sleep(1000);
		LOG.info("Login done JPetStore Menu page opened");
	}

	@Then("^Click The Cat Image$")
	public void click_The_Cat_Image() throws InterruptedException
	{
		catspage = new JPetCatsPage(driver);
		catspage.cats_catimage();
		Thread.sleep(1000);
		LOG.info("Cat Image clicked");
	}

	@Then("^Click The ProductID of Cat$")
	public void click_The_ProductID_of_Cat() throws InterruptedException
	{
		catspage.cats_productid();
		Thread.sleep(1000);
		LOG.info("Cat ProductID clicked");
	}

	@Then("^Click The ItemId of Cat$")
	public void click_The_ItemId_of_Cat() throws InterruptedException
	{
		catspage.cats_itemid();
		Thread.sleep(1000);
		System.out.println("Cat ItemID clicked");
		
		util = new UtilityFile(driver);
		util.takeSnapShot("G:\\Project\\src\\test\\resources\\JPetScreenShot\\Cats.png");
		LOG.info("Cat page opened and ScreenShot taken");
	}

	@Then("^Click The AddToCart for cat$")
	public void click_The_AddToCart_for_cat() throws InterruptedException
	{
		catspage.cats_addcart();
		Thread.sleep(1000);
		LOG.info("AddToCart clicked");
	}

	@Then("^Click The ProceedToCheckOut for cat$")
	public void click_The_ProceedToCheckOut_for_cat() throws InterruptedException
	{
		catspage.cats_proceed();
		Thread.sleep(1000);
		LOG.info("Cat added to cart and Proceed clicked");
		LOG.info("Payment Page is opened");
		
		Thread.sleep(2000);
		driver.quit();
	}

}
