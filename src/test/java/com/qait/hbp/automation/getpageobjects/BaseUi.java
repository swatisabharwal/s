/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qait.hbp.automation.getpageobjects;

import static com.qait.hbp.automation.getpageobjects.ObjectFileReader.getPageTitleFromFile;
import static com.qait.hbp.automation.utils.ConfigPropertyReader.getProperty;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.NetworkConnectionSetting;
import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.qait.hbp.automation.utils.ConfigPropertyReader;
import com.qait.hbp.automation.utils.SeleniumWait;
import com.qait.hbp.automation.utils.YamlReader;
import com.thoughtworks.selenium.webdriven.commands.GetLocation;

/**
 *
 * @author QAIT
 */
public class BaseUi {

	WebDriver driver;
	protected SeleniumWait wait;
	private String pageName;
	AppiumDriver appiumDriver = (AppiumDriver) driver;

	Process p;
	protected BaseUi(WebDriver driver, String pageName) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.pageName = pageName;
		this.wait = new SeleniumWait(driver, Integer.parseInt(getProperty(
				"Config.properties", "timeout")));
		
	}
	
	public void changeImplicitTimeOut(int secs)
	{
		driver.manage().timeouts().implicitlyWait(secs,TimeUnit.SECONDS);
		this.wait = new SeleniumWait(driver, secs);
	}

	protected Actions returnActionsObject()
	{
		return new Actions(driver);
		
	}
	
	protected void OpenNewWindow() {
		((JavascriptExecutor) driver).executeScript("window.open('')");
	}
	
	protected JavascriptExecutor returnJSExecutor()
	{
		return (JavascriptExecutor)driver;
	}
	protected String getPageTitle() {
		return driver.getTitle();
	}

	protected String logMessage(String message) {
		Reporter.log(message, true);
		return message;
	}

	protected String getCurrentURL() {
		return driver.getCurrentUrl();
	}
	
	protected void launchURL(String url)
	{
		System.out.println("Launching URL"+url);
		driver.get(url);
	}

	protected void verifyPageTitleExact() {
		String pageTitle = getPageTitleFromFile(pageName);
		verifyPageTitleExact(pageTitle);
	}
	
	
	 public void wait_for_The_loading_Red_Grey_Spinner_To_Vanish(By loc)
	 {
		hardWait(1);
		changeWindow(1); 
	    wait.waitForElementToBeInVisible(loc);
	    logMessage("[INFO]: Red-Grey spinner vanished, application loaded! ");
	 }
	
	 public void re_size_window(int x, int y)
	 {
		 Dimension dimension = new Dimension(800, 600);
		 driver.manage().window().setSize(dimension);
		 
		 hardWait(2);
	 }
	 
	 public void Maximize_Browser()
	 {
		 driver.manage().window().maximize();
	 }
	
	 public void disable_Wifi_In_Android()
	 {
		 /*AndroidDriver androidDr= (AndroidDriver) driver;
		 launchSpecificUrl("https://www.google.co.in/");
		 hardWait(1);
		 
		 System.out.println("switch to airplane mode");
		 NetworkConnectionSetting n = new NetworkConnectionSetting(true,false,false);
		 
		 androidDr.setNetworkConnection(n);
		 System.out.println("switch to 3G mode");
		 
		 n = new NetworkConnectionSetting(false,false,true);
		 androidDr.setNetworkConnection(n);
		 */
		 /*NetworkConnectionSetting networkConnection = new NetworkConnectionSetting(false, true, false);
		 
		 networkConnection.setWifi(false);
		 networkConnection.setData(true); 
		 
		 androidDr.setNetworkConnection(networkConnection);
		 
		 networkConnection = androidDr.getNetworkConnection();*/
		 
		 try {
			p = Runtime.getRuntime().exec("adb shell am start -n io.appium.settings/.Settings -e wifi on");
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("net enabled");
	 }
	 
	public void clickUsingJavaScriptClickEvent(String locatorValue)
	{
		
	     //hardWait(1);
		 String path1=locatorValue;
	
		String js = "var targetElement = document.evaluate(\""+path1+"\",document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null ).singleNodeValue;"+
			
         "targetElement.click();";
		 ((JavascriptExecutor)driver).executeScript(js);
		
				
	}
	protected void verifyPageTitleExact(String expectedPagetitle) {
		if (((expectedPagetitle == "") || (expectedPagetitle == null) || (expectedPagetitle
				.isEmpty()))
				&& (getProperty("browser").equalsIgnoreCase("chrome"))) {
			expectedPagetitle = getCurrentURL();
		}
		try {
			wait.waitForPageTitleToBeExact(expectedPagetitle.toString());
			logMessage("[ASSERT PASSED]: PageTitle for " + pageName
					+ " is exactly: '" + expectedPagetitle + "'");
		} catch (TimeoutException ex) {
			logMessage("[ASSERT FAILED]: PageTitle for " + pageName
					+ " is not exactly: '" + expectedPagetitle
					+ "'!!!\n instead it is :- " + driver.getTitle());
		}
	}

	/**
	 * Verification of the page title with the title text provided in the page
	 * object repository
	 */
	protected void verifyPageTitleContains() {
		
		String expectedPagetitle = getPageTitleFromFile(pageName).trim();
		verifyPageTitleContains(expectedPagetitle);
	}

	protected void verifyPageTitleCorrect(String expected_title)
	{
		Assert.assertTrue(getPageTitle().trim().contains(expected_title.trim()),"[ASSERT FAILED]: Page title is not correct ");
		logMessage("[ASSERT PASSED]: Correct page title is displayed on launching eReader");
		
	}
	
	/**
	 * this method will get page title of current window and match it partially
	 * with the param provided
	 *
	 * @param expectedPagetitle
	 *            partial page title text
	 */
	protected void verifyPageTitleContains(String expectedPagetitle) {
		if (((expectedPagetitle == "") || (expectedPagetitle == null) || (expectedPagetitle
				.isEmpty()))
				&& (getProperty("browser").equalsIgnoreCase("chrome"))) {
			expectedPagetitle = getPageTitle();
		}
		try {
			wait.waitForPageTitleToContain(expectedPagetitle.toString());
			logMessage("[ASSERT PASSED]: PageTitle for " + pageName
					+ " contains: '" + expectedPagetitle + "'.");
		} catch (TimeoutException exp) {
			logMessage("[ASSERT FAILED]: As actual Page Title for '" + pageName
					+ "' does not contain expected Page Title : '"
					+ expectedPagetitle + "'.");
		}

	}

	/**
	 * this method will get page url of current window and match it partially
	 * with the param provided
	 *
	 * @param expectedPagetitle
	 *            partial page title text
	 */
	protected void verifyPageUrlContains(String expectedPageUrl) {
		wait.waitForPageToLoadCompletely();
		String currenturl = getCurrentURL();
		Assert.assertTrue(currenturl
				.toLowerCase()
				.trim()
				.contains(
						expectedPageUrl.toLowerCase()),
						logMessage("[INFO]: verifying: URL - " + currenturl
								+ " of the page '" + pageName
								+ "' contains: "
								+ expectedPageUrl));
		logMessage("[ASSERT PASSED]: URL of the page " + pageName
				+ " contains:- " + expectedPageUrl);

	}

	protected WebElement getElementByIndex(List<WebElement> elementlist,
			int index) {
		return elementlist.get(index);
	}

	protected WebElement getElementByExactText(List<WebElement> elementlist,
			String elementtext) {
		WebElement element = null;
		for (WebElement elem : elementlist) {
			if (elem.getText().equalsIgnoreCase(elementtext.trim())) {
				element = elem;
			}
		}
		// exception
		if (element == null) {
		}
		return element;
	}

	protected WebElement getElementByContainsText(List<WebElement> elementlist,
			String elementtext) {
		WebElement element = null;
		for (WebElement elem : elementlist) {
			if (elem.getText().contains(elementtext.trim())) {
				element = elem;
			}
		}
		// FIXME: handle if no element with the text is found in list
		if (element == null) {
		}
		return element;
	}

	protected void switchToFrame(WebElement element) {
		// switchToDefaultContent();
		wait.waitForElementToBeVisible(element);
		driver.switchTo().frame(element);
	}

	public void switchToFrame(int i) {
		driver.switchTo().frame(i);
	}

	public void switchToFrame(String id) {
		 wait.waitForFrameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@id='"+id+"']"));
	}

	public void switchToDefaultContent() {
		driver.switchTo().defaultContent();
		System.out.println("switched back to default content ");
	}

	protected void executeJavascript(String script) {
		((JavascriptExecutor) driver).executeScript(script);
	}

	protected Object executeJavascriptWithReturn(String script) {
		return ((JavascriptExecutor) driver).executeScript(script);
	}
	
	protected void executeJavascript(String script,WebElement e) {
		((JavascriptExecutor) driver).executeScript(script, e);
	}

	protected void hover(WebElement element) {
		Actions hoverOver = new Actions(driver);
		hoverOver.moveToElement(element).build().perform();
	}

	protected void sendKeysAction(WebElement element,String textToSend){
		Actions actionSendKeys = new Actions(driver);
		actionSendKeys.sendKeys(element,textToSend).build().perform();
	}
	
	protected void handleAlert() {
		try {
			switchToAlert().accept();
			logMessage("Alert handled..");
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			System.out.println("No Alert window appeared...");
		}
	}
	Set<String> windows;
	String wins[];
	
	protected int changeWindow(int i) {
		
		if (i > 0) {
			for (int j = 0; j < 9; j++) {
				windows = driver.getWindowHandles();
				logMessage("Windows: " + windows.size());

				if (windows.size() >= 2) {
					try {
						Thread.sleep(5000);
					} catch (Exception ex) {
						ex.printStackTrace();
					}
					break;
				}
			}
		}
		wins = windows.toArray(new String[windows.size()]);
		driver.switchTo().window(wins[i]);
		if(!(ConfigPropertyReader.getProperty("browser").contains("mobile")))
		   driver.manage().window().maximize();

		logMessage("Title: "
				+ driver.switchTo().window(wins[i]).getTitle());
		return windows.size();
	}
	
	public void scrollWindow(int x,int y)
	{
		hardWait(1);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+x+","+y+")", "");
		
	}
	
	public void scrollWindowToTheTop()
	{
		hardWait(1);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,0)", "");
		
	}
	
	protected void closeWindowAndSwitchBackToOriginalWindow(int i) {
		driver.close();
		driver.switchTo().window(wins[i]);
	}
	
	protected Alert switchToAlert() {
		WebDriverWait wait = new WebDriverWait(driver, 1);
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	protected void selectProvidedTextFromDropDown(WebElement el, String text) {
		wait.waitForElementToBeVisible(el);
		scrollDown(el);
		Select sel = new Select(el);
		sel.selectByVisibleText(text);
	}

	protected void scrollDown(WebElement element) {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView(true);", element);
	}

	protected void hoverClick(WebElement element) {
		Actions hoverClick = new Actions(driver);
		hoverClick.moveToElement(element).click().build().perform();
	}

	protected void click(WebElement element) {
		try {
			wait.waitForElementToBeVisible(element);
			scrollDown(element);
			element.click();
		} catch (StaleElementReferenceException ex1) {
			wait.waitForElementToBeVisible(element);
			scrollDown(element);
			element.click();
			logMessage("Clicked Element " + element
					+ " after catching Stale Element Exception");
		} catch (Exception ex2) {
			logMessage("Element " + element + " could not be clicked! "
					+ ex2.getMessage());
		}
	}

	
	
	protected void sendText(WebElement element,String text) {
		try {
			wait.waitForElementToBeVisible(element);
			scrollDown(element);
			element.clear();
			hardWait(1);
			element.sendKeys(text);
			hardWait(1);
		} catch (StaleElementReferenceException ex1) {
			wait.waitForElementToBeVisible(element);
			scrollDown(element);
			element.sendKeys(text);
			logMessage("Clicked Element " + element
					+ " after catching Stale Element Exception");
		} catch (Exception ex2) {
			logMessage("Element " + element + " could not be clicked! "
					+ ex2.getMessage());
		}
	}
	
	public void launchSpecificUrl(String url){
		driver.get(url);
	}
	
	public void launch_Core_Curriculum_Url(String url)
	{
		String target=url.replace("$","#!");
		logMessage("[INFO]: Target url is: "+target);
		driver.get(target);
	}
	
	public void clickByJavascript(WebElement element) {
		wait.waitForElementToBeVisible(element);
		scrollDown(element);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}
	
	 public void hardWait(int seconds) {
	        try {
	            Thread.sleep(seconds * 1000);
	        } catch (InterruptedException ex) {
	            ex.printStackTrace();
	        }
	      }
	
	public void waitUntilElementIsEnabled(WebElement el){
		int i=1;
		wait:while(!el.isEnabled()){
			if(i>15){
				break wait;
			}
			try {
				i++;
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void waitUntilWebElementListIsLoaded(List<WebElement> li){
		int timer=1;
		wait:while(!(li.size()>0)){
			if(timer>10){
				break wait;
			}
			try {
				timer++;
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public void swipeScreen_To_Left(WebElement el,WebElement el2)
	{	
		AndroidDriver driver1=(AndroidDriver) driver;
		
	   Point point=el.getLocation(); 
	   Point point2=el2.getLocation();
       
	   int x_of_el=point.getX();
	   int y_of_el=point.getY();
	   
	   int x_of_el2=point2.getX();
	   int y_of_el2=point2.getY();
       
       driver1.swipe(x_of_el,y_of_el,x_of_el,y_of_el2,2000);
    }
	
	
	//Additional debug methods:
	public void printPageURl(){
		System.out.println("PAge URL: "+driver.getCurrentUrl());
	}
	
	public void refreshThePage() {
		driver.navigate().refresh();
	}
	
	
	
	
}