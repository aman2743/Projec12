package testClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageClass.LoginPage;

public class LoginTest {
	public WebDriver driver;
	public static LoginPage loginPage;

   @BeforeTest
	   public void BrowserInit() {
	   WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		loginPage=new LoginPage(driver);  
   }
	
	@Test (priority = 1)
	public void LauchApp() {
		driver.get("https://demo.testfire.net/login.jsp"); 
	}
	
	@Test(priority = 2)
	public void LoginTest() {
		loginPage=new LoginPage(driver);
		loginPage.enterUsername("jsmith");
		loginPage.enterPassword("demo1234");
		loginPage.btnClick();
//		loginPage.userLogin("jsmith", "demo1234");
	    boolean b=loginPage.isVisible();
	    Assert.assertTrue(b);
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}	
}
