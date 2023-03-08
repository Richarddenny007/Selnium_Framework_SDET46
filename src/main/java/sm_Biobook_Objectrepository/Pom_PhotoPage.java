package sm_Biobook_Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_PhotoPage
{
	 @FindAll({@FindBy(xpath = "//label[.='Photos']")})
	   private WebElement photoButton;
	   


	public Pom_PhotoPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);	
	}



	public void photoButton()
	{
	   photoButton.click();	
	}
}
