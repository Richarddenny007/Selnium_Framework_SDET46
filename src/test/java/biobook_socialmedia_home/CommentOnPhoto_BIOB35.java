package biobook_socialmedia_home;




import java.util.Map;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import Base_Class.ConfigurationClass1;
import Report.ExtentReport;


@Listeners(Retry.SetTestParameter.class)
public class CommentOnPhoto_BIOB35 extends ConfigurationClass1
{
	@ExtentReport(author = "rakshith",category = "regression")
	@Test
	public void CommentOnPhoto() throws InterruptedException
	{
				 
		String curl = sel.getCurrentUrl();
		
		soft.assertTrue(curl.contains("signin"),"Login page is not displayed");
		
		Map<String, String>data=p.fetchData("xpath");
		String pxpath = "//input[@name='%s']";
		plg.sendData(data,pxpath);

		String title = sel.getTitle();

		soft.assertTrue(title.contains("Sign up"), "Login page is not displayed");

		WebElement comment = driver.findElement(By.xpath("//p[.='anime boy']"));
		js.scrollIntoView(comment);
		
		home.comment("nice picture");
		home.comtEnter();
		home.logout();
		home.login();
         
		Map<String, String> data1 = p.fetchData("karthik");
        plg.sendData(data1,pxpath);

		WebElement coms = driver.findElement(By.xpath("//div[.='nice picture']"));
		js.scrollIntoView(coms);

		if(coms.isDisplayed())
		{
			System.out.println("comment is displayed");
		}
		soft.assertAll();
	}

}




















/*LoginPageElement login=new LoginPageElement(driver);
login.getUserName(ed.decrypt(kiran));
login.getPasword(ed.decrypt(kiranpwd));
login.clickLoginbutton();*/

/*driver.findElement(By.name("email")).sendKeys(ed.decrypt(kiran));
driver.findElement(By.name("password")).sendKeys(ed.decrypt(kiranpwd));
driver.findElement(By.name("submit")).click();*/





/*	String kiran = proputils.getPropData(EnumKey.KIRAN);
String kiranpwd = proputils.getPropData(EnumKey.KIRANPWD);

EncryptAndDecrypt ed=new EncryptAndDecrypt();*/

//String title = driver.getTitle();
//System.out.println(title);
// if(title.contains("Sin up"))

/*String karthik = proputils.getPropData(EnumKey.KARTHIK);
String karthikpwd = proputils.getPropData(EnumKey.KARTHIKPWD);*/

/*GetDate get=new GetDate();
String date = get.getcurrentDateTime();*/

//driver.findElement(By.name("submit")).click();

/*public void CommentOnPhoto()
	{

	   /*  SeleniumUtility sel=new SeleniumUtility();

		WebDriver driver = sel.openBrowser("chrome");

		sel.maximizeBrowser();

		Property_Utility proputils=new Property_Utility(PropertyFilePath.PROPERTYFILE_PATH);
		String url = proputils.getPropData(EnumKey.URL);

		driver.get(url);
		driver.findElement(By.xpath("//button[.='Sign in']")).click();

		POM_excel p=new POM_excel();
		Map<String, String> data = p.fetchData();

		Pom_loginpage plg=new Pom_loginpage(driver);

		plg.sendData(data);

		String title = sel.getTitle();

        VerifictionUtility verify=new VerifictionUtility();

		verify.verifyActual(title," Sign up",driver);

     	WebElement comment = driver.findElement(By.xpath("//p[.='anime boy']"));

		JavascriptExcecutorUtility js=new JavascriptExcecutorUtility(driver);
		js.scrollIntoView(comment);
		driver.findElement(By.xpath("(//input[@name='content_comment'])[5]")).sendKeys("nice picture");

		driver.findElement(By.xpath("(//input[@name='post_comment'])[5]")).click();
		driver.findElement(By.xpath("//button[.='Log out']")).click();
		driver.findElement(By.xpath("//button[.='Sign in']")).click();

	    Map<String, String> data1 = p.fetchData1();
	    plg.sendData(data1);

		WebElement coms = driver.findElement(By.xpath("//div[.='nice picture']"));
		js.scrollIntoView(coms);

		if(coms.isDisplayed())
		{
			System.out.println("comment is displayed");
		}

	}
 */
//	driver.findElement(By.xpath("//button[.='Sign in']")).click();
//Pom_Signin signin=new Pom_Signin(driver);
		//signin.login();

//driver.findElement(By.xpath("(//input[@name='content_comment'])[5]")).sendKeys("nice picture");

		//driver.findElement(By.xpath("(//input[@name='post_comment'])[5]")).click();
		
		
		//driver.findElement(By.xpath("//button[.='Log out']")).click();
		
		//driver.findElement(By.xpath("//button[.='Sign in']")).click();