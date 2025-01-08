package com.fis.tests;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.SkipException;

import com.fis.DTO.DataDTO;

import com.fis.api.reqres.in.ApiSetup;
import com.fis.utils.APIUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import io.restassured.response.Response;

public class ProcessAPIRequest {

	//static Logger LOGGER = Logger.getLogger(ProcessRequest.class);

	public ITestResult result;
	public static int retryCount;

	
	public static void setRetryCount(int retryCnt) {
		retryCount=retryCnt;
	}
	
	public List<String> GetRecordsToProcess() throws ClassNotFoundException, SQLException {
		return null;

	}

	public ArrayList<DataDTO> FetchFullData() throws ClassNotFoundException, SQLException {
		ArrayList<DataDTO> fulldata = new ArrayList<DataDTO>();
		boolean result = true;
		try {
			ApiSetup receiptRequest = new ApiSetup("FetchFullData");
			ApiSetup.baseUri = "https://api.coindesk.com"; 
			ApiSetup.HOST =
			 "api.coindesk.com";
			//receiptRequest.replaceRequestParams("queryParam", "page", "2");

			Response resReceiptData = APIUtils.executeGetAPI(ApiSetup.baseUri.concat(receiptRequest.endPoint), receiptRequest.headers,
					receiptRequest.queryParam, receiptRequest.pathParam, receiptRequest.body);
			System.out.println(resReceiptData.getBody().asString());
			
			/* Deserializing the JSON Object to java object */
			Gson gson1 = new Gson();

			fulldata = new ArrayList<>(
					Arrays.asList(new GsonBuilder().create().fromJson(resReceiptData.getBody().asString(), DataDTO.class)));

		} catch (RuntimeException e) {
			if (!(e instanceof JsonSyntaxException))
				throw new SkipException("Exception caught in Api Request with below\n" + e.getMessage(), (Throwable) e);
			else
				e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fulldata;
	}

}
