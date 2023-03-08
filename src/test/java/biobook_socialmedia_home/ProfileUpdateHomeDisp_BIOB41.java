package biobook_socialmedia_home;


import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Base_Class.ConfigurationClass1;



public class ProfileUpdateHomeDisp_BIOB41 extends ConfigurationClass1
{

	@Test(groups = "regression")
	public void ProfileUpdateHomeDisp()
	{
		
		
		 
		String title = sel.getTitle();
		
		soft.assertTrue(title.contains("Sin up"),"Login page is not displayed");
		
		Map<String, String> data = p.fetchData("xpath");
		
	    String pxpath = "//input[@name='%s']";
		plg.sendData(data,pxpath);

        String curl = sel.getCurrentUrl();
        
        soft.assertTrue(curl.contains("home"));
        
        profPage.profileButton();
     	profPage.editProfileClick();
		profPage.userNameClear();
		profPage.userNameSend("Richard");
	    profPage.numberClear();
	    profPage.numberSend("12345");
		profPage.genderClick();
		rbt.downEnter();
		
	
		
		WebElement save=driver.findElement(By.xpath("//button[text()='Save']"));
		
		js.scrollIntoView(save);
		save.click();
		
		//driver.findElement(By.xpath("//label[.='Home']")).click();
		home.HomeButton();
		
		
		WebElement username = driver.findElement(By.xpath("//b[.='Richard']"));
	
		if(username.isDisplayed())
		{
			System.out.println("testcase is pass");
		}

		soft.assertAll();
	}
}













//driver.findElement(By.xpath("//button[.='Edit Profile']")).click();
		
		//WebElement un = driver.findElement(By.name("username")); un.clear();
		
		
		
		//un.sendKeys("Richard");


/*WebElement no = driver.findElement(By.name("number"));
no.clear();
no.sendKeys("1235");*/




//driver.findElement(By.xpath("//select[@name='gender']")).click();







/*WebDriverManager.firefoxdriver().setup();
WebDriver driver=new FirefoxDriver();
WebDriverWait wait=new WebDriverWait(driver,10);
driver.manage().window().maximize();*/



/*	String kiran = prop.getPropData(EnumKey.KIRAN);
	String kiranpwd = prop.getPropData(EnumKey.KIRANPWD);*/


//login.getUserName(ed.decrypt(kiran));
//login.getPasword(ed.decrypt(kiranpwd));
//login.clickLoginbutton();

//EncryptAndDecrypt ed=new EncryptAndDecrypt();

/*driver.findElement(By.name("email")).sendKeys(kiran);
driver.findElement(By.name("password")).sendKeys(kiranpwd);
driver.findElement(By.name("submit")).click();*/


/*public void ProfileUpdateHomeDisp()
	{

		/*SeleniumUtility sel=new SeleniumUtility();
		WebDriver driver = sel.openBrowser("chrome");
		sel.maximizeBrowser();
		WaitUtility wait =new WaitUtility(driver, 10);
		
		
		Property_Utility proputils=new Property_Utility(PropertyFilePath.PROPERTYFILE_PATH);
		String url = proputils.getPropData(EnumKey.URL);
		driver.get(url);

		driver.findElement(By.xpath("//button[.='Sign in']")).click();
       
     	/*POM_excel p=new POM_excel();
		Map<String, String> data = p.fetchData();
		
		Pom_loginpage plg=new Pom_loginpage(driver);
		
		String title = sel.getTitle();
		System.out.println(title);
		
		verify.verifyActual(title,"Sin up",driver);
		
		data=p.fetchData("xpath");
		
		plg.sendData(data);

		

	//	System.out.println("signin page is displayed");

		//if(Url.contains("signin"))
		//VerifictionUtility verify=new VerifictionUtility();
		
        String curl = sel.getCurrentUrl();
        
        verify.verifyActual(curl, "home", driver);
        
        
    	WebElement profile = driver.findElement(By.xpath("//label[.='Profile']"));
		wait.explicitWaitclick(driver, profile);	

		driver.findElement(By.xpath("//button[.='Edit Profile']")).click();
		WebElement un = driver.findElement(By.name("username"));
		un.clear();
		
		un.sendKeys("RichardDenny");
		
		WebElement no = driver.findElement(By.name("number"));
		no.clear();
        no.sendKeys("1235");
		
		
		driver.findElement(By.xpath("//select[@name='gender']")).click();

		//RobotclassUtility rbt=new RobotclassUtility();
		rbt.downEnter();
		WebElement save=driver.findElement(By.xpath("//button[text()='Save']"));
		//JavascriptExcecutorUtility js=new JavascriptExcecutorUtility(driver);
		js.scrollIntoView(save);
		save.click();
		
		driver.findElement(By.xpath("//label[.='Home']")).click();
		
		WebElement username = driver.findElement(By.xpath("//b[.='Richard']"));
	
		if(username.isDisplayed())
		{
			System.out.println("testcase is pass");
		}
*///verify.verifyActual(title,"Sin up",driver);
//  verify.verifyActual(curl, "home", driver);
//driver.findElement(By.xpath("//button[.='Sign in']")).click();