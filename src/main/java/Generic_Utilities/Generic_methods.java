package Generic_Utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 This class will contain reusable methods  
 * @author Lenovo
 *
 */
public class Generic_methods 
{

	
	//ACTIONS CLASS
	
	private Actions act;
	/**
	 * This method will initialize the action class and it will recieve the browser address in driver variable
	 * @param driver
	 */
	public  void initializeAction(WebDriver driver)
	{
		act =new Actions(driver);
	}
	/**
	 *This method is used to perform mouse over action and we need to pass addressof the element 
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

	//SELECT CLASS
	Select sel;
	/**
	 * This method is used to initialize the select class and we need to pass the address of the dropdown
	 * @param ele
	 */
	public void initializeSelect(WebElement ele)
	{
		sel=new Select(ele);
	}
	/**
	 * This method is used select the option in dropdown by value and we need to pass the value of the element 
	 * @param value
	 */
	public void selectByValue(String value)
	{
		sel.selectByValue(value);
	}
	/**
	 * This method is used select the option in dropdown by visible text and we need to pass the visible textof the element
	 * @param text
	 */
	public void selectByvisibletext(String text)
	{
		sel.selectByVisibleText(text);
	}
	/**
	 * This method is used select the option in dropdown by giving idex value and we need to pass the index value of the element
	 * @param index
	 */
	
	public void selectByIndex(int index)
	{
		sel.selectByIndex(index);
	}
	/**
	 * This method is used deselect the option in dropdown by using value and we need to pass the value of the element
	 * @param value
	 */
	public void deselectByValue(String value)
	{
		sel.deselectByValue(value);
	}
	/**
	 * This method is used deselect the option in dropdown by visible text and we need to pass the visible textof the element
	 * @param text
	 */
	public void deselectByvisibletext(String text)
	{
		sel.deselectByVisibleText(text);
	}
	/**
	 * This method is used deselect the option in dropdown by giving idex value and we need to pass the index value of the element
	 * @param index
	 */
	public void deselecByIndex(int index )
	{
		sel.deselectByIndex(index);
	}
	/**
	 * This method is used deselect the all the option in dropdown  
	 */
	public void deselectAll()
	{
		sel.deselectAll();
	}
	public void getOptions()
	{
		sel.getOptions();
	}
	public void isMultiple()
	{
		sel.isMultiple();
	}

	//EXPLICIT WAIT
	WebDriverWait wait;
	public void explicitWaitclick(WebDriver driver,WebElement ele)
	{
		wait =new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(ele)).click();
	}
	public void explicitWaitsendValue(WebElement ele,String value)
	{
		wait.until(ExpectedConditions.visibilityOf(ele)).sendKeys(value);
	}

	//IMPLICITWAIT
	public void implicitWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	//JAVASCRIPTEXCECUTOR
	JavascriptExecutor js;
	public void initializeJsExecutor(WebDriver driver)
	{
		js=(JavascriptExecutor)driver;
	}
	public void scrollDown()
	{
		js.executeScript("window.scrollBy(0,500)");
	}
	public void scrollIntoView(WebElement ele)
	{
		js.executeScript("arguments[0].scrollIntoView();",ele);

	}
	public void disableElementSendValue(WebElement ele,String value)
	{
		js.executeScript("arguments[0].value='"+ele+"'",ele);
	}
	public void disableElementClick(WebElement ele)
	{
		js.executeScript("arguments[0].click();",ele);
	}

	public void disableElementClear(WebElement ele)
	{
		js.executeScript("arguments[0].clear();",ele);
	}
	public void scrollUp()

	{
		js.executeScript("window.scrollBy(0,-500)");
	}

	public void getElementByIdClear(String id)

	{
		js.executeScript("document.getElementById('"+id+"').value=''");
	}
	public void getElementByIdSend(String id,String value)

	{
		js.executeScript("document.getElementById('"+id+"').value='"+value+"'");
	}

	//WINDOW MAXIMIZE
	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}

	//Excel
	
	//Frames
	public void switchToFrameId(WebDriver driver,String id)
	{
		driver.switchTo().frame(id);

	}
	public void switchToFrameIndex(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	public void switchToFrameAddress(WebDriver driver,String address)
	{
		driver.switchTo().frame(address);

	}
	public void defaultContent(WebDriver driver)
	{
		driver.switchTo().defaultContent();

	}

	//POPUP
	public void alertAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void alertDissmiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	public String alertGetText(WebDriver driver) 
	{
		String text = driver.switchTo().alert().getText();

		return text;
	}

	//childbrowser
	public void getParentBrowserId(WebDriver driver,String parentid)
	{
		driver.getWindowHandle();
		driver.switchTo().window(parentid);

	}
	public void getParentAndChildBrowserId(WebDriver driver,String id)
	{
		driver.getWindowHandles();
		driver.switchTo().window(id);

	}

	//ROBOTCLASS
	public void robotClass()
	{
		Robot rbt;
		try {
			rbt=new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

    //MINIMIZEWINDOW
	public void minimizeWindow() 
	{   
		Robot rbt = null;
		try {
			 rbt=new Robot();
		} catch (AWTException e) {
		
			e.printStackTrace();
		}
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_SPACE);
		rbt.keyPress(KeyEvent.VK_N);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		rbt.keyRelease(KeyEvent.VK_SPACE);
		rbt.keyRelease(KeyEvent.VK_N);
	}
    
	
	//CLOSE THE BROWSER
	public void close(WebDriver driver)
	{
		driver.close();
	}

	//QUIT THE BROWSER
   public void quit(WebDriver driver)
   {
	   driver.quit();
   }
}
