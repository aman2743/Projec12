package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingInSelenium {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(2000);
//		js.executeScript("window.scroll(0,document.body.scrollHeight)");
//		js.executeScript("window.scroll(0,1000)");
//		driver.findElement(By.xpath("//i[@class='fa fa-hand-o-up']")).click();
		WebElement we=driver.findElement(By.xpath("//a[text()='Yada Giri Reddy ']"));
//	    WebElement we1=(WebElement) js.executeScript("document.getElementsByTagName('a')[0].scrollIntoView()");
//	    we1.click();
		js.executeScript("arguments[0].scrollIntoView()", we);
		we.click();
	   
		
		
		
 }
	
}
