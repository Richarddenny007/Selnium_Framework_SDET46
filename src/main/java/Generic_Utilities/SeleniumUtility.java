package Generic_Utilities;

import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Optional;

import io.github.bonigarcia.wdm.WebDriverManager;



public class SeleniumUtility
{
	private WebDriver driver;

	/**
	 * This method is used to launch the browser and we need to pass the address of browser 
	 * @return 
	 */
	public WebDriver openBrowser(String browser)
	{
		switch(browser)
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":   
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;

		case "edge":   
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;

		case "ie":   
			WebDriverManager.iedriver();
			driver=new InternetExplorerDriver();

			break;

		case "opera":   
			WebDriverManager.operadriver();
			driver=new OperaDriver();

			break;



		}
		return driver;
	}
	/**
	 * This method is used to maximize the browser  
	 */
	public void maximizeBrowser()
	{
		driver.manage().window().maximize();
	}

	/**
	 * This method is used to launch the application
	 */
	public void openAppliction(String url)
	{
		driver.get(url);
	}

	/**
	 * This method is used to resize the browser
	 */
	public void resizeBrowser(int width,int hight)
	{
		driver.manage().window().setSize(new Dimension(width, hight));
	}
	/**
	 * This method is used to set the position of browser 
	 */
	public void setBrowserPosition(int x,int y)
	{
		driver.manage().window().setPosition(new Point(x, y));
	}
	/**
	 * This method is used to close the entire browser
	 */
	public void closeBrowser()
	{
		driver.quit();
	}
	/**
	 * This method is used to close the single tab
	 */
	public void closeTab()
	{
		driver.close();
	}
	/**
	 * to get the title of the page
	 * @return
	 */
	public String getTitle()
	{
		return driver.getTitle();

	}
	/**
	 * to get the url of current page
	 * @return
	 */
	public String getCurrentUrl()
	{
          return driver.getCurrentUrl();
          
	}
	
	GetDate get;
	public String getScreenShot(WebDriver driver,String testcasename)
	{
		get=new GetDate();
	//	String date = get.getcurrentDateTime();
		
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(ScreenshotPath.SCREENSHOT_PATH+get.getCurrentdate()+testcasename+".jpeg");
		try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dst.getAbsolutePath();
		
	}
	public String getScreenShot(WebElement element)
	{		
		
		File src = element.getScreenshotAs(OutputType.FILE);
		File dst=new File("./ScreenShot/"+get.getcurrentDateTime()+".jpeg");
		try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dst.getAbsolutePath();
		
	}
	public String getScreenShot()
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		return	ts.getScreenshotAs(OutputType.BASE64);	
	}
	
	public void getPageSource()
	{
		driver.getPageSource();
		
	}
	/**
	 * This method will return both parent and child browser id
	 * @param driver
	 * @param id
	 * @return
	 */
	public Set<String> getParentAndChildBrowserId(WebDriver driver,String id)
	{
		return driver.getWindowHandles();
		
	
	}
	/**
	 * This method is used to fetch the parent browser id
	 * @param driver
	 * @param parentid
	 * @return
	 */
	public String getParentBrowserId(WebDriver driver,String parentid)
	{
		return driver.getWindowHandle();
		
	
	}
		

}
