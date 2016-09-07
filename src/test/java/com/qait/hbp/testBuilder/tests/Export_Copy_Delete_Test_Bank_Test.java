package com.qait.hbp.testBuilder.tests;

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
public class Export_Copy_Delete_Test_Bank_Test {

	TestSessionInitiator test;
	String[] browserSizes = { "720x360" };
	String[] layoutTags = { "all" };

	@BeforeClass(groups = { "desktop", "mobile" })
	@Parameters("browser")
	public void start_test_session(@Optional String browser) {
		test = new TestSessionInitiator("Export_Copy_Delete_Test_Bank_Test", browser);
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
	public void Test007_Verify_Export_Button_Is_Present_With_Test_Bank() {
		test.exportCopyDeleteTestBankPage.verify_Export_Button_Is_Present_With_Particular_Test_Case(YamlReader.getData("product_id_For_Select"));
	}

	@Test(groups = { "desktop", "mobile" })
	public void Test008_Copy_A_Test_Bank_And_Verify_If_Copy_Was_Created_Successfully() {
		test.exportCopyDeleteTestBankPage.copy_A_Particular_Test_Bank(YamlReader.getData("product_id_For_Select"));
		test.exportCopyDeleteTestBankPage.verify_Test_Bank_Is_Duplicated(YamlReader.getData("product_id_For_Select"));
	}
	
	@Test(groups = { "desktop", "mobile" })
	public void Test009_Delete_The_Copied_TestBank() {
		test.exportCopyDeleteTestBankPage.Delete_A_Particular_Test_Bank(YamlReader.getData("product_id_For_Select"));
		
	}
	

}
