package Base_Class;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import Generic_Utilities.JavascriptExcecutorUtility;
import Generic_Utilities.POM_excel;
import Generic_Utilities.Property_Utility;
import Generic_Utilities.RobotclassUtility;
import Generic_Utilities.SeleniumUtility;

import Generic_Utilities.WaitUtility;
import sm_Biobook_Objectrepository.Pom_HomePage;
import sm_Biobook_Objectrepository.Pom_PhotoPage;
import sm_Biobook_Objectrepository.Pom_ProfilePage;
import sm_Biobook_Objectrepository.Pom_Signin;
import sm_Biobook_Objectrepository.Pom_loginpage;



public class Variable_Declaration 

{

	protected WebDriver  driver;
	public SeleniumUtility sel;
	protected Property_Utility   proputils;
	protected POM_excel p;
	protected JavascriptExcecutorUtility js;
	protected WaitUtility wait;
	protected RobotclassUtility rbt;
	protected Pom_loginpage plg;
    protected SoftAssert soft;
    protected String browser;
    protected Pom_ProfilePage profPage;
    protected Pom_PhotoPage photo;
    protected Pom_HomePage home;
    protected Pom_Signin signin;
} 
