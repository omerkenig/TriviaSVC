package pageObjects;

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
import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;
import com.relevantcodes.extentreports.LogStatus;
import utilities.extentReportManager;
import utilities.utils;
import static org.junit.Assert.fail;
import utilities.utils;
import java.io.IOException;
import javax.lang.model.element.Element;
import javax.xml.parsers.ParserConfigurationException;

public class Login extends utils {
	String text;

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "div[data-automation='continue-online']")
	public WebElement CreateAccount;



	
	public void CreateAccount(String Email)  {
		
	}
}
