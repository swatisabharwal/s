package com.qait.hbp.automation.utils;

import static com.qait.hbp.automation.utils.ConfigPropertyReader.getProperty;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import net.mindengine.galen.api.Galen;
import net.mindengine.galen.reports.GalenTestInfo;
import net.mindengine.galen.reports.HtmlReportBuilder;
import net.mindengine.galen.reports.model.LayoutReport;
import net.mindengine.galen.validation.ValidationResult;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.qait.hbp.automation.getpageobjects.Tiers;

public class LayoutValidation {

	WebDriver driver;
	String PageName;
	String tier;
	String platform;
	private final String filepath = "src/test/resources/PageObjectRepository/";

	static LinkedList<GalenTestInfo> tests = new LinkedList<GalenTestInfo>();

	public LayoutValidation(WebDriver driver, String pageName) {
		this.driver = driver;
		this.PageName = pageName;
		setTier();
		setPlatform();
	}

	private void setPlatform()
	{
		if(ConfigPropertyReader.getProperty("browser").equals("mobile"))
			platform="Mobile/";
		else
			platform="Desktop/";
			
	}
	
	
	public void checklayout(List<String> browserSizes,
			List<String> tagsToBeTested) {
		for (String browserSize : browserSizes) {

			int width = Integer.parseInt(browserSize.split("x")[0].trim());
			int height = Integer.parseInt(browserSize.split("x")[0].trim());
			driver.manage().window().setSize(new Dimension(width, height));
			checklayout(tagsToBeTested);
			driver.manage().window().maximize();
		}
	}

	public boolean checklayout(List<String> tagsToBeTested) {
		
		boolean status=true;
            if (getProperty("test-layout").equalsIgnoreCase("yes")){
		try {
			// Executing layout check and obtaining the layout report
			LayoutReport layoutReport = Galen.checkLayout(this.driver,
					this.filepath + this.platform + this.tier + this.PageName + ".spec",
					tagsToBeTested, null, null, null);

			// Creating a list of tests

			// Creating an object that will contain the information about the
			// test
			GalenTestInfo test = GalenTestInfo.fromString(this.PageName
					+ " - layout test");

			// Adding layout report to the test report
			test.getReport().layout(layoutReport,
					this.PageName + " - layout test");
			tests.add(test);

			// Exporting all test reports to html
			new HtmlReportBuilder().build(tests, "./target/galen-reports");
 
			if (layoutReport.errors() > 0) {
				Reporter.log(
						"\n[LAYOUT ERRORS]: There are Layout Errors on the page:- "
								+ this.PageName + "!!! The Errors are for ",
						true);

				for (ValidationResult errorresult : layoutReport
						.getValidationErrorResults()) {
					for (String errormsg : errorresult.getError().getMessages()) {
						Reporter.log("\t[layout error: ]" + errormsg, true);
					}
				}
				
				status=false;
				
			} else {
				Reporter.log("\n[INFO]: Layout test for page:- " + this.PageName
						+ " passed. ", true);
			}
			Reporter.log(
					"[INFO]: Check reports in the location:- "
							+ System.getProperty("user.dir")
							+ "\\target\\galen-reports" + "\n", true);

		} catch (IOException ex) {
			Reporter.log(ex.getLocalizedMessage(), true);
		}
		catch(Error er)
		{ 
			System.out.println("***************** Error is : *****************************************");
			System.out.println(er);
			
		}
            }
            
            driver.switchTo().defaultContent();
            return status;
            
	}

	private void setTier() {
		switch (Tiers.valueOf(getProperty("Config.properties", "tier"))) {
		case production:
		case PROD:
		case PRODUCTION:
		case Production:
		case prod:
			this.tier = "PROD/";
			break;
		case pristine:
		case PR:
		case PRISTINE:
		case Pristine:
		case pr:
			this.tier = "PR/";
			break;
		case qa:
		case QA:
		case Qa:
			this.tier = "QA/";
			break;
		case Dev:
		case DEV:
		case dev:
			this.tier = "DEV/";
			break;
		case mice:
		case MICE:
		case Mice:
			this.tier = "MICE/";
			break;
		}
	}

}
