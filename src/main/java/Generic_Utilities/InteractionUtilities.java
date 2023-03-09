package Generic_Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class InteractionUtilities{

	Actions act;
	/**
	 * This method will initialize the action class and we need to pass the browser address
	 * @param driver
	 */
	public InteractionUtilities(WebDriver driver)
	{
		act =new Actions(driver);
	}
	/**
	 *This method is used to perform mouse over action and we need to pass address of the element 
	 * @param add
	 */
	public void moveToElement(WebElement add)
	{
		act.moveToElement(add).perform();
	}
	/**
	 * This method is used to perform drag and drop action and we need to pass address of two element 
	 * @param src
	 * @param dst
	 */
	public void dragAndDrop(WebElement src,WebElement dst)
	{
		act.dragAndDrop(src, dst).perform();
	}
	/**
	 *This method is used to perform right click action and we need to pass address of the element 
	 * @param add
	 */
	public void rightClick(WebElement add)
	{
		act.contextClick(add).perform();
	}
	/**
	 * This method is used to perform double click action and we need to pass the address of the element
	 * @param add
	 */
	public void doubleClick(WebElement add)

	{
		act.doubleClick(add).perform();
	}
}


