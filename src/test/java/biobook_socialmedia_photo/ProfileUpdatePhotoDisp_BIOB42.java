package biobook_socialmedia_photo;

import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base_Class.ConfigurationClass1;
import Generic_Utilities.RobotclassUtility;
import Report.ExtentReport;
import Report.UtilityListenerTransfer;


public class ProfileUpdatePhotoDisp_BIOB42 extends ConfigurationClass1
{
    @ExtentReport(author = "rakshith",category = "regression")
	@Test(groups = "sanity")
	public void profileUpdatePhotoDisp() throws InterruptedException 
	{
		
		String title =sel.getTitle();

	   	Assert.assertTrue(title.contains("Log in"),"login page is not Displayed");
		//report.info("login page is displayed", UtilityListenerTransfer.getExtent());
		

		Map<String, String> data = p.fetchData("xpath");
		String pxpath = "//input[@name='%s']";
		plg.sendData(data,pxpath);

		String curl = driver.getCurrentUrl();


		Assert.assertTrue(curl.contains("home"),"Home Page is not displayed");
     
		profPage.profileButton();
		profPage.editProfileClick();
		profPage.userNameClear();
		profPage.userNameSend("RAKSHITH");
		js.scrollDownUser(0, 300);
		profPage.genderClick();
		
     	RobotclassUtility rbt=new RobotclassUtility();
		rbt.downEnter();
		profPage.profileSave();
		
        photo.photoButton();
		WebElement username = driver.findElement(By.xpath("//label[.='RAKSHITH']"));

		if(username.isDisplayed())
		{
			System.out.println("profile information updated in photo page");
		}

	}

}







/*driver.findElement(By.xpath("//label[.='Profile']")).click();
driver.findElement(By.xpath("//button[.='Edit Profile']")).click();

WebElement un = driver.findElement(By.name("username"));
un.clear();
un.sendKeys("RAKSHITH");
driver.findElement(By.xpath("//select[@name='gender']")).click();*/


//driver.findElement(By.xpath("//button[.='Save']")).click();
		
		//driver.findElement(By.xpath("//label[.='Photos']")).click();




//Pom_ProfilePage profPage=new Pom_ProfilePage(driver);
		//Pom_PhotoPage photo=new Pom_PhotoPage(driver);





/*driver.get(url);
System.out.println(url);
String kiran = proputils.getPropData("kiran");
String kiranpwd = proputils.getPropData("kiranpwd");*/




/*	Robot rbt;
	try {
		rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
	} catch (AWTException e) {

		e.printStackTrace();
	}*/

//Instead of using key we use hear enum because we might done mistake while specifying key

// calling enum by reference variable and passing the enum to getpropData method in Property_Utility class


/*if(title.contains("Log in"))
{
System.out.println("Login page is displayed");*/

/*JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,300)");*/

/*EncryptAndDecrypt ed=new EncryptAndDecrypt();

LoginPageElement login=new LoginPageElement(driver);
login.getUserName(ed.decrypt(kiran));
login.getPasword(ed.decrypt(kiranpwd));
login.clickLoginbutton();

driver.findElement(By.name("email")).sendKeys(kiran);
driver.findElement(By.name("password")).sendKeys(kiranpwd);
driver.findElement(By.name("submit")).click();*/

/*	String kiran = (proputils.getPropData(EnumKey.KIRAN));
    String kiranpwd = proputils.getPropData(EnumKey.KIRANPWD);*/


/*public void profileUpdatePhotoDisp()
	{

		/*SeleniumUtility sel=new SeleniumUtility();
		WebDriver driver = sel.openBrowser("chrome");

		Property_Utility proputils= new Property_Utility(PropertyFilePath.PROPERTYFILE_PATH);

		String url = proputils.getPropData(EnumKey.URL);
		driver.get(url);

		driver.findElement(By.xpath("//button[.='Sign in']")).click();
		String title = driver.getTitle();
		System.out.println(title);

		//VerifictionUtility verify=new VerifictionUtility();
		verify.verifyActual(title, "Log in", driver);

		//POM_excel p=new POM_excel();
		Map<String, String> data = p.fetchData();

	//	Pom_loginpage plg=new Pom_loginpage(driver);
		plg.sendData(data);




		String curl = driver.getCurrentUrl();


		verify.verifyActual(curl, "home",driver);

		// if(curl.contains("home"))

			 System.out.println("home page is displayed");
		driver.findElement(By.xpath("//label[.='Profile']")).click();
		driver.findElement(By.xpath("//button[.='Edit Profile']")).click();

		WebElement un = driver.findElement(By.name("username"));
		un.clear();
		un.sendKeys("RAKSHITH");

		//JavascriptExcecutorUtility js =new JavascriptExcecutorUtility(driver);
		js.scrollDownUser(0, 300);

		driver.findElement(By.xpath("//select[@name='gender']")).click();
		RobotclassUtility rbt=new RobotclassUtility();
		rbt.downEnter();


		driver.findElement(By.xpath("//button[.='Save']")).click();
		driver.findElement(By.xpath("//label[.='Photos']")).click();
		WebElement username = driver.findElement(By.xpath("//label[.='RAKSHITH']"));

		if(username.isDisplayed())
		{
			System.out.println("profile information updated in photo page");
		}*/
//verify.verifyActual(title, "Log in", driver);

//verify.verifyActual(curl, "home",driver);

//driver.findElement(By.xpath("//button[.='Sign in']")).click();