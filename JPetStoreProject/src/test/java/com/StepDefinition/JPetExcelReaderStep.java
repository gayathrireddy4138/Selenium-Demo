package com.StepDefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Excel.ExcelReader;
import com.Pages.JPetLoginPage;
import com.baseclass.LibraryFile;
import com.seleniumutility.UtilityFile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class JPetExcelReaderStep extends LibraryFile
{
	JPetLoginPage excellogin;
	UtilityFile util;
	ExcelReader  excel;
	final static Logger LOG = LogManager.getLogger(JPetExcelReaderStep.class.getName());
	@Given("^The jpetstore page is opened$")
	public void the_jpetstore_page_is_opened() throws IOException
	{
		launchApplication();
		LOG.info("chrome opened");
	}

	@Then("^Login page is opened$")
	public void login_page_is_opened() 
	{
		excellogin = new JPetLoginPage(driver);
		excel = new ExcelReader();
		LOG.info("Login page opened");
		
	}

	@Then("^The <email> and <password> details are given$")
	public void the_email_and_password_details_are_given() throws IOException
	{
		excel = new ExcelReader();
		excellogin.login_username(excel.excel_username(1));
		excellogin.login_password(excel.excel_userpassword(1));
		excellogin.login_loginbtn();
		LOG.info("Login Done by excel read data");
		
	}

	@Then("^Login and quit$")
	public void login_and_quit() throws InterruptedException
	{
		util = new UtilityFile(driver);
		util.takeSnapShot("G:\\Project\\src\\test\\resources\\JPetScreenShot\\LoginExcel.png");
		LOG.info("Login page opened and ScreenShot taken");
		
		Thread.sleep(2000);
		driver.quit();
	}

}
