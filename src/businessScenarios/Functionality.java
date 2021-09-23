package businessScenarios;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.xml.parsers.ParserConfigurationException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.SAXException;
import pageObjects.homePage;
import pageObjects.mainPage;
import utilities.commonOps;
import utilities.utils;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Functionality extends utils {

	// public static WebDriver driver;
	Random rnd = new Random();
	String[] arr_quest = new String[] { "",
			"aaaabbbbccccddddeeeeffffgggghhhhiiiikkkkllllmmmmnnnnooooppppqqqqrrrrssssttttuuuu", "!!@@##$$%%^^",
			"1234567890", "aaAA!!@@", "AAAaaaAAAaaa", "BBBbbbBBBbbb", "CCCcccCCCccc" };
	String[] arr_ans = new String[] { "", "aaaabbbbccccddddeeeeffffgggghhhhiii", "!!@@##$$%%^^", "1234567890",
			"aaAA!!@@", "AAAaaaAAAaaa", "BBBbbbBBBbbb", "CCCcccCCCccc" };
	private static String mainWindowHandle;
	public static String text = "";
	private static pageObjects.homePage home = new pageObjects.homePage(driver);
	private static pageObjects.mainPage main = new pageObjects.mainPage(driver);

	@BeforeClass
	public static void openBrowser() throws ParserConfigurationException, SAXException, IOException {
		initBrowser(getData("BrowserType"));
		mainWindowHandle = driver.getWindowHandle();
		initExtentReport();
		initElements();
		wait = new WebDriverWait(driver, Long.parseLong(getData("WaitTime")));

	}

	@Test
	public void Test01_Click_Start() throws Exception {

		
	}

	

	@After
	public void finalizingTest() throws ParserConfigurationException, SAXException, IOException {
		// recoveryTest(driver);
		finilizeExtentReportTest();
	}

	@AfterClass
	public static void closeBrowser() throws ParserConfigurationException, SAXException, IOException {
		finilizeExtentReport();
		// driver.quit();
	}

	// Rule that Handles test name for logs
	@Rule
	public TestName testName = new TestName();

	@Rule
	public TestWatcher testWatcher = new TestWatcher() {
		@Override
		protected void starting(final Description description) {
			String methodName = description.getMethodName();
			String className = description.getClassName();
			className = className.substring(className.lastIndexOf('.') + 1);
			System.err.println("Starting JUnit-test: " + className + " " + methodName);
		}
	};

	public static void initElements() {
		PageFactory.initElements(driver, main);
		PageFactory.initElements(driver, home);

	}

}
