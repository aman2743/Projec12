package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppLaunch {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("https://demo.testfire.net/login.jsp");
		Thread.sleep(2000);
        WebElement we=driver.findElement(By.xpath("//input[@id='uid']"));
		js.executeScript("arguments[0].value='jsmith'", we);     		
//		js.executeScript("document.getElementById('uid').value='jsmith'");	
		js.executeScript("document.getElementsByName('passw')[0].value='demo1234'");
		WebElement btn = driver.findElement(By.name("btnSubmit"));
        js.executeScript("arguments[0].click()", btn);
	}
}
