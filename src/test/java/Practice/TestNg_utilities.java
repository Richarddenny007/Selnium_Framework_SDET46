package Practice;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Base_Class.Variable_Declaration;
import Generic_Utilities.EnumKey;
import Generic_Utilities.JavascriptExcecutorUtility;
import Generic_Utilities.POM_excel;
import Generic_Utilities.PropertyFilePath;
import Generic_Utilities.Property_Utility;
import Generic_Utilities.RobotclassUtility;
import Generic_Utilities.SeleniumUtility;

import Generic_Utilities.WaitUtility;
import sm_Biobook_Objectrepository.Pom_loginpage;

public class TestNg_utilities 
{
	public class ConfigurationClass extends Variable_Declaration
	{
		protected WebDriver  driver;
		protected SeleniumUtility sel;
		protected Property_Utility   proputils;
		protected POM_excel p;
		
		protected JavascriptExcecutorUtility js;
		protected WaitUtility wait;
		protected RobotclassUtility rbt;
		protected Pom_loginpage plg;

		//@BeforeTest

		@BeforeClass
		public void configurationsetUp()
		{
			System.out.println("before test");
			//script 1
			 sel=new SeleniumUtility();

			driver = sel.openBrowser("chrome");

			sel.maximizeBrowser();

			proputils=new Property_Utility(PropertyFilePath.PROPERTYFILE_PATH);

			p=new POM_excel();

			

			js=new JavascriptExcecutorUtility(driver);

			wait =new WaitUtility(driver, 10);

			rbt=new RobotclassUtility();

			plg=new Pom_loginpage(driver);

		}

		protected Map<String, String> data;
		@BeforeMethod
		public void launchApplicationsetUp()
		{
			String url = proputils.getPropData(EnumKey.URL);

			driver.get(url);

			 //data = p.fetchData();
	     
			//plg.sendData(data);

		}
		@AfterMethod
		public void closeApplicationTearDown()
		{
			driver.findElement(By.xpath("//button[.='Log out']")).click();
		}
		@AfterTest
		public void closeBrowserTearDown()
		{
			driver.close();
		}

	}

}
