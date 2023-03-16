package Base_Class;

import java.util.Map;
import org.openqa.selenium.By;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;
import Generic_Utilities.EnumKey;
import Generic_Utilities.JavascriptExcecutorUtility;
import Generic_Utilities.POM_excel;
import Generic_Utilities.PropertyFilePath;
import Generic_Utilities.Property_Utility;
import Generic_Utilities.RobotclassUtility;
import Generic_Utilities.SeleniumUtility;
import Generic_Utilities.WaitUtility;
import Report.ExtentReportListner;
import Report.ReportUtility;
import sm_Biobook_Objectrepository.Pom_HomePage;
import sm_Biobook_Objectrepository.Pom_PhotoPage;
import sm_Biobook_Objectrepository.Pom_ProfilePage;
import sm_Biobook_Objectrepository.Pom_Signin;
import sm_Biobook_Objectrepository.Pom_loginpage;
/**
 * This class contains all testNG configuration annotation
 * @author Lenovo
 *
 */


public class ConfigurationClass1 extends Variable_Declaration
{
	ExtentReportListner extent;
	public ReportUtility report;
   @Parameters(value="browser")
	@BeforeClass(alwaysRun = true)
	public void configurationsetUp(@Optional String browser)
	{
		
	     extent=new ExtentReportListner();
		 report = extent.sreport;
	    
		 sel=new SeleniumUtility();

		 if(browser==null)
		 {
		driver = sel.openBrowser("chrome");
		 }
		 else
		 {
			 driver=sel.openBrowser(browser);
		 }
		
		sel.maximizeBrowser();

		proputils=new Property_Utility(PropertyFilePath.PROPERTYFILE_PATH);

		p=new POM_excel();

		

		js=new JavascriptExcecutorUtility(driver);

		wait =new WaitUtility(driver, 10);

		rbt=new RobotclassUtility();

		plg=new Pom_loginpage(driver);
		
		soft=new SoftAssert();
		
	    profPage=new Pom_ProfilePage(driver);
		
		 photo=new Pom_PhotoPage(driver);
		 
		 home=new Pom_HomePage(driver);
        
		 signin=new Pom_Signin(driver);
	}

	
	@BeforeMethod(alwaysRun = true)
	public void launchApplicationsetUp()
	{
		String url = proputils.getPropData(EnumKey.URL);

		driver.get(url);

		
		signin.login();
		

	}
	
	@AfterMethod(alwaysRun = true)
	public void closeApplicationTearDown()
	{
	   	driver.findElement(By.xpath("//button[.='Log out']")).click();
	}
	@AfterClass(alwaysRun = true)
	
	public void closeBrowserTearDown()
	{
		driver.close();
	}

}
