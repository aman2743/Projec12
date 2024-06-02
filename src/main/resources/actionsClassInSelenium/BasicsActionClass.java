package actionsClassInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicsActionClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		driver.get("https://demo.testfire.net/login.jsp");
        driver.findElement(By.id("uid")).sendKeys("jsmith");
	    driver.findElement(By.id("passw")).sendKeys("demo1234");
	    WebElement btn=driver.findElement(By.name("btnSubmit"));
        actions.click(btn).build().perform();
        Thread.sleep(1000);
	}

}
