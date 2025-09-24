package organization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crm.genericUtility.FileUtility;
import com.crm.genericUtility.WebDriverUtility;
import com.crm.objectRepository.LoginPage;

public class TC_Vtiger_001Test {
	FileUtility flib=new FileUtility();
	WebDriver driver=null;
	@Test
	public void loginToVtigerapplicationTest() {
		
	
		//give implicit time using reusable method because hardcoding is not allow in automation
		WebDriverUtility wu=new WebDriverUtility();
		wu.waitForPageToLoad(driver);
		
		//create object of login page because we want a element which are present in login page 
		//user text field,password test field,login button here we are using pom design technique
		//to store the current address of webElement and avoid StaleElementRefrenceException
		LoginPage lp=new LoginPage(driver);
		lp.getusernametextfield().clear();
		lp.getusernametextfield().sendKeys(username);//give by the user in runtime using cmd line
		
		lp.getpasswordtextfield().clear();
		lp.getpasswordtextfield().sendKeys(password);//give by the user in run time
		lp.getloginbutton().click();
		
		
		
	}

}
