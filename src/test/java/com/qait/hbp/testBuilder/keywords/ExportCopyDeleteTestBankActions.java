package com.qait.hbp.testBuilder.keywords;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.qait.hbp.automation.getpageobjects.GetPage;
import com.thoughtworks.selenium.webdriven.commands.GetAttributeFromAllWindows;

/**
 *
 * @author SwatiSabharwal
 */
public class ExportCopyDeleteTestBankActions extends GetPage {

	WebDriver driver;
	String random_Discipline_Name;
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	Date date = new Date();
	int answerFieldCount = 0;

	public ExportCopyDeleteTestBankActions(WebDriver driver) {
		super(driver, "testBuilder/ExportCopyDeleteTestBank");
		this.driver = driver;
	}

	public void verify_Export_Button_Is_Present_With_Particular_Test_Case(String testBank) {
		Assert.assertTrue(elementPresentconstructed_dynamically("export_Button", testBank).isDisplayed(),
				"[ASSERT FAIL]: Export button is not present with a particular test bank");
		logMessage("[ASSERT PASSED]:Export button was present as expected");
	}

	public void copy_A_Particular_Test_Bank(String testBank) {
		elementPresentconstructed_dynamically("duplicate_Button", testBank).click();
	}

	public void verify_Test_Bank_Is_Duplicated(String testBank) {
		String str = element("copied_Test_Bank").getText();
		System.out.println("Heading:::" + str);
		Assert.assertTrue(str.contains("Copy "+testBank));

	}
	
	public void Delete_A_Particular_Test_Bank(String testBank){
		elementPresentconstructed_dynamically("delete_Button",testBank).click();
		
	}

}
