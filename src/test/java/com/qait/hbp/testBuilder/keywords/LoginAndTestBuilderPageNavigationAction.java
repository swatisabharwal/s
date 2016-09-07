package com.qait.hbp.testBuilder.keywords;

import static com.qait.hbp.automation.utils.ConfigPropertyReader.getProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import com.qait.hbp.automation.getpageobjects.*;
import com.qait.hbp.automation.utils.ConfigPropertyReader;
import com.qait.hbp.automation.utils.PropFileHandler;
import com.qait.hbp.automation.utils.YamlReader;

import org.apache.commons.lang.StringUtils;
import org.apache.xpath.axes.WalkingIterator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.Assert;

/**
 *
 * @author SwatiSabharwal
 */
public class LoginAndTestBuilderPageNavigationAction extends GetPage {

	WebDriver driver;

	public LoginAndTestBuilderPageNavigationAction(WebDriver driver) {
		super(driver, "testBuilder/LaunchTestBuilder");
		this.driver = driver;

	}

	public void is_User_Able_To_Launch_Login_URL(String LoginURL) {
		launchSpecificUrl(LoginURL);
		Assert.assertTrue(
				element("page_heading").isDisplayed() && element("page_heading").getText().equalsIgnoreCase("Login"),
				"" + "[ASSERT FAILED]: Login page was not launched on launching login URL!");
		logMessage("[ASSERT PASSED]: User is able to launch Login URL");
	}

	public void enter_UserName_And_PassWord(String username, String password) {
		sendText(element("username_field"), username);
		sendText(element("password_field"), password);
	}

	public void is_user_Able_To_Login_Into_Application() {

		clickUsingJavaScriptClickEvent(getLocatorTwo("login_button",""));
		hardWait(1);
		if (ConfigPropertyReader.getProperty("browser").equals("mobile"))
			scrollWindow(100, 0);
		logMessage("[ASSERT PASSED]: User is able to login without any errors");

	}
	
	public void wait_Until_All_Search_Result_Appear(){
		wait.waitForElementToBeVisible(element("All_Search_result"));
	}
	
	public void enter_Product_Id(String product_Id){
		hardWait(2);
		wait_Until_All_Search_Result_Appear();
		sendText(element("global_Search_field"), product_Id);
		element("global_Search_Button").click();
	}
	
	public void verify_Search_Result_Appears(){
		Assert.assertTrue(element("search_Result_Label").getText().contains("RESULT"), "[ASSERT FAILED]: No results were returned");
		logMessage("[ASSERT PASSED]: Product was returned successfully");
	}
	
	public void click_On_Test_Bank_Link(){
		element("test_Bank_Link").click();
	}
	
	public void verify_The_Page_Title_Of_Test_Builder_Page(){
		hardWait(1);
		changeWindow(1);
		hardWait(2);
		String pageTitle= getPageTitle();
		Assert.assertTrue(pageTitle.equalsIgnoreCase("Test Builder"),"[ASSERT FAILED]:Title fetched is not expected ");
		logMessage("[ASSERT PASSED]: User navigated to Test Builder Page successfully");
	}
	
	
	
	

}
