package com.qait.hbp.testBuilder.keywords;

import static com.qait.hbp.automation.utils.ConfigPropertyReader.getProperty;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
public class CreateNewTestBankTestActions extends GetPage {

	WebDriver driver;
	String random_Discipline_Name;
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	Date date = new Date();

	public CreateNewTestBankTestActions(WebDriver driver) {
		super(driver, "testBuilder/CreateNewTestBank");
		this.driver = driver;

	}

	public void click_On_Create_New_Test() {
		wait.waitForElementToBeVisible(element("search_Page_Question_List"));
		element("create_Test_Bank_Button").click();
		hardWait(1);
	}

	public void verify_User_Navigated_To_Edit_Test_Page() {
		wait.waitForElementToBeVisible(element("edit_Form_Row1"));
		hardWait(1);
		Assert.assertTrue(element("edit_Page_Heading").getText().equalsIgnoreCase("Edit Test"),
				"[ASSERT FAILED]: Navigated to wrong page");
		logMessage("[ASSERT PASSED]: Control successfully navigated to Edit page of Test builder");
	}

	public void verify_Text_Under_Main_Heading() {
		Assert.assertTrue(element("text_Under_Heading").getText().contains("add, edit, reorder, or delete questions"),
				"[ASSERT FAILED]: Heading didn't appear as expected");
		logMessage("[ASSERT PASSED]: Correct heading is appearing on Edit Page");
	}

	public void first_Heading_Should_Be(String index, String first_Heading) {
		Assert.assertTrue(elementPresentconstructed_dynamically("form_Field_Heading", index).getText()
				.equalsIgnoreCase(first_Heading), "[ASSERT FAILED]: Incorrect First heading");
		logMessage("[ASSERT PASSED]: Correct first heading is appearing with form field");
	}

	public void second_Heading_Should_Be(String index, String second_Heading) {
		Assert.assertTrue(elementPresentconstructed_dynamically("form_Field_Heading", index).getText()
				.equalsIgnoreCase(second_Heading), "[ASSERT FAILED]: Incorrect First heading");
		logMessage("[ASSERT PASSED]: Correct second heading is appearing with form field");
	}

	public void third_Heading_Should_Be(String index, String third_Heading) {
		Assert.assertTrue(elementPresentconstructed_dynamically("form_Field_Heading", index).getText()
				.equalsIgnoreCase(third_Heading), "[ASSERT FAILED]: Incorrect First heading");
		logMessage("[ASSERT PASSED]: Correct third heading is appearing with form field");
	}

	public void fill_Product_ID_Field(String index) {
		element("form_Input_Fields", index).sendKeys("123");
	}

	public void fill_Discipline_Field(String index) {
		random_Discipline_Name = ("Test Decipline " + date);
		System.out.println("discipline_Name::" + random_Discipline_Name);
		element("form_Input_Fields", index).sendKeys(random_Discipline_Name);
	}

	public void fill_Title_Field(String index) {
		element("form_Input_Fields", index).clear();
		element("form_Input_Fields", index).sendKeys("Test title "+ dateFormat.format(date));
	}

	public void save_The_Test_Bank(String buttonName1,String buttonName2) {
		elementPresentconstructed_dynamically("buttons_On_Edit_Page",buttonName1).click();
		hardWait(1);
		elementPresentconstructed_dynamically("link_Navigation_With_Text", buttonName2).click();
		
	}

	public void navigate_To_Build_New_Test_View(String label) {
		elementPresentconstructed_dynamically("link_Navigation_With_Text", label).click();
	}

	public void verify_If_Added_Discipline_Appears_In_Dropdown() {
		boolean flag = false;
		wait.waitForPageToLoadCompletely();
		element("build_New_Test_DDL").click();
		for (WebElement e : elementsPresent("discipline_List")) {
			System.out.println("e::" + e.getText());
			if (e.getText().equalsIgnoreCase(random_Discipline_Name)) {
				System.out.println("Added discipline is present in the drop down list present on test bank page");
				flag = true;
				break;
			}
		}
		Assert.assertEquals(flag, true, "[ASSERT FAILED]: Added discipline does not show up in test bank drop down ");
		logMessage("[ASSERT PASSED]: Correct discipline appears in the drop down list");
	}

}
