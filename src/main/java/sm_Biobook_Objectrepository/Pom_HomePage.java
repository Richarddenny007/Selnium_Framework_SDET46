package sm_Biobook_Objectrepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_HomePage

{
   @FindAll({@FindBy(xpath = "//label[.='Home']")})
	private WebElement homeButton;
	
   @FindAll({@FindBy(xpath = "(//input[@name='post_comment'])[5]")})
    private WebElement comment;
    
   @FindAll({@FindBy(xpath = "(//input[@name='post_comment'])[5]")})
   private WebElement comtEnter;
   
   @FindAll({@FindBy(xpath = "//button[.='Log out']")})
   private WebElement logout;
   
   @FindAll({@FindBy(xpath = "//button[.='Sign in']")})
   private WebElement login;
   
   @FindAll({@FindBy(xpath = "//input[@name='image']")})
   private WebElement browseButton;

   @FindAll({@FindBy(name = "content")})
   private WebElement updateStatusTextfield;
   
   @FindAll({@FindBy(xpath = "//button[.='Share']")})
   private WebElement shareButton;
   
public Pom_HomePage(WebDriver driver)
{
	
	PageFactory.initElements(driver, this);	
}


public void HomeButton()
{
  homeButton.click();	
}
public void comment(String value)
{
   comment.sendKeys(value);	
}
public void comtEnter()
{
   comtEnter.click();		
}
public void logout()
{
 logout.click();	
}
public void login()
{
  login.click();	
}
public void uploadPhoto(String photoPath)
{
	browseButton.sendKeys(photoPath);
}
public void updateStatus(String status)
{
	updateStatusTextfield.sendKeys(status);
}
public void share()
{
	shareButton.click();
}


}