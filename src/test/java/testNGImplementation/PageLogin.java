package testNGImplementation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLogin {
	
	WebDriver driver;
	@BeforeMethod
	public void browserlaunch() {
		System.out.println("Inside Browser Launch");
		WebDriverManager.chromedriver().setup();//environment Setup
	    driver=new ChromeDriver();//Launch chrome browser
		driver.manage().window().maximize();//Maximize the window
	}
	
	@Test
	public void init() throws InterruptedException {
		System.out.println("inside testfire");
		driver.get("https://demo.testfire.net/login.jsp");
		driver.findElement(By.id("uid")).sendKeys("jsmith");
		driver.findElement(By.id("passw")).sendKeys("demo1234");
		driver.findElement(By.name("btnSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Transfer Funds")).click();
		Thread.sleep(2000);

	}
	
	@Test
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
	
	
	@AfterMethod
	
	public void tearDown() {
		System.out.println("inside tear down");
		driver.close();
	}

}
