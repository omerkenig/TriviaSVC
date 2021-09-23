package pageObjects;

import java.awt.AWTException;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.SAXException;
import static org.junit.Assert.fail;
import com.relevantcodes.extentreports.LogStatus;

import utilities.extentReportManager;
import utilities.utils;

//import utilities.utils;

public class homePage extends utils {
	// WebDriverWait wait = new WebDriverWait(driver,20);
	public homePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[@title='Log in to your customer account']")
	public WebElement Login;
	
	@FindBy(how = How.ID, using = "email_create")
	public WebElement Email;
	

	@FindBy(how = How.ID, using = "SubmitCreate")
	public WebElement Create;
	
	@FindBy(how = How.ID, using = "id_gender1")
	public WebElement title;
	

	@FindBy(how = How.ID, using = "customer_firstname")
	public WebElement firstName;
	
	@FindBy(how = How.ID, using = "customer_lastname")
	public WebElement lastName;
	
	@FindBy(how = How.ID, using = "passwd")
	public WebElement password;
	

	@FindBy(how = How.ID, using = "days")
	public WebElement day;


	@FindBy(how = How.ID, using = "months")
	public WebElement month;
	

	@FindBy(how = How.ID, using = "years")
	public WebElement year;

	

	public void action(String setting, String shape, String weight)
			throws InterruptedException, ParserConfigurationException, SAXException, IOException, AWTException {
	
	}

	public void itemSetting(String setting)
			throws ParserConfigurationException, SAXException, IOException, AWTException {
		}

	
}
