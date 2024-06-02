package waitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWaitWait {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
	driver.findElement(By.id("btn1")).click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(11));
	WebElement we=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1")));
	we.sendKeys("This is my custom text using Explict Wait");
//	textbox1.sendKeys("This is my custom text");	
//	driver.findElement(By.id("btn2")).click();
//	WebElement textbox2=driver.findElement(By.id("txt2"));
//	textbox2.sendKeys("This is my custom text inside text2");
	
	
	
}
}
