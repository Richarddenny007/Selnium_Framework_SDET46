package Generic_Utilities;

import java.util.Set;

import org.openqa.selenium.WebDriver;
/**
 * This class is contain reusable method to handle alert popup
 * @author Lenovo
 *
 */
public class PopupUtility 
{
	/**
	 * This method is used to accept the alert
	 * @param driver
	 */
	public void alertAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	/**
	 * This method is used to close te alert popup 
	 * @param driver
	 */
	public void alertDissmiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	/**
	 * This method is used to get the text from alert popup 
	 * @param driver
	 * @return
	 */
	public String alertGetText(WebDriver driver) 
	{
		String text = driver.switchTo().alert().getText();

		return text;
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


}
