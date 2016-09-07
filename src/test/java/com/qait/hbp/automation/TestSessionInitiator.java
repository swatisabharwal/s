package com.qait.hbp.automation;

import static com.qait.hbp.automation.utils.ConfigPropertyReader.getProperty;
import static com.qait.hbp.automation.utils.YamlReader.getYamlValue;
import static com.qait.hbp.automation.utils.YamlReader.setYamlFilePath;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;

import com.qait.hbp.automation.pojo.TopicNamePojo;
import com.qait.hbp.automation.utils.ConfigPropertyReader;
import com.qait.hbp.automation.utils.TakeScreenshot;
import com.qait.hbp.automation.utils.YamlReader;
import com.qait.hbp.testBuilder.keywords.BuildTestBankUsingNewQuestionsActions;
import com.qait.hbp.testBuilder.keywords.CreateNewTestBankTestActions;
import com.qait.hbp.testBuilder.keywords.ExportCopyDeleteTestBankActions;
import com.qait.hbp.testBuilder.keywords.LoginAndTestBuilderPageNavigationAction;
import com.qait.hbp.testBuilder.keywords.SelectQuestionsFromTestBankActions;


public class TestSessionInitiator {

	// protected WebDriver driver;
	protected WebDriver driver;
	private final WebDriverFactory wdfactory;
	String browser;
	String seleniumserver;
	String seleniumserverhost;
	String appbaseurl;
	String applicationpath;
	String chromedriverpath;
	String datafileloc = "";
	public static int timeout;
	Map<String, Object> chromeOptions = null;
	DesiredCapabilities capabilities;

	/**
	 * Initiating the page objects
	 */
	public LoginAndTestBuilderPageNavigationAction loginAndTestBuilderPage;
	public CreateNewTestBankTestActions NewTestBankPage;
	public SelectQuestionsFromTestBankActions selectQuestionsFromBankPage;
	public BuildTestBankUsingNewQuestionsActions buildTestBankUsingNewQuestionsPage;
	public ExportCopyDeleteTestBankActions exportCopyDeleteTestBankPage;
	
	public TakeScreenshot takescreenshot;
	public TopicNamePojo topicNameValue;
	private String testname;
	
	
	public Random randomGenerator;

	public WebDriver getDriver() {
		return this.driver;
	}

	private void _initPage() {
		loginAndTestBuilderPage=new LoginAndTestBuilderPageNavigationAction(driver);
		NewTestBankPage=new CreateNewTestBankTestActions(driver);
		selectQuestionsFromBankPage = new SelectQuestionsFromTestBankActions(driver);
		buildTestBankUsingNewQuestionsPage= new BuildTestBankUsingNewQuestionsActions(driver);
		exportCopyDeleteTestBankPage=new ExportCopyDeleteTestBankActions(driver);

	}
	
	
	/**
	 * Page object Initiation done
	 *
	 * @param testname
	 */
	public TestSessionInitiator(String testname) {
		wdfactory = new WebDriverFactory();
		testInitiator(testname);
		this.testname = testname;
	}

	public TestSessionInitiator(String testname, String browserName) {
		wdfactory = new WebDriverFactory(browserName);
		testInitiator(testname);
		this.testname = testname;

	}

	private void testInitiator(String testname) {
		setYamlFilePath();
		_configureBrowser();
		_initPage();
		takescreenshot = new TakeScreenshot(testname, this.driver);
	}

	private void _configureBrowser() {
		driver = wdfactory.getDriver(_getSessionConfig());
		if (!_getSessionConfig().get("browser").toLowerCase().trim().equalsIgnoreCase("mobile")) {
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
		}
		driver.manage()
				.timeouts()
				.implicitlyWait(Integer.parseInt(getProperty("timeout")),
						TimeUnit.SECONDS);
	}

	private Map<String, String> _getSessionConfig() {
		String[] configKeys = { "tier", "browser", "seleniumserver",
				"seleniumserverhost", "timeout", "driverpath", "appiumServer",
				"mobileDevice" };
		Map<String, String> config = new HashMap<String, String>();
		for (String string : configKeys) {
			config.put(string, getProperty("./Config.properties", string));
		}
		return config;
	}
/*
	public void launchApplication() {
		launchApplication(getYamlValue("base_url"));
	}

	public void launchApplication(String base_url) {
		Reporter.log("\n[INFO]: The application url is :- " + base_url, true);
		driver.manage().deleteAllCookies();
		
		driver.get(base_url);
		
	}
	
	public void launchAdminApplication(String Adminbase_url) {
		Reporter.log("\n[INFO]: The application url is :- " + Adminbase_url, true);
		driver.manage().deleteAllCookies();
		driver.get(Adminbase_url);
	}

	
	public void openUrl(String url) {
		driver.get(url);
	}
*/
	public void closeBrowserSession() {
		Reporter.log("[INFO]: The Test: " + this.testname.toUpperCase() + " COMPLETED!"
				+ "\n", true);
		try {
			driver.quit();
			Thread.sleep(3000);// [INFO]: this to wait before you close every
								// thing
		} catch (Exception b) {
			b.getMessage();
		}
	}

	public void closeTestSession() {
		closeBrowserSession();
	}
	
	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}
}
