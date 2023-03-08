package sm_Biobook_Objectrepository;

import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Pom_loginpage {

	//String pxpath="//input[@name='%s']";
	
	private WebDriver driver;
	public WebElement convertElement(String pxpath,String replace)
	{
		String xpath = String.format(pxpath, replace);
		return driver.findElement(By.xpath(xpath));		
	}
	public Pom_loginpage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void sendData(Map<String, String> key,String pxpath)
	{
		for(Entry<String, String> keyvalue:key.entrySet())
		{
			convertElement(pxpath,keyvalue.getKey()).sendKeys(keyvalue.getValue());
			convertElement(pxpath,keyvalue.getKey()).click();
		}
	}
	
	
}
