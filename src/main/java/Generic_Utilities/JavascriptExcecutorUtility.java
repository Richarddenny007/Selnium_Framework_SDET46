package Generic_Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * This class is contain reusable methods to handle disable element and to perform scrollbar action
 * @author Lenovo
 *
 */
public class JavascriptExcecutorUtility
{
	
	JavascriptExecutor js;	
	/**
	 * This constructor will initialize javascriptexecutor and we need to pass browser address and it will be explicitly typcast to javascript executor
	 * @param driver
	 */
	public JavascriptExcecutorUtility(WebDriver driver)
	{
		js=(JavascriptExecutor)driver;
	}
	/**
	 *This method is used to perform scrolldown action 
	 */
	public void scrollDownUser(int x,int y)
	{
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
/**
 * This method is used to scroll into particular element and we need to pass elelement address
 * @param ele
 */
	public void scrollIntoView(WebElement ele)
	{
		js.executeScript("arguments[0].scrollIntoView();",ele);

	}
	/**
	 * This method is used to send the value into disable element and we need to pass the address of the element
	 * @param ele
	 * @param value
	 */
	
	public void disableElementSendValue(WebElement ele,String value)
	{
		js.executeScript("arguments[0].value='"+value+"'",ele);
	}
	/**
	 * This method is used to perform click action on disable element 
	 * @param ele
	 */
	public void disableElementClick(WebElement ele)
	{
		js.executeScript("arguments[0].click();",ele);
	}
/**
 * This method is used clear the value inside the disable element
 * @param ele
 */
	public void disableElementClear(WebElement ele)
	{
		js.executeScript("arguments[0].clear();",ele);
	}
	/**
	 * This method is used to perform scrollup action 
	 */
	public void scrollUpUser(int x,int y)

	{
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
/**
 *  This method is used clear the value inside the disable element
 * @param id
 */
	public void getElementByIdClear(String id)

	{
		js.executeScript("document.getElementById('"+id+"').value=''");
	}
	/**
	 * This method is used to send the value into disable element
	 * @param id
	 * @param value
	 */
	public void getElementByIdSend(String id,String value)

	{
		js.executeScript("document.getElementById('"+id+"').value='"+value+"'");
	}
	/**
	 * this method is used to scroll up to the staring of the page
	 */
	public void scrollup()
	{
		js.executeScript("window.scrollBy(0,-document.body.ScrollHeight)");
	}
	/**
	 * this method is used to scroll down to the end of the page
	 */
	public void scrollDown()
	{
		js.executeScript("window.scrollBy(0,document.body.ScrollHeight)");
	}
	/**
	 * This method is used to launch the application 
	 * @param url
	 */
	public void launchApplication(String url)
	{
		js.executeScript("window.location='"+url+"'");
	}
	public void highlightElement(WebElement element)
	{
		js.executeScript("arguments[0].setAttribute('style','border:8px dotted green;');",element);
		
	}
	public void maximize()
	{
		
	}
	
}
