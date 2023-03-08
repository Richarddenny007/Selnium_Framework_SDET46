package sm_Biobook_Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Signin

{
	
    @FindBy(xpath =  " //button[.='Sign in']")
	private WebElement signin;
	
	public Pom_Signin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);		
	}	
	public void login()
	{
		signin.click();
	}
	
}
