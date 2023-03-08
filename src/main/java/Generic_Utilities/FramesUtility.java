package Generic_Utilities;

import org.openqa.selenium.WebDriver;
/**
 * This class is contain reusable method to handle frames
 * @author Lenovo
 *
 */
public class FramesUtility 
{
    /**
     * This method is used to switch to the frame and we need to pass the frame id
     * @param driver
     * @param id
     */
	public void switchToFrame(WebDriver driver,String id)
	{
		driver.switchTo().frame(id);

	}
	/**
	 *  This method is used to switch to the frame and we need to pass the index
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
/**
 *  This method is used to switch to the frame and we need to pass the frame address
 * @param driver
 * @param address
 */
	public void switchToFrame(String address,WebDriver driver)
	{
		driver.switchTo().frame(address);

	}
	/**
	 * This method is used to switch back to main page
	 * @param driver
	 */
	public void defaultContent(WebDriver driver)
	{
		driver.switchTo().defaultContent();

	}

}
