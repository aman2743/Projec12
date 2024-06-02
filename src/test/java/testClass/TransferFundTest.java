package testClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TransferFundTest extends LoginTest {
	
  @Test
  public void PageInit() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.testfire.net/login.jsp");
	  loginPage.enterUsername("jsmith");
	  loginPage.enterPassword("demo1234");
	  loginPage.btnClick();

  }
	
  
  
}
