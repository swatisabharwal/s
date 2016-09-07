package com.qait.hbp.testBuilder.keywords;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.Assert;

import com.qait.hbp.automation.getpageobjects.GetPage;

/**
 *
 * @author SwatiSabharwal
 */
public class BuildTestBankUsingNewQuestionsActions extends GetPage{
	
	WebDriver driver;
	String random_Discipline_Name;
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	Date date = new Date();
	int answerFieldCount=0;
       
	public BuildTestBankUsingNewQuestionsActions(WebDriver driver) {
		super(driver, "testBuilder/BuildTestBankUsingNewQuestions");
		this.driver = driver;

	}
	
	public void validate_Created_Test_Appears_On_Page(){
		int testListSize= elements("created_Test_List").size();
		Assert.assertTrue(testListSize>0, "	[ASSERT FAILED]: No Test list appeared under my test tab");
		logMessage("[ASSERT PASSED]: Test list appeared under my test tab sucessfully with test list count: "+testListSize);
	}
	
	public void validate_Expected_Heading_Appears_On_Page(String heading){
		Assert.assertTrue(element("page_Heading").getText().equalsIgnoreCase(heading), "[ASSERT FAILED]: Unexpected Heading ");
		logMessage("[ASSERT PASSED]: Expected heading is appearing on the page");
	}
	
	public void click_On_Particular_Test_Bank(String Test){
		elementPresentconstructed_dynamically("testBank_Heading",Test).click();
		
	}
	
	public void click_On_Create_New_Question_Button(String button_Name){
		elementPresentconstructed_dynamically("button_On_Edit_Page",button_Name).click();
	}
	
	public void verify_User_Navigated_To_Edit_Test_Page_When_New_Question_Option_Selected() {
		hardWait(1);
		Assert.assertTrue(element("edit_Page_Heading").getText().equalsIgnoreCase("Edit Question"),
				"[ASSERT FAILED]: Navigated to wrong page");
		logMessage("[ASSERT PASSED]: Control successfully navigated to Edit page of Test builder");
	}
	
	public void is_Drop_Down_To_Select_Question_Type_Is_Present(){
		Assert.assertTrue(element("select_Question_Type_DDL").isDisplayed(), "[ASSERT FAILED]: Drop Down list is not appeaing on edit page");
		logMessage("[ASSERT PASSED]:Drop Down list is appeaing on edit page as expected");
	}
	
	public void is_Question_Field_Present(String fieldName){
		String field= element("question_Field_Label").getText();
		Assert.assertTrue(field.equalsIgnoreCase(fieldName), "[ASSERT FAILED]: Question field is not present on the page");
		logMessage("[ASSERT PASSED]:Question field is present on the page as expected");
	}
	
	public void is_Answer_Field_Present(String fieldName){
		String field= element("answer_Field").getAttribute("aria-label");
		Assert.assertTrue(field.equalsIgnoreCase(fieldName), "[ASSERT FAILED]: Answer field is not present on the page");
		logMessage("[ASSERT PASSED]:Answer field is present on the page as expected");
	}
	public void is_Rationale_Field_Present(String fieldName){
		Assert.assertTrue(elementPresentconstructed_dynamically("optional_Answer_Field", fieldName).isDisplayed(), "[ASSERT FAILED]:"+fieldName+" field is not present on the page");
		logMessage("[ASSERT PASSED]:"+fieldName+" field is present on the page");
	}
	
	public void click_On_Cancel_Button(){
		element("cancel_Link").click();
	}
	
	public void select_Question_Type(String question_Type){
		scrollWindowToTheTop();
		element("select_Question_Type_DDL").click();
		elementPresentconstructed_dynamically("question_Type_Option", question_Type).click();
		
	}
	
	public void send_Question_To_Question_Field(){
		System.out.println("In the function");
		scrollWindowToTheTop();
		element("question_Field").sendKeys("Automated Question? ");
		Assert.assertTrue(element("question_Field_Normal_Text").getText().contains("Automated Question?"),"[ASSERT FAIL]: Question did not fill the question field ");
		logMessage("[ASSERT PASSED]:Question content got filled in the field");
	}
	
	public void send_Question_To_Question_Field_Using_JavaScript(){
		Actions action = new Actions(driver);
		//action.sendKeys(element("question_Field_After_JS"), "Automated Question?").build().perform();
		sendKeysAction(element("question_Field_After_JS"),"Automated Question?");
		Assert.assertTrue(element("question_Field_After_JS").getText().equalsIgnoreCase("Automated Question?"), "[ASSERT FAIL]: Text did not populate in question field");
	}
	
	public void send_Text_In_Bold_To_Question_Field(){
		scrollWindowToTheTop();
		element("bold_Label").click();
		sendKeysAction(element("question_Field_After_JS"),"Bold Text,");
		Assert.assertTrue(element("bold_Text_In_The_Field").isDisplayed(), "[ASSERT FAILED]: Bold text is present in the question field");
		logMessage("[ASSERT PASSED]:Bold/Strong text is present in the field");
		
	}
	
	public void send_An_Image_To_Question_Field(){
		element("insert_Label").click();
		element("image_Option_Within_Insert").click();
		elementPresentconstructed_dynamically("insertImageForm","1").sendKeys("Image URL");
		elementPresentconstructed_dynamically("insertImageForm","2").click();
		elementPresentconstructed_dynamically("insertImageForm","2").sendKeys("Image Description");
		elementPresentconstructed_dynamically("insertImageForm","1").sendKeys("Image title");
		elementPresentconstructed_dynamically("insertImageForm","1").sendKeys(Keys.ENTER);
		Assert.assertTrue(element("image_In_Field").getAttribute("alt").contains("Image Description"), "[ASSERT FAILED]: Image could not be added in the question successfully");
		logMessage("[ASSERT PASSED]: Image added successfully in the question field");
	}
	
	public void send_Answer_To_Answer_Field(String index){
	
		elementPresentconstructed_dynamically("answer_Field_text_Field",index).click();
		elementPresentconstructed_dynamically("answer_Field_text_Field",index).sendKeys("Answer");
	}
	
	
	public void store_Answer_Field_Count(){
		int defaultAnswerFieldCount= elements("answer_Field_List").size();
		answerFieldCount=defaultAnswerFieldCount;
		System.out.println("answerFieldCount::::"+answerFieldCount);
		logMessage("Default Answer Field Count is::"+answerFieldCount);
	}
	
	public void verify_The_List_Count_When_A_Field_Is_Removed(){
		element("remove_Answer_Field_Button").click();
		int answerFieldCountOnRemovingOne= elements("answer_Field_List").size();
		System.out.println("answerFieldCountOnRemovingOne::"+answerFieldCountOnRemovingOne);
		Assert.assertTrue(answerFieldCountOnRemovingOne<answerFieldCount, "[ASSERT FAILED]: Answer field count never got updated on removing an answer field");
		logMessage("[ASSERT PASSED]: Answer field count never got updated successfully");
	}
	
	public void verify_The_List_Count_When_A_Field_Is_Added(){
		element("add_Answer_Field_Button").click();
		int answerFieldCountOnAddingOne= elements("answer_Field_List").size();
		System.out.println("answerFieldCountOnAddingOne::"+answerFieldCountOnAddingOne);
		Assert.assertTrue(answerFieldCountOnAddingOne>answerFieldCount, "[ASSERT FAILED]: Answer field count never got updated on Adding an answer field");
		logMessage("[ASSERT PASSED]: Answer field count never got updated successfully");

	}
	
	public void pick_The_Correct_Answer_Using_Radio_Button(String index){
		elementPresentconstructed_dynamically("radio_Input_For_Answer_Field",index).click();
	}
	
	public void fill_In_Selected_Field(String type){
		elementPresentconstructed_dynamically("optional_Answer_Field", type).click();
		elementPresentconstructed_dynamically("optional_Answer_Field", type).sendKeys(type+" Answer");
		
	}
	
	public void click_On_Save_Button_Validate_Action(){
		element("save_And_Done_Button").click();
	}
}
