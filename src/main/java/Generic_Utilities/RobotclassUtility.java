package Generic_Utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
/**
 * This class is contains keyboard action 
 * @author Lenovo
 *
 */
public class RobotclassUtility 
{
	Robot rbt;
	public RobotclassUtility()
	{
		
		try {
			rbt=new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to mininmize the window
	 */
	public void minimizeWindow() 
	{   
		
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_SPACE);
		rbt.keyPress(KeyEvent.VK_N);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		rbt.keyRelease(KeyEvent.VK_SPACE);
		rbt.keyRelease(KeyEvent.VK_N);
	}
	/**
	 * This method is used to go down and click on enter
	 */
	public void downEnter()
	{
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
	}
    
	
}
