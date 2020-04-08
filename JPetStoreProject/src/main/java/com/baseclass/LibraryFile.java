package com.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LibraryFile
{
	
		public static WebDriver driver;
		Logger LOG = Logger.getLogger(LibraryFile.class.getName());
		public static Properties prop;
		
		public void launchApplication() throws IOException
		{
			FileInputStream fis=new FileInputStream("G:\\Project\\src\\test\\resources\\ConfigurationProperty\\Config.Property");
		    prop = new Properties();
			prop.load(fis);
			String browser=prop.getProperty("browser");
			String url=prop.getProperty("url");
			
			try {
				if (browser.equalsIgnoreCase("Firefox"))
				{
					driver = new FirefoxDriver();
				}
				else if(browser.equalsIgnoreCase("chrome"))
				{
					System.setProperty("webdriver.chrome.driver", "E://Selenium//chromedriver_win32//chromedriver.exe");
					driver = new ChromeDriver();
				}
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get(url);
			}
			catch(WebDriverException e)
			{
				System.out.println("browser could not be launched");
			}
		}
		public void quit()
		{
			driver.close();
		}
}
