package biobook_socialmedia_home;


import java.util.Map;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base_Class.ConfigurationClass1;





public class UploadPhoto extends ConfigurationClass1 
{

	@Test
	public void uploadPhoto()
	{
		
		String title = sel.getTitle();

		Assert.assertTrue(title.contains("Log in"),"Home page is not displayed");

		Map<String, String> data = p.fetchData("xpath");

		String pxpath = "//input[@name='%s']";
		plg.sendData(data,pxpath);

		

		home.uploadPhoto("D:\\Movies\\wallpapers\\segtwbhffwy01w82.jpg");
		home.updateStatus("anime boy");
		home.share();
		home.logout();
		home.login();
		
		Map<String, String> data2 = p.fetchData("karthik");

		plg.sendData(data2,pxpath);

		WebElement photo = driver.findElement(By.xpath("//p[.='anime boy']"));
		
		if(photo.isDisplayed())
		{
			System.out.println("photo is displayed");
		}

	}

}

























//driver.findElement(By.xpath("//button[.='Share']")).click();


/*driver.findElement(By.xpath("//button[.='Log out']")).click();
driver.findElement(By.xpath("//button[.='Sign in']")).click(); */


//driver.findElement(By.xpath("//input[@name='image']"))
// .sendKeys("D:\\Movies\\wallpapers\\segtwbhffwy01w82.jpg");
	
//	driver.findElement(By.name("content")).sendKeys("anime boy");







//   if(title.contains("Welcome  To Biobook - Sin up, Log in, Chat"))

/*  String kiran = prop.getPropData(EnumKey.KIRAN);
  String kiranpwd = prop.getPropData(EnumKey.KIRANPWD);

  EncryptAndDecrypt ed=new EncryptAndDecrypt();


	driver.findElement(By.name("email")).sendKeys(ed.decrypt(kiran));
	driver.findElement(By.name("password")).sendKeys(ed.decrypt(kiranpwd));
	driver.findElement(By.name("submit")).click();    */
//login as karthik check whether uploaded photo is displayed

// String karthik = prop.getPropData(EnumKey.KARTHIK);
//String karthikpwd = prop.getPropData(EnumKey.KARTHIKPWD);
/*	String karthik = prop.getProperty("karthik");
		String karthikpwd = prop.getProperty("karthikpwd");*/


/*driver.findElement(By.name("email")).sendKeys(ed.decrypt(karthik));
		driver.findElement(By.name("password")).sendKeys(ed.decrypt(karthikpwd));
		driver.findElement(By.name("submit")).click();*/


/*public void uploadPhoto()
	{


		/*SeleniumUtility sel=new SeleniumUtility();
		WebDriver driver = sel.openBrowser("chrome");
		sel.maximizeBrowser();

		Property_Utility proputils=new Property_Utility(PropertyFilePath.PROPERTYFILE_PATH);
		String url = proputils.getPropData(EnumKey.URL);
		driver.get(url);

		driver.findElement(By.xpath("//button[.='Sign in']")).click();
		String title = driver.getTitle();
		System.out.println(title);

	//	POM_excel p=new POM_excel();
		Map<String, String> data = p.fetchData();

	//	Pom_loginpage plg=new Pom_loginpage(driver);
		plg.sendData(data);


		driver.findElement(By.xpath("//input[@name='image']"))
		.sendKeys("D:\\Movies\\wallpapers\\segtwbhffwy01w82.jpg");
		driver.findElement(By.name("content")).sendKeys("anime boy");
		driver.findElement(By.xpath("//button[.='Share']")).click();
		driver.findElement(By.xpath("//button[.='Log out']")).click();
		driver.findElement(By.xpath("//button[.='Sign in']")).click(); 

		Map<String, String> data1 = p.fetchData1();
		plg.sendData(data1);



		WebElement photo = driver.findElement(By.xpath("//p[.='anime boy']"));
		if(photo.isDisplayed())
		{
			System.out.println("photo is displayed");
		}

	}*/
/*	String Pxpath1="//button[.='%s']";
Map<String, String> data1 = p.fetchData("SlogoutS");
plg.sendData(data1, Pxpath1);*/
//driver.findElement(By.xpath("//button[.='Sign in']")).click();