package actionsClassInSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsUseInAnApplication {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		driver.get("https://text-compare.com/");
		Thread.sleep(10000);
		WebElement input=driver.findElement(By.id("inputText1"));
		WebElement output=driver.findElement(By.id("inputText2"));
//		Text inside input field
		input.sendKeys("This is my custom Text"+"\n"+"I have to copy and paste this text");
//		actions.keyDown(Keys.CONTROL);
//		actions.sendKeys("a");
//		actions.keyUp(Keys.CONTROL);
//		actions.build().perform();

		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		actions.sendKeys(Keys.TAB).build().perform();
		
		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		String expectedText=input.getText();
		String actualText=output.getText();
		
		if(expectedText.equals(actualText)) {
			System.out.println("Test case is pass");
		}
		else {
			System.out.println("Test case is failed");
		}
		

	}

}
