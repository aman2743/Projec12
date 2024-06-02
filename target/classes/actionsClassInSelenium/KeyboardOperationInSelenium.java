package actionsClassInSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardOperationInSelenium {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		driver.get("https://the-internet.herokuapp.com/key_presses?");
		Thread.sleep(1000);
//		actions.sendKeys(Keys.ENTER).build().perform();
//		WebElement we=driver.findElement(By.id("target"));
//		actions.sendKeys(we,Keys.ENTER).build().perform();
//		Thread.sleep(1000);

//		actions.sendKeys(Keys.ESCAPE).build().perform();
		actions.sendKeys(Keys.SPACE).build().perform();
		

	}

}
