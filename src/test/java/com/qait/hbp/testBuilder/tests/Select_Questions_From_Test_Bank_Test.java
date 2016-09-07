package com.qait.hbp.testBuilder.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.qait.hbp.automation.TestSessionInitiator;
import com.qait.hbp.automation.utils.ConfigPropertyReader;
import com.qait.hbp.automation.utils.PropFileHandler;
import com.qait.hbp.automation.utils.YamlReader;
import org.testng.Assert;
import java.awt.AWTException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

/**
 *
 * @author SwatiSabharwal
 */
public class Select_Questions_From_Test_Bank_Test {

	TestSessionInitiator test;
	String[] browserSizes = { "720x360" };
	String[] layoutTags = { "all" };

	@BeforeClass(groups = { "desktop", "mobile" })
	@Parameters("browser")
	public void start_test_session(@Optional String browser) {
		test = new TestSessionInitiator("select_Questions_From_Test_Bank_Test", browser);
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
	public void Test005_Verify_Discipline_Is_Pre_Selected() {
		test.selectQuestionsFromBankPage.Discipline_field_Should_Be_Already_Populated();
	}

	@Test(groups = { "desktop", "mobile" })
	public void Test006_Verify_User_Is_Able_To_Change_Discipline() {
		test.selectQuestionsFromBankPage.change_Discipline("Marketing");
		test.selectQuestionsFromBankPage.verify_Correct_Discipline_On_Complete_List("Marketing");
	}

	@Test(groups = { "desktop", "mobile" })
	public void Test007_Verify_User_Navigated_To_Original_Discipline_And_Test_Bank_Is_Expanded() {
		test.selectQuestionsFromBankPage.change_Discipline("Strategy");
		test.selectQuestionsFromBankPage.verify_Correct_Discipline_On_Complete_List("Strategy");
		test.selectQuestionsFromBankPage
				.is_Test_Bank_For_Same_Reading_Is_Expanded(YamlReader.getData("product_id_For_Select"));
	}

	@Test(groups = { "desktop", "mobile" })
	public void Test008_Verify_Attributes_For_Test_Bank_Title() {
		test.selectQuestionsFromBankPage.count_The_Total_Number_Of_Questions("Total");
		test.selectQuestionsFromBankPage.count_The_Total_Number_Of_Questions("Short Answer");
		test.selectQuestionsFromBankPage.count_The_Total_Number_Of_Questions("True/False");
		test.selectQuestionsFromBankPage.count_The_Total_Number_Of_Questions("Multiple Choice");
	}

	@Test(groups = { "desktop", "mobile" })
	public void Test009_Verify_Attributes_For_Each_Question_On_Test_Bank() {
		test.selectQuestionsFromBankPage.validate_Show_Details_Label_for_Each_Question();
	}

	@Test(groups = { "desktop", "mobile" })
	public void Test010_Verify_And_Store_Selected_Question_Default_Value() {
		test.selectQuestionsFromBankPage.does_Selected_Question_Label_appears("Questions Selected");
		test.selectQuestionsFromBankPage.save_Default_Selected_Quesstion_Count("Questions Selected");
	}

	@Test(groups = { "desktop", "mobile" })
	public void Test011_Verify_Selected_Question_Count_Functioning() {
		test.selectQuestionsFromBankPage.select_Individual_Question_And_Verify_Counter_Increament("1");
		test.selectQuestionsFromBankPage.save_Default_Selected_Quesstion_Count("Questions Selected");
		test.selectQuestionsFromBankPage.select_Individual_Question_And_Verify_Counter_Increament("2");
		test.selectQuestionsFromBankPage.save_Default_Selected_Quesstion_Count("Questions Selected");
		test.selectQuestionsFromBankPage.deselect_Individual_Question_And_Verify_Counter_Decreament("2");
		test.selectQuestionsFromBankPage.select_Individual_Question_And_Verify_Counter_Increament("1");
	}

	@Test(groups = { "desktop", "mobile" })
	public void Test012_Verify_Expand_And_Collapse_Functionality() {
		test.selectQuestionsFromBankPage
				.click_On_Selected_Test_Bank_Header(YamlReader.getData("product_id_For_Select"));
		test.selectQuestionsFromBankPage
				.collapse_The_Selected_Test_Bank_And_Validate_The_Action(YamlReader.getData("product_id_For_Select"));
		test.selectQuestionsFromBankPage
				.click_On_Selected_Test_Bank_Header(YamlReader.getData("product_id_For_Select"));
		test.selectQuestionsFromBankPage
				.is_Test_Bank_For_Same_Reading_Is_Expanded(YamlReader.getData("product_id_For_Select"));
	}

	@Test(groups = { "desktop", "mobile" })
	public void Test013_Verify_Expand_And_Collapse_Functionality_For_Individual_Questions() {
		test.selectQuestionsFromBankPage.validate_Questions_Capability_To_Show_Details("1");
		test.selectQuestionsFromBankPage.validate_Questions_Capability_To_Show_Details("5");
		test.selectQuestionsFromBankPage.validate_Questions_Capability_To_Show_Details("11");
		test.selectQuestionsFromBankPage.validate_Questions_Capability_To_Show_Details("20");
		
	}

	@Test(groups = { "desktop", "mobile" })
	public void Test014_Verify_My_Test_Button_Is_Clickable_And_Tab_If_No_Question_Is_Selected() {
		test.NewTestBankPage.click_On_Create_New_Test();
		test.NewTestBankPage.verify_User_Navigated_To_Edit_Test_Page();
		test.selectQuestionsFromBankPage.verify_No_Question_Selected_Message();
	}
	
	@Test(groups = { "desktop", "mobile" })
	public void Test015_Verify_My_Test_Button_Is_Clickable_And_Tab_If_Question_Is_Selected() {
		test.NewTestBankPage.navigate_To_Build_New_Test_View("Build new test");
		test.selectQuestionsFromBankPage
		.click_On_Selected_Test_Bank_Header(YamlReader.getData("product_id_For_Select"));
		test.selectQuestionsFromBankPage.select_All_Questions_Of_Test_Bank_And_Store_Test_Bank_Name();
		test.selectQuestionsFromBankPage.save_Default_Selected_Quesstion_Count("Questions Selected");
		test.NewTestBankPage.click_On_Create_New_Test();
		test.selectQuestionsFromBankPage.verify_Question_Selcted_In_My_Test_Tab();
	}
	
    @AfterClass(groups = { "desktop", "mobile" })
	public void stop_test_session() {
		test.closeTestSession();
	}

	@AfterMethod(groups = { "desktop", "mobile" })
	public void takeScreenshotonFailure(ITestResult result) {
		test.takescreenshot.takeScreenShotOnException(result);

	}
}
