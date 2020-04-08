package com.StepDefinition;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Pages.JPetLoginPage;
import com.Pages.JPetReptilesPage;
import com.baseclass.LibraryFile;
import com.seleniumutility.UtilityFile;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JPetReptilesStep  extends LibraryFile
{
	JPetLoginPage login;
	UtilityFile util;
	JPetReptilesPage reptilespage;
	
	final static Logger LOG = LogManager.getLogger(JPetReptilesStep.class.getName());
	
	@When("^Reptiles JPetStore Page opened$")
	public void reptiles_JPetStore_Page_opened() throws InterruptedException
	{
		login = new JPetLoginPage(driver);
		login.login_username("Reddy4138");
		login.login_password("chitti@413");
		login.login_loginbtn();
		
		
		Thread.sleep(1000);
		LOG.info("Login done JPetStore Menu page opened");
	}

	@Then("^Click The Reptile Image$")
	public void click_The_Reptile_Image() throws InterruptedException
	{
		reptilespage = new JPetReptilesPage(driver);
		reptilespage.reptiles_reptileimage();
		Thread.sleep(1000);
		LOG.info("Reptile Image clicked");
	}

	@Then("^Click The ProductID of Reptile$")
	public void click_The_ProductID_of_Reptile() throws InterruptedException
	{
		reptilespage.reptiles_productid();
		Thread.sleep(1000);
		LOG.info("Reptile ProductID clicked");
	}

	@Then("^Click The ItemId of Reptile$")
	public void click_The_ItemId_of_Reptile() throws InterruptedException
	{
		reptilespage.reptiles_itemid();
		Thread.sleep(1000);
		LOG.info("Reptile ItemID clicked");
		
		util = new UtilityFile(driver);
		util.takeSnapShot("G:\\Project\\src\\test\\resources\\JPetScreenShot\\Reptiles.png");
		System.out.println("Reptile page opened and ScreenShot taken");
	}

	@Then("^Click The AddToCart of Reptile$")
	public void click_The_AddToCart_of_Reptile() throws InterruptedException
	{
		reptilespage.reptiles_addcart();
		Thread.sleep(1000);
		LOG.info("AddToCart clicked");
	}

	@Then("^Click The ProceedToCheckOut of Reptile$")
	public void click_The_ProceedToCheckOut_of_Reptile() throws InterruptedException
	{
		reptilespage.reptiles_proceed();
		Thread.sleep(1000);
		LOG.info("Reptile added to cart and Proceed clicked");
		LOG.info("Payment Page is opened");
		
		Thread.sleep(2000);
		driver.quit();
	}

}
