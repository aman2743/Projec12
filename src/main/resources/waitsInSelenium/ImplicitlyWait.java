package waitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWait {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
	driver.findElement(By.id("btn1")).click();
	WebElement textbox1=driver.findElement(By.id("txt1"));
	textbox1.sendKeys("This is my custom text");
	driver.findElement(By.id("btn2")).click();
	WebElement textbox2=driver.findElement(By.id("txt2"));
	textbox2.sendKeys("This is my custom text inside text2");
}
}
