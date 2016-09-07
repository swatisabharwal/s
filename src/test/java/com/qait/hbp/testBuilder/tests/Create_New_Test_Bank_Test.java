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
public class Create_New_Test_Bank_Test {

	TestSessionInitiator test;
	String[] browserSizes = { "720x360" };
	String[] layoutTags = { "all" };

	@BeforeClass(groups = { "desktop", "mobile" })
	@Parameters("browser")
	public void start_test_session(@Optional String browser) {
		test = new TestSessionInitiator("Create_New_Test_Bank_Test", browser);
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
		test.loginAndTestBuilderPage.enter_Product_Id(YamlReader.getData("product_id_For_Edit"));
		test.loginAndTestBuilderPage.verify_Search_Result_Appears();
	}

	@Test(groups = { "desktop", "mobile" })
	public void Test004_Verify_User_Is_Able_To_Navigate_To_Test_Builder_Page() {
		test.loginAndTestBuilderPage.click_On_Test_Bank_Link();
		test.loginAndTestBuilderPage.verify_The_Page_Title_Of_Test_Builder_Page();
	}

	@Test(groups = { "desktop", "mobile" })
	public void Test005_Verify_User_Is_Able_To_Navigate_To_Edit_Test_Page() {
		test.NewTestBankPage.click_On_Create_New_Test();
		test.NewTestBankPage.verify_User_Navigated_To_Edit_Test_Page();
		test.NewTestBankPage.verify_Text_Under_Main_Heading();
	}

	@Test(groups = { "desktop", "mobile" })
	public void Test006_Verify_Form_Field_Heading() {
		test.NewTestBankPage.first_Heading_Should_Be("1", "Product Availability Id");
		test.NewTestBankPage.second_Heading_Should_Be("2", "Discipline");
		test.NewTestBankPage.third_Heading_Should_Be("3", "Title");
	}

	@Test(groups = { "desktop", "mobile" })
	public void Test007_Verify_Test_Bank_Saves_Without_Selecting_Questions() {
		test.NewTestBankPage.fill_Product_ID_Field("1");
		test.NewTestBankPage.fill_Discipline_Field("2");
		test.NewTestBankPage.fill_Title_Field("3");
		test.NewTestBankPage.save_The_Test_Bank("Save","Done");
	}

	@Test(groups = { "desktop", "mobile" })
	public void Test008_Verify_Added_Discipline_Showsup_In_Build_New_Test_Dropdown() {
		test.NewTestBankPage.navigate_To_Build_New_Test_View("Build new test");
		test.NewTestBankPage.verify_If_Added_Discipline_Appears_In_Dropdown();
	}

//	 @AfterClass(groups = { "desktop", "mobile" })
//	 public void stop_test_session() {
//	 test.closeTestSession();
//	 }

	@AfterMethod(groups = { "desktop", "mobile" })
	public void takeScreenshotonFailure(ITestResult result) {
		test.takescreenshot.takeScreenShotOnException(result);
	}
}
