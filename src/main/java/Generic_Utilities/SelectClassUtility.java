package Generic_Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClassUtility
{
	
	/**
	 * This method is used to initialize the select class and we need to pass the address of the dropdown
	 * @param ele
	 */
	/**
	 * This method is used select the option in dropdown by value and we need to pass the value of the element 
	 * @param value
	 */
	public void selectByValue(WebElement dropdown ,String value)
	{
		Select sel=new Select(dropdown);
		sel.selectByValue(value);
	}
	/**
	 * This method is used select the option in dropdown by visible text and we need to pass the visible textof the element
	 * @param text
	 */
	public void selectByvisibletext(WebElement dropdown ,String text)
	{
		Select sel=new Select(dropdown);
		sel.selectByVisibleText(text);
	}
	/**
	 * This method is used select the option in dropdown by giving idex value and we need to pass the index value of the element
	 * @param index
	 */
	
	public void selectByIndex(WebElement dropdown,int index)
	{
		Select sel=new Select(dropdown);
		sel.selectByIndex(index);
	}
	/**
	 * This method is used deselect the option in dropdown by using value and we need to pass the value of the element
	 * @param value
	 */
	public void deselectByValue(WebElement dropdown,String value)
	{
		Select sel=new Select(dropdown);
		sel.deselectByValue(value);
	}
	/**
	 * This method is used deselect the option in dropdown by visible text and we need to pass the visible textof the element
	 * @param text
	 */
	public void deselectByvisibletext(WebElement dropdown,String text)
	{
		Select sel=new Select(dropdown);
		sel.deselectByVisibleText(text);
	}
	/**
	 * This method is used deselect the option in dropdown by giving idex value and we need to pass the index value of the element
	 * @param index
	 */
	public void deselecByIndex(WebElement dropdown,int index )
	{
		Select sel=new Select(dropdown);
		sel.deselectByIndex(index);
	}
	/**
	 * This method is used deselect the all the option in dropdown  
	 */
	public void deselectAll(WebElement dropdown)
	{
		Select sel=new Select(dropdown);
		sel.deselectAll();
	}
	/**
	 * This method is used to fecth the address of all the elements presents in the dropdown 
	 */
	public void getOptions(WebElement dropdown)
	{
		Select sel=new Select(dropdown);
		sel.getOptions();
	}
	/**
	 * This method is used verify  wheter the the dropdown is multiselect dropdown
	 */
	public void isMultiple(WebElement dropdown)
	{
		Select sel=new Select(dropdown);
		sel.isMultiple();
	}

}
