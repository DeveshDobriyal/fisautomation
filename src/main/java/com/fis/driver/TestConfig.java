package com.fis.driver;

import java.io.File;
import java.io.IOException;




import com.fis.utils.Config;

public class TestConfig {


	private static TestConfig testConfig;

	private static Config config;
	
	//private static Config emailBodyConfig;
	private static String configWorkbook;
	private static String testMappingWorkbook;

	private String appBaseURL;
	private String apiBaseURL;

	private String reportPath;
	private String screenShotPath;

	private boolean remoteExecution = false;
	private String gridURL;

	private String dbConnString;

	private String apiAuth;

	private String execEnvironment;

	private String browserName;
	
	private String deviceResolution;
	private String excelDateFormat;
	
	private TestConfig() {
	}

	static {
		try {
			config = new Config("/Users/dobriyaldevesh/Downloads/automation/Framework/Test_Config/config.properties");
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}


		try {
			configWorkbook = new File("Framework/Test_config/Config.xlsx").getCanonicalPath();
		} catch (IOException e) {

		}
	}

	public static TestConfig getInstance() {
		if (testConfig == null) {
			testConfig = new TestConfig();
		}
		return testConfig;
	}

	public static Config getConfig() {
		return config;
	}


	
	
	
	public String getAppBaseURL() {
		return appBaseURL;
	}

	public String getApiBaseURL() {
		return apiBaseURL;
	}

	public String getApiAuth() {
		return apiAuth;
	}

	

	// Framework Initialization
	public void suiteSetup(String database) {
		try {
			frameworkSetup();
			
		} catch (Exception e) {
			
		}
	}

	// Framework Initialization
	public void suiteSetup() {
		try {
			frameworkSetup();
		} catch (Exception e) {
			
		}
	}

	private void frameworkSetup() throws IOException {
		
	}

	
}