package com.fis.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.fis.pages.BasePage;
import com.fis.pages.HomePage;
import com.fis.pages.Page;

public abstract class BaseTest {


	public WebDriver driver;
	public WebDriverWait wait;
	public Page page;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/dobriyaldevesh/eclipse-workspace/fisautomation/Framework/chromedriver");
		driver = new ChromeDriver();
		
		wait = new WebDriverWait(driver, 30);
		driver.manage().window().fullscreen();
		driver.get("https://www.ebay.com/");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// create the object of page class: Instantiate Page Class
		page = new HomePage(driver, wait);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
