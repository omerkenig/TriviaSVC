package pageObjects;

import static org.junit.Assert.fail;
import java.awt.AWTException;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.SAXException;
import com.relevantcodes.extentreports.LogStatus;
import utilities.extentReportManager;
import utilities.utils;
import utilities.utils;

public class mainPage extends utils {
	public mainPage(WebDriver driver) {
		this.driver = driver;
	}

	public static String text;
	public static WebElement text1;
	@FindBy(how = How.NAME, using = "question")
	public WebElement quest1;

	@FindBy(how = How.ID, using = "nextquest")
	public WebElement next;

	@FindBy(how = How.ID, using = "backquest")
	public WebElement backAns;

	@FindBy(how = How.CSS, using = "input[placeholder='first answer']")
	public WebElement ans1;

	@FindBy(how = How.CSS, using = "input[placeholder='seconde answer']")
	public WebElement ans2;

	@FindBy(how = How.CSS, using = "input[placeholder='thierd answer']")
	public WebElement ans3;

	@FindBy(how = How.CSS, using = "input[placeholder='forth answer']")
	public WebElement ans4;

	@FindBy(how = How.XPATH, using = "//div[@id='answers']//div[1]//div[1]//input[1]")
	public WebElement radio1;

	@FindBy(how = How.XPATH, using = "//div[@id='answers']//div[2]//div[1]//input[1]")
	public WebElement radio2;

	@FindBy(how = How.XPATH, using = "//div[@id='answers']//div[3]//div[1]//input[1]")
	public WebElement radio3;

	@FindBy(how = How.XPATH, using = "//div[@id='answers']//div[4]//div[1]//input[1]")
	public WebElement radio4;

	@FindBy(how = How.XPATH, using = "//button[contains(.,'Play')]")
	public WebElement play;

	@FindBy(how = How.XPATH, using = "//*[@id=\"2\"]/h3")
	public WebElement title1;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[3]/div[3]/input[1]")
	public WebElement ans1a;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[3]/div[3]/input[2]")
	public WebElement ans1b;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[3]/div[3]/input[3]")
	public WebElement ans1c;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[3]/div[3]/input[4]")
	public WebElement ans1d;

	@FindBy(how = How.CSS, using = "#\\31  > h3")
	public WebElement title2;

	@FindBy(how = How.XPATH, using = "//*[@id=\"1\"]/input[1]")
	public WebElement ans2a;

	@FindBy(how = How.XPATH, using = "//*[@id=\"1\"]/input[2]")
	public WebElement ans2b;

	@FindBy(how = How.XPATH, using = "//*[@id=\"1\"]/input[3]")
	public WebElement ans2c;

	@FindBy(how = How.XPATH, using = "//*[@id=\"1\"]/input[4]")
	public WebElement ans2d;

	@FindBy(how = How.XPATH, using = "//*[@id=\"0\"]/input[1]")
	public WebElement ans3a;

	@FindBy(how = How.XPATH, using = "//*[@id=\"0\"]/input[2]")
	public WebElement ans3b;

	@FindBy(how = How.XPATH, using = "//*[@id=\"0\"]/input[3]")
	public WebElement ans3c;

	@FindBy(how = How.XPATH, using = "//*[@id=\"0\"]/input[4]")
	public WebElement ans3d;

	@FindBy(how = How.XPATH, using = "//*[@id=\"0\"]/h3")
	public WebElement title3;

	@FindBy(how = How.ID, using = "btnnext")
	public WebElement nextans;

	@FindBy(how = How.XPATH, using = "//*[@id=\"needBackGround\"]")
	public WebElement finishEnter;

	@FindBy(how = How.XPATH, using = "//*[@id=\"mark\"]")
	public WebElement finish;

	@FindBy(how = How.XPATH, using = "//img[@alt='FackBoofLogo']")
	public WebElement facebook;

	public void chooseGoodAnswer1() throws ParserConfigurationException, SAXException, IOException, AWTException {
		try {
			text = title1.getText();
			switch (text.toLowerCase()) {
			case "aaaaaaaaaaaa":
				ans1a.click();
				break;
			case "bbbbbbbbbbbb":
				ans1b.click();
				break;
			case "cccccccccccc":
				ans1c.click();
				break;
			default:
				test.log(LogStatus.FAIL, "answer 1 : Wrong Selection");
				break;
			}
			test.log(LogStatus.PASS, "answer 1 : Was Selected Successfully");
		} catch (Exception exp) {
			test.log(LogStatus.FAIL, "Problem with answer 1 , Error Message: " + exp.getMessage()
					+ test.addScreenCapture(extentReportManager.CaptureScreen(timeStamp)));
			fail("Problem with answer 1 , See Report for more Details");
		}
	}

	public void chooseGoodAnswer2() throws ParserConfigurationException, SAXException, IOException, AWTException {
		try {
			text = title2.getText();
			switch (text.toLowerCase()) {
			case "aaaaaaaaaaaa":
				ans2a.click();
				break;
			case "bbbbbbbbbbbb":
				ans2b.click();
				break;
			case "cccccccccccc":
				ans2c.click();
				break;
			default:
				test.log(LogStatus.FAIL, "answer 2: Wrong Selection");
				break;
			}
			test.log(LogStatus.PASS, "answer 2 : Was Selected Successfully");
		} catch (Exception exp) {
			test.log(LogStatus.FAIL, "Problem with answer 2 , Error Message: " + exp.getMessage()
					+ test.addScreenCapture(extentReportManager.CaptureScreen(timeStamp)));
			fail("Problem with answer 2 , See Report for more Details");
		}
	}

	public void chooseGoodAnswer3() throws ParserConfigurationException, SAXException, IOException, AWTException {
		try {
			text = title3.getText();
			switch (text.toLowerCase()) {
			case "aaaaaaaaaaaa":
				ans3a.click();
				break;
			case "bbbbbbbbbbbb":
				ans3b.click();
				break;
			case "cccccccccccc":
				ans3c.click();
				break;
			default:
				test.log(LogStatus.FAIL, "answer 3 : Wrong Selection");
				break;
			}
			test.log(LogStatus.PASS, "answer 3 : Was Selected Successfully");
		} catch (Exception exp) {
			test.log(LogStatus.FAIL, "Problem with answer 3, Error Message: " + exp.getMessage()
					+ test.addScreenCapture(extentReportManager.CaptureScreen(timeStamp)));
			fail("Problem with answer 3, See Report for more Details");
		}
	}

	public boolean checkFinish() throws ParserConfigurationException, SAXException, IOException {
		try {
			if (finish.equals("Sucsses")) {
				System.out.println("You won the trivia ! ");
				return true;
			}
			test.log(LogStatus.PASS, "You won the trivia !");
		} catch (

		Exception exp) {
			test.log(LogStatus.FAIL, "You lose the trivia , Error Message: " + exp.getMessage()
					+ test.addScreenCapture(extentReportManager.CaptureScreen(timeStamp)));
			fail("Problem with continue , See Report for more Details");
		}
		return false;
	}

	public void facebookCheck() throws ParserConfigurationException, SAXException, IOException {
		try {
			facebook.click();
			driver.switchTo().alert().accept();
			if (driver.getTitle().contains("facebook")) {
				System.out.println("You connect to facebook ! ");

			}
			test.log(LogStatus.PASS, "facebook was successfully");
		} catch (

		Exception exp) {
			test.log(LogStatus.FAIL, "Problem with facebook , Error Message: " + exp.getMessage()
					+ test.addScreenCapture(extentReportManager.CaptureScreen(timeStamp)));
			fail("Problem with facebook , See Report for more Details");
		}
	}

	public void checkBackRadioSelect(WebElement element)
			throws ParserConfigurationException, SAXException, IOException {
		try {
			element.isSelected();
			test.log(LogStatus.PASS, "Your radio button save OK");
		} catch (

		Exception exp) {
			test.log(LogStatus.FAIL, "Your radio button not save , Error Message: " + exp.getMessage()
					+ test.addScreenCapture(extentReportManager.CaptureScreen(timeStamp)));
			fail("Your radio button not save , See Report for more Details");
		}
	}

	public void checkFinishEnter(WebElement element) throws ParserConfigurationException, SAXException, IOException {
		try {
			if (element.getText().contains("You finished to build the test"))
				test.log(LogStatus.PASS, "Your finish to enter ");
		} catch (

		Exception exp) {
			test.log(LogStatus.FAIL, "Problem with enter data , Error Message: " + exp.getMessage()
					+ test.addScreenCapture(extentReportManager.CaptureScreen(timeStamp)));
			fail("Problem with enter data , See Report for more Details");
		}
	}

	public void chooseWrongAnswer() throws ParserConfigurationException, SAXException, IOException, AWTException {
		try {
			text = (title1.getText());
			switch (text.toLowerCase()) {
			case "aaaaaaaaaaaa":
				ans1b.click();
				break;
			case "bbbbbbbbbbbb":
				ans1c.click();
				break;
			case "cccccccccccc":
				ans1a.click();
				break;
			default:
				test.log(LogStatus.FAIL, "answer 1 : Wrong Selection");
				break;
			}
			test.log(LogStatus.PASS, "answer 1 : Was Selected Successfully");
		} catch (Exception exp) {
			test.log(LogStatus.FAIL, "Problem with answer 1 , Error Message: " + exp.getMessage()
					+ test.addScreenCapture(extentReportManager.CaptureScreen(timeStamp)));
			fail("Problem with answer 1 , See Report for more Details");
		}
	}

	public void chooseGoodAnswerByTextAnswer()
			throws ParserConfigurationException, SAXException, IOException, AWTException {
		try {
			text = ((driver.findElement(By.xpath("//div[@id='0']//span[1]"))).getText());
			switch (text.toLowerCase()) {
			case "aaaaaaaaaaaa":
				ans3a.click();
				break;
			case "bbbbbbbbbbbb":
				ans3b.click();
				break;
			case "cccccccccccc":
				ans3c.click();
				break;
			default:
				test.log(LogStatus.FAIL, "answer 3 : Wrong Selection");
				break;
			}
			test.log(LogStatus.PASS, "answer 3 : Was Selected Successfully");
		} catch (Exception exp) {
			test.log(LogStatus.FAIL, "Problem with answer 3, Error Message: " + exp.getMessage()
					+ test.addScreenCapture(extentReportManager.CaptureScreen(timeStamp)));
			fail("Problem with answer 3, See Report for more Details");
		}
	}

	public boolean checkEndWhenAnswerWrong() {
		if (finish.getText()==("Sucsses")){
			return true;
		}
		return false;
	}

}
