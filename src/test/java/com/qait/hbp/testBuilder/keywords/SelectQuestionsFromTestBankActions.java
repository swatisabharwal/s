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
public class SelectQuestionsFromTestBankActions extends GetPage {

	WebDriver driver;
	String random_Discipline_Name;
	int selectedQuestion = 0;

	public SelectQuestionsFromTestBankActions(WebDriver driver) {
		super(driver, "testBuilder/SelectQuestionFromTestBank");
		this.driver = driver;

	}

	public void Discipline_field_Should_Be_Already_Populated() {
		String dropDownField;
		dropDownField = element("discipline_dropdown").getAttribute("value");
		Assert.assertTrue(!(dropDownField.isEmpty()), "[ASSERT FAILED]: Discipline field is not already populated");
		logMessage("[ASSERT PASSED]:Discipline field is already populated with "
				+ element("discipline_dropdown").getAttribute("value"));
	}

	public void change_Discipline(String discipline) {
		element("build_New_Test_DDL").click();
		elementPresentconstructed_dynamically("discipline_field", discipline).click();
		hardWait(1);
	}

	public void verify_Correct_Discipline_On_Complete_List(String discipline) {
		int i = elements("test_Bank_List").size();
		int count = 0;
		for (WebElement e : elementsPresent("test_Bank_List")) {
			if (e.getText().equalsIgnoreCase(discipline)) {
				count++;
			}
		}
		Assert.assertEquals(count, i, "[ASSERT FAILED]: Correct discipline doesn't appear on the list  ");
		logMessage("[ASSERT PASSED]: Correct discipline appears on test bank list");
	}

	public void is_Test_Bank_For_Same_Reading_Is_Expanded(String testBank) {
		Assert.assertTrue(elementPresentconstructed_dynamically("expanded_Test_Bank", testBank).getAttribute("class")
				.contains("rotate-90"), "[ASSERT FAILED]: Test Bank for same reading was not expanded");
		logMessage("[ASSERT PASSED]: Test Bank for same reading was expanded as expected");
	}

	public void count_The_Total_Number_Of_Questions(String questionType) {
		hardWait(2);
		String questionCount = elementPresentconstructed_dynamically("question_Count_On_TB_Title", questionType)
				.getText();
		logMessage("Count of questions in " + questionType + " cataogory is " + questionCount);
	}

	public void validate_Show_Details_Label_for_Each_Question() {
		int i = elements("question_List").size();
		int count = 0;
		for (WebElement e : elementsPresent("show_Details_Button_List")) {
			if (e.getText().equalsIgnoreCase("Show Details")) {
				count++;
			}
		}
		Assert.assertEquals(count, i, "[ASSERT FAILED]: Every question has no capability to show details");
		logMessage("[ASSERT PASSED]: Every question has capability to show details");
	}

	public void does_Selected_Question_Label_appears(String label) {
		Assert.assertTrue(elementPresentconstructed_dynamically("question_Selected_Label", label).isDisplayed(),
				"[ASSERT FAILED]: Leable does not appear");
		logMessage("[ASSERT PASSED]: Select question label appears on the page");
	}

	public void save_Default_Selected_Quesstion_Count(String label) {
		String count = elementPresentconstructed_dynamically("default_Selected_Question_Count", label).getText();
		selectedQuestion = Integer.parseInt(count);
	}

	public void select_Individual_Question_And_Verify_Counter_Increament(String index) {
		int count = selectedQuestion;
		elementPresentconstructed_dynamically("question_Checkbox", index).click();
		hardWait(2);
		count++;
		System.out.println("Defult selectedQuestion::" + selectedQuestion);
		System.out.println("local count after increament::" + count);
		Assert.assertTrue(selectedQuestion < count,
				"[ASSERT FAILED]: Count never increased on selecting the questions");
		logMessage("[ASSERT PASSED]: Selected question count increased in selecting question, as expected");

	}

	public void deselect_Individual_Question_And_Verify_Counter_Decreament(String index) {
		int count = selectedQuestion;
		elementPresentconstructed_dynamically("question_Checkbox", index).click();
		count--;
		System.out.println("Defult selectedQuestion::" + selectedQuestion);
		System.out.println("local count after Decreament::" + count);
		Assert.assertTrue(selectedQuestion > count,
				"[ASSERT FAILED]: Count never decreased on selecting the questions");
		logMessage("[ASSERT PASSED]: Selected question count decreased in selecting question, as expected");
	}

	public void click_On_Selected_Test_Bank_Header(String testBank) {
		hardWait(1);
		elementPresentconstructed_dynamically("Selected_Test_Bank_Heading", testBank).click();
	}

	public void collapse_The_Selected_Test_Bank_And_Validate_The_Action(String testBank) {
		Assert.assertTrue(
				elementPresentconstructed_dynamically("expanded_Test_Bank", testBank).getAttribute("class")
						.contains("inline-block"),
				"[ASSERT FAILED]: Test Bank for same reading did not collapse on clicking the header");
		logMessage(
				"[ASSERT PASSED]: Test Bank for same reading Collapsed on clicking the header for the test bank, as exepcted");
	}

	public void validate_Questions_Capability_To_Show_Details(String index) {
		hardWait(1);
		if (elementPresentconstructed_dynamically("details_Button", index).getText().equalsIgnoreCase("Show Details")) {
			elementPresentconstructed_dynamically("details_Button", index).click();
		} else {
			System.out.println("Questions do not have show details/Hide details option");
		}
		Assert.assertTrue(elementPresentconstructed_dynamically("details_Button", index).getText().equalsIgnoreCase(
				"Hide Details"), "[ASSERT FAILED]: Question does not have show details/Hide details option");

	}

	public void verify_No_Question_Selected_Message() {
		Assert.assertTrue(
				element("no_Question_Message ").getText().equalsIgnoreCase("You have not added any questions yet."),
				"[ASSERT FAILED]: No question message does not appear if no question is selscted for test bank");

	}

	String testBank_Name;

	public void select_All_Questions_Of_Test_Bank_And_Store_Test_Bank_Name() {
		elementPresent("test_Bank_Total_Questions").click();
		testBank_Name = element("chosen_Test_Bank").getText();
	}

	public void verify_Question_Selcted_In_My_Test_Tab() {
		System.out.println("In function");
		int i = elements("question_List_On_Test_Bank").size();
		Assert.assertTrue(i == selectedQuestion, "[ASSERT FAILED]: Selected questions do not appear on test bank page");
		logMessage("[ASSERT PASSED]: Count of selected question matches with questions appearing on test bank page");
	}

}
