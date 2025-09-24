package organization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.genericUtility.FileUtility;
import com.crm.genericUtility.WebDriverUtility;
import com.crm.objectRepository.LoginPage;

public class TC_Vtiger_001Test {
	FileUtility flib=new FileUtility();
	WebDriver driver=null;
	@Test
	public void demo1Test() {
		
	Reporter.log("demo test 1 run for demo vtigr",true);
		}

}
