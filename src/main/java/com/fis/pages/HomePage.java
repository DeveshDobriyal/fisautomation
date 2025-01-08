package com.fis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {


	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}

	// page locators:
	By header = By.className("private-page__title");

	By searchTextbox = By.xpath("//input[@aria-label=\"Search for anything\"]");

	By searchButton = By.xpath("//input[@value=\"Search\"]");
	By firstbookLink = By.xpath("//ul/li[1]//img[contains(@alt,\"Han Kang The Vegetarian\")]");
	By addButton = By.xpath("//span[text()=\"Add to cart\"]/ancestor::a");
	By cartButton = By.xpath("//i[@id=\"gh-cart-n\"]");

	// page actions:
	public String getBookinKart() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchTextbox));
		doSendKeys(searchTextbox, "the vegetarian han kang");

		wait.until(ExpectedConditions.visibilityOfElementLocated(searchButton));
		wait.until(ExpectedConditions.elementToBeClickable(searchButton));
		doClick(searchButton);

		wait.until(ExpectedConditions.visibilityOfElementLocated(firstbookLink));
		wait.until(ExpectedConditions.elementToBeClickable(firstbookLink));
		doClick(firstbookLink);

		switchToNewWindow();

		wait.until(ExpectedConditions.visibilityOfElementLocated(addButton));
		wait.until(ExpectedConditions.elementToBeClickable(addButton));
		doClick(addButton);

		wait.until(ExpectedConditions.visibilityOfElementLocated(cartButton));
		wait.until(ExpectedConditions.elementToBeClickable(cartButton));
		String quantity = doGetText(cartButton);

		return quantity;
	}

	public void switchToNewWindow() {
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			System.out.println("Switched to new window");
		}

	}

	public String getHomePageTitle() {
		return driver.getTitle();
	}

	public String getHomePageHeader() {
		return doGetText(header);
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
