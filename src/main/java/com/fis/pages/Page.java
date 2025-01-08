package com.fis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {

	public WebDriver driver;
	public WebDriverWait wait;

	// page class constructor:
	public Page(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = new WebDriverWait(this.driver, 15);
	}

	public abstract String getPageTitle();

	public abstract String getPageHeader();

	public abstract WebElement getElement(By locator);

	public abstract void waitForelementPresent(By locator);

	public abstract void waitForPageTitle(By locator);

	// create a method with Java Generics and return a new page
	public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) {
		try {
			return pageClass.getDeclaredConstructor(WebDriver.class, WebDriverWait.class).newInstance(this.driver,
					this.wait);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
