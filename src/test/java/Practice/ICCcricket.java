package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Generic_Utilities.Generic_methods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ICCcricket {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/homepage");
		WebElement ranking = driver.findElement(By.xpath("(//button[normalize-space(text())='Rankings'])[1]"));
		
		Generic_methods gen=new Generic_methods();
		gen.initializeAction(driver);
		gen.moveToElement(ranking);
		
		
		
	
		Thread.sleep(2000);
		String rank="Test Team Rankings";
		String team="Australia";
		driver.findElement(By.xpath("(//a[normalize-space(text())='Overview' and @href='/rankings/mens/overview' ])[1]")).click();
      WebElement rating = driver.findElement(By.xpath("//h4[.='"+rank+"']/ancestor::div[@class='rankings-block__container rankings-block__container--teams']"
      		+ "//div[.='"+team+"']"
       + "/following-sibling::div[@class='rankings-block__banner--rating u-text-right']"));
      String text = rating.getText();
      System.out.println(text);
	}

}
