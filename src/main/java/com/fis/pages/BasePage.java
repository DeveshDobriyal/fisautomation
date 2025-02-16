package com.fis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Page {

	public BasePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	// generic util wrappers:
	public void doClick(By locator) {
		driver.findElement(locator).click();
	}

	public void doSendKeys(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}

	public String doGetText(By locator) {
		return driver.findElement(locator).getText();
	}

	@Override
	public String getPageTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPageHeader() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebElement getElement(By locator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void waitForelementPresent(By locator) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void waitForPageTitle(By locator) {
		// TODO Auto-generated method stub
		
	}

}
