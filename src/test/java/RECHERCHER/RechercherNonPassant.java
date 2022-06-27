package RECHERCHER;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class RechercherNonPassant {
	private WebDriver driver;
	
  @Test
  public void HomePage() {
	    driver.get("https://www.fnacdarty.com/");
		WebElement Cookie =  driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
		String Val = Cookie.getText();
		System.out.println(Val);
		Cookie.click();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Fnac Darty";
		Assert.assertEquals(ExpectedTitle, ActualTitle);		
  }
  
  @Test
  public void SearchNoPassed() {  	
	WebElement Search  =  driver.findElement(By.xpath("//*[@id=\"content-body\"]/header/div/div[2]/div[2]/div[1]/div[1]/form/input"));
	Search.sendKeys("TOTO");
	WebElement Validate  =  driver.findElement(By.xpath("//*[@id=\"content-body\"]/header/div/div[2]/div[2]/div[1]/div[1]/form/button"));
	Validate.click();
	
	WebElement Result = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/header/div/h1"));
	
	String ActualResult = Result.getText();
	System.out.println(ActualResult);
	//String ExpectedResult = "0 résultat";
	//Assert.assertEquals(ExpectedResult, ActualResult);
	
  } 
  
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DOS REIS\\eclipse-workspace\\FNAC-DARTY\\src\\test\\resources\\drivers\\chromedriver.exe"); 
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	 // driver.quit();
  }

}
