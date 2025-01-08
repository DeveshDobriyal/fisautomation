package com.fis.tests;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.fis.tests.ProcessAPIRequest;

import com.fis.DTO.DataDTO;
import com.fis.pages.HomePage;

public class HomePageTest extends BaseTest {

	@Test(description = "This test is the UI Automation test", priority = 1, enabled = true)
	public void homePageTitleTest() {
		// page.getInstance(LoginPage.class);
		// HomePage page = new HomePage(null, null);
		String quantity = page.getInstance(HomePage.class).getBookinKart();
		System.out.println("Quantity in the Kart is : " + quantity);
		Assert.assertEquals(quantity, "1");
	}

	@Test(description = "This test is API Test", priority = 1, enabled = false)
	public void getUserID() throws Exception {
		try {
			
			ProcessAPIRequest obj = new ProcessAPIRequest();
			ArrayList<DataDTO> dataObj = new ArrayList<DataDTO>();
			dataObj = obj.FetchFullData();

			Assert.assertEquals(dataObj.get(0).getBpi().getEur().getCode().toString(), "EUR");
			Assert.assertEquals(dataObj.get(0).getBpi().getUsd().getCode().toString(), "USD");
			Assert.assertEquals(dataObj.get(0).getBpi().getGbp().getCode().toString(), "GBP");
			Assert.assertEquals(dataObj.get(0).getBpi().getGbp().getDescription().toString(), "British Pound Sterling");

		} catch (Exception e) {

		}

	}

}
