package framesInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class BasicFrames {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("staying at main Page");
		Thread.sleep(2000);
		WebElement frame1=driver.findElement(By.id("frm2"));
		driver.switchTo().frame(frame1);
		Thread.sleep(1000);
		driver.findElement(By.id("firstName")).sendKeys("First name input");
		driver.findElement(By.id("lastName")).sendKeys("Last name input");
		Thread.sleep(1000);
//		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("staying at main Page after child");
		Thread.sleep(2000);
		driver.quit();
	}

}
