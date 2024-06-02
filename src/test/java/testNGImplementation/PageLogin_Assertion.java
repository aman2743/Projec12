package testNGImplementation;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLogin_Assertion {
	SoftAssert softAssert;
	
	WebDriver driver;
	@BeforeTest
	public void browserlaunch() {
		System.out.println("Inside Browser Launch");
		WebDriverManager.chromedriver().setup();//environment Setup
	    driver=new ChromeDriver();//Launch chrome browser
		driver.manage().window().maximize();//Maximize the window
	}
	
	@Test(priority = 1)
	public void TestFire() throws InterruptedException {
		softAssert=new SoftAssert();
		System.out.println("inside testfire");
		driver.get("https://demo.testfire.net/login.jsp");
		driver.findElement(By.id("uid")).sendKeys("jsmith");
		driver.findElement(By.id("passw")).sendKeys("demo1234");
		driver.findElement(By.name("btnSubmit")).click();
		Thread.sleep(3000);
	    Boolean b=driver.findElement(By.xpath("//a[@id='LoginLink']")).isDisplayed();
//	    Assert.assertFalse(b);
	    softAssert.assertFalse(b);
	    
	    String expectedText="Hello John Smith";
	    WebElement we=driver.findElement(By.xpath("//h1[contains(text(),'Hello')]"));
	    String actualText=we.getText();
	    
//	    Assert.assertEquals(actualText, expectedText,"Text not shown");
	    softAssert.assertEquals(actualText, expectedText, "Text not shown");
	    softAssert.assertAll();

	}
	
	@Test(priority = 2,enabled = false)
	public void HYRTutorial() throws InterruptedException {
		System.out.println("inside HYR Totorial");
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);
		String pWindid=driver.getWindowHandle();
		driver.findElement(By.id("name")).sendKeys("At main page");
        driver.findElement(By.id("newWindowBtn")).sendKeys(Keys.ENTER);
        Set<String> cWindid=driver.getWindowHandles();
         for(String str:cWindid) {
             String st=str;
             if(!st.equals(pWindid)) {
             driver.switchTo().window(str);
             System.out.println(driver.getCurrentUrl());
             Thread.sleep(3000);
           driver.close();
          }
         }
      driver.switchTo().window(pWindid);
      driver.findElement(By.id("name")).clear();
      driver.findElement(By.id("name")).sendKeys("At main page second Time");      
	}
	
	@Test(priority = 3,enabled = false)
	
	public void WaitTest() {
		System.out.println("inside WaitTest");
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn1")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(11));
		WebElement we=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1")));
		we.sendKeys("This is my custom text using Explict Wait");
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("inside tear down");
		driver.close();
	}

}
