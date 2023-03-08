package sm_Biobook_Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_ProfilePage 
{

	@FindAll({@FindBy(xpath = "//label[.='Profile']")})
    private WebElement profileButton;
	
	@FindAll({@FindBy(xpath = "//button[.='Edit Profile']")})
    private WebElement editProfileButton;
    
   @FindAll({@FindBy(name = "username")})
   private WebElement userNameTextfield;
   
   @FindAll({@FindBy(name = "number")})
   private WebElement numberTextfield;
   
   @FindAll({@FindBy(xpath = "//select[@name='gender']")})   
   private WebElement gender;
   
   @FindAll({@FindBy(xpath = "//button[text()='Save']")})
   private WebElement profileSaveButton;


public Pom_ProfilePage(WebDriver driver)
{
	
	PageFactory.initElements(driver, this);	
}



public void  editProfileClick()
{
	editProfileButton.click();	
}
public void userNameClear()
{
	userNameTextfield.clear();
}
public void userNameSend(String un)
{
	userNameTextfield.sendKeys(un);
}
public void numberClear()
{
	numberTextfield.clear();
}
public void numberSend(String num)
{
	numberTextfield.sendKeys(num);
}
public void genderClick()
{
  gender.click();	
}
public void profileSave()
{
  profileSaveButton.click();	
}

public void profileButton()
{
 profileButton.click();	
}
}
