package com.qait.hbp.testBuilder.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qait.hbp.automation.TestSessionInitiator;
import com.qait.hbp.automation.utils.YamlReader;

/**
 *
 * @author SwatiSabharwal
 */
public class Build_Test_Bank_Using_New_Questions_Test {

	TestSessionInitiator test;
	String[] browserSizes = { "720x360" };
	String[] layoutTags = { "all" };

	@BeforeClass(groups = { "desktop", "mobile" })
	@Parameters("browser")
	public void start_test_session(@Optional String browser) {
		test = new TestSessionInitiator("Build_Test_Bank_Using_New_Questions_Test", browser);
	}

	@Test(groups = { "desktop", "mobile" })
	public void Test0001_Launch_Login_URL() {
		test.loginAndTestBuilderPage.is_User_Able_To_Launch_Login_URL(YamlReader.getData("cb_login_url"));
	}

	@Test(groups = { "desktop", "mobile" })
	public void Test002_Verify_User_Is_Able_To_Login_Into_Application() {
		test.loginAndTestBuilderPage.enter_UserName_And_PassWord(YamlReader.getData("users.edu_prem.username"),
				YamlReader.getData("users.admin.password"));
		test.loginAndTestBuilderPage.is_user_Able_To_Login_Into_Application();
	}

	@Test(groups = { "desktop", "mobile" })
	public void Test003_Verify_User_Is_Able_To_Search_The_Product() {
		test.loginAndTestBuilderPage.enter_Product_Id(YamlReader.getData("product_id_For_Select"));
		test.loginAndTestBuilderPage.verify_Search_Result_Appears();
	}

	@Test(groups = { "desktop", "mobile" })
	public void Test004_Verify_User_Is_Able_To_Navigate_To_Test_Builder_Page() {
		test.loginAndTestBuilderPage.click_On_Test_Bank_Link();
		test.loginAndTestBuilderPage.verify_The_Page_Title_Of_Test_Builder_Page();
	}

	@Test(groups = { "desktop", "mobile" })
	public void Test005_Navigate_To_My_Test_Tab_And_Verify_Created_Test_Appears() {
		test.NewTestBankPage.navigate_To_Build_New_Test_View("My Test");
		test.buildTestBankUsingNewQuestionsPage.validate_Created_Test_Appears_On_Page();
	}

	@Test(groups = { "desktop", "mobile" })
	public void Test006_Verify_Heading_Export_Your_Test_Appears() {
		test.buildTestBankUsingNewQuestionsPage.validate_Expected_Heading_Appears_On_Page("Export Your Test");
	}

	@Test(groups = { "desktop", "mobile" })
	public void Test007_Click_On_Test_Bank_And_Verify_Navigation_To_Edit_Page() {
		test.buildTestBankUsingNewQuestionsPage
				.click_On_Particular_Test_Bank(YamlReader.getData("product_id_For_Select"));
		test.NewTestBankPage.verify_User_Navigated_To_Edit_Test_Page();
		test.NewTestBankPage.verify_Text_Under_Main_Heading();
	}
	
	@Test(groups = { "desktop", "mobile" })
	public void Test008_Navigate_To_Edit_Page_Afer_Selecting_New_Question_Option() {
		test.buildTestBankUsingNewQuestionsPage
				.click_On_Create_New_Question_Button("Create New Question");
		test.buildTestBankUsingNewQuestionsPage.verify_User_Navigated_To_Edit_Test_Page_When_New_Question_Option_Selected();
	}
	
	@Test(groups = { "desktop", "mobile" })
	public void Test009_Validate_All_The_Elements_On_Edit_Page() {
		test.buildTestBankUsingNewQuestionsPage.is_Drop_Down_To_Select_Question_Type_Is_Present();
		test.buildTestBankUsingNewQuestionsPage.is_Question_Field_Present("Question");
		test.buildTestBankUsingNewQuestionsPage.is_Answer_Field_Present("Answer");
		test.buildTestBankUsingNewQuestionsPage.is_Rationale_Field_Present("question-editor-rationale");
		test.buildTestBankUsingNewQuestionsPage.is_Rationale_Field_Present("question-editor-reference");
		test.buildTestBankUsingNewQuestionsPage.is_Rationale_Field_Present("question-editor-objective");
		test.buildTestBankUsingNewQuestionsPage.is_Rationale_Field_Present("question-editor-keyWords");
	}
	

	@Test(groups = { "desktop", "mobile" })
	public void Test010_Click_On_Cancel_And_Verify_Page_Navigated_To_My_Test_Tab() {
		test.buildTestBankUsingNewQuestionsPage.click_On_Cancel_Button();
		test.NewTestBankPage.verify_User_Navigated_To_Edit_Test_Page();
		test.NewTestBankPage.verify_Text_Under_Main_Heading();
	}
	
	@Test(groups = { "desktop", "mobile" })
	public void Test011_Select_Multiple_Choice_Question_Type() {
		test.buildTestBankUsingNewQuestionsPage
		.click_On_Create_New_Question_Button("Create New Question");
	}
	
	@Test(groups = { "desktop", "mobile" })
	public void Test012_Select_Fill_Question_Field_With_Different_Item() {
		test.buildTestBankUsingNewQuestionsPage.send_Question_To_Question_Field_Using_JavaScript();
		test.buildTestBankUsingNewQuestionsPage.send_Text_In_Bold_To_Question_Field();
		test.buildTestBankUsingNewQuestionsPage.send_An_Image_To_Question_Field();
	}
	
	@Test(groups = { "desktop", "mobile" })
	public void Test013_Validate_Answer_Field_Can_Be_Removed_And_Added() {
		test.buildTestBankUsingNewQuestionsPage.store_Answer_Field_Count();
		test.buildTestBankUsingNewQuestionsPage.verify_The_List_Count_When_A_Field_Is_Removed();
		test.buildTestBankUsingNewQuestionsPage.verify_The_List_Count_When_A_Field_Is_Removed();
		test.buildTestBankUsingNewQuestionsPage.store_Answer_Field_Count();
		test.buildTestBankUsingNewQuestionsPage.verify_The_List_Count_When_A_Field_Is_Added();
		test.buildTestBankUsingNewQuestionsPage.pick_The_Correct_Answer_Using_Radio_Button("2");
	}
		

	@Test(groups = { "desktop", "mobile" })
	public void Test014_Validate_Rationale_Field_Can_Be_Removed_And_Added() {
		test.buildTestBankUsingNewQuestionsPage.fill_In_Selected_Field("question-editor-rationale");
		test.buildTestBankUsingNewQuestionsPage.fill_In_Selected_Field("question-editor-objective");
	}
	
	@Test(groups = { "desktop", "mobile" })
	public void Test015_Select_Fill_Answer_Fields_With_Different_Item() {
		test.buildTestBankUsingNewQuestionsPage.store_Answer_Field_Count();
		test.buildTestBankUsingNewQuestionsPage.send_Answer_To_Answer_Field("1");
		test.buildTestBankUsingNewQuestionsPage.send_Answer_To_Answer_Field("2");
		test.buildTestBankUsingNewQuestionsPage.send_Answer_To_Answer_Field("3");
	}
	
	@Test(groups = { "desktop", "mobile" })
	public void Test016_Click_On_Save_And_Done_Button_And_Validate_Action() {
		test.buildTestBankUsingNewQuestionsPage.click_On_Save_Button_Validate_Action();
	}
	
	/*
	 * For True/False Type questions
	 */
	
	@Test(groups = { "desktop", "mobile" })
	public void Test0017_Navigate_To_Edit_Page_Afer_Selecting_New_Question_Option() {
		test.buildTestBankUsingNewQuestionsPage
				.click_On_Create_New_Question_Button("Create New Question");
		test.buildTestBankUsingNewQuestionsPage.verify_User_Navigated_To_Edit_Test_Page_When_New_Question_Option_Selected();
	}
	
	@Test(groups = { "desktop", "mobile" })
	public void Test018_Select_Question_Type() {
		test.buildTestBankUsingNewQuestionsPage
		.click_On_Create_New_Question_Button("Create New Question");
		test.buildTestBankUsingNewQuestionsPage.select_Question_Type("True/False");
	}
	
	@Test(groups = { "desktop", "mobile" })
	public void Test019_Select_Fill_Question_Field_With_Different_Item() {
		test.buildTestBankUsingNewQuestionsPage.send_Question_To_Question_Field_Using_JavaScript();
	}
	
	@Test(groups = { "desktop", "mobile" })
	public void Test020_Validate_Rationale_Field_Can_Be_Removed_And_Added() {
		test.buildTestBankUsingNewQuestionsPage.fill_In_Selected_Field("question-editor-rationale");
		test.buildTestBankUsingNewQuestionsPage.fill_In_Selected_Field("question-editor-objective");
	}
	
	@Test(groups = { "desktop", "mobile" })
	public void Test021_Click_On_Save_And_Done_Button_And_Validate_Action() {
		test.buildTestBankUsingNewQuestionsPage.click_On_Save_Button_Validate_Action();
	}
	
	/*
	 * Short Answer type
	 */
	
	@Test(groups = { "desktop", "mobile" })
	public void Test0022_Navigate_To_Edit_Page_Afer_Selecting_New_Question_Option() {
		test.buildTestBankUsingNewQuestionsPage
				.click_On_Create_New_Question_Button("Create New Question");
		test.buildTestBankUsingNewQuestionsPage.verify_User_Navigated_To_Edit_Test_Page_When_New_Question_Option_Selected();
	}
	
	@Test(groups = { "desktop", "mobile" })
	public void Test023_Select_Question_Type() {
		test.buildTestBankUsingNewQuestionsPage
		.click_On_Create_New_Question_Button("Create New Question");
		test.buildTestBankUsingNewQuestionsPage.select_Question_Type("Short Answer");
	}
	
	@Test(groups = { "desktop", "mobile" })
	public void Test024_Select_Fill_Question_Field_With_Different_Item() {
		test.buildTestBankUsingNewQuestionsPage.send_Question_To_Question_Field_Using_JavaScript();
	}
	
	@Test(groups = { "desktop", "mobile" })
	public void Test025_Validate_Rationale_Field_Can_Be_Removed_And_Added() {
		test.buildTestBankUsingNewQuestionsPage.fill_In_Selected_Field("question-editor-rationale");
		test.buildTestBankUsingNewQuestionsPage.fill_In_Selected_Field("question-editor-objective");
	}
	
	@Test(groups = { "desktop", "mobile" })
	public void Test026_Click_On_Save_And_Done_Button_And_Validate_Action() {
		test.buildTestBankUsingNewQuestionsPage.click_On_Save_Button_Validate_Action();
	}
	
	/*
	 * Descriptive Type Question
	 */
	
	@Test(groups = { "desktop", "mobile" })
	public void Test0027_Navigate_To_Edit_Page_Afer_Selecting_New_Question_Option() {
		test.buildTestBankUsingNewQuestionsPage
				.click_On_Create_New_Question_Button("Create New Question");
		test.buildTestBankUsingNewQuestionsPage.verify_User_Navigated_To_Edit_Test_Page_When_New_Question_Option_Selected();
	}
	
	@Test(groups = { "desktop", "mobile" })
	public void Test028_Select_Question_Type() {
		test.buildTestBankUsingNewQuestionsPage
		.click_On_Create_New_Question_Button("Create New Question");
		test.buildTestBankUsingNewQuestionsPage.select_Question_Type("Descriptive Text");
	}
	
	@Test(groups = { "desktop", "mobile" })
	public void Test029_Select_Fill_Question_Field_With_Different_Item() {
		test.buildTestBankUsingNewQuestionsPage.send_Question_To_Question_Field_Using_JavaScript();
	}
	

	@Test(groups = { "desktop", "mobile" })
	public void Test030_Click_On_Save_And_Done_Button_And_Validate_Action() {
		test.buildTestBankUsingNewQuestionsPage.click_On_Save_Button_Validate_Action();
	}
	
//    @AfterClass(groups = { "desktop", "mobile" })
//	public void stop_test_session() {
//		test.closeTestSession();
//	}

	@AfterMethod(groups = { "desktop", "mobile" })
	public void takeScreenshotonFailure(ITestResult result) {
		test.takescreenshot.takeScreenShotOnException(result);

	}
	

}
