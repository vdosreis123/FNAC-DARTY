package RECHERCHER;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class RechercherNonPassant {
	private WebDriver driver;
	
  @Test
  public void f() {
	  driver.get("https://www.fnacdarty.com/");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DOS REIS\\eclipse-workspace\\FNAC-DARTY\\src\\test\\resources\\drivers\\chromedriver.exe"); 
	  driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
