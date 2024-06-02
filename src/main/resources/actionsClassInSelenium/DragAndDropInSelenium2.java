package actionsClassInSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropInSelenium2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(1000);
		WebElement frameElement=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frameElement);
		Thread.sleep(1000);
		WebElement sourceObject=driver.findElement(By.id("draggable"));
		WebElement targetObject=driver.findElement(By.id("droppable"));
		
//		actions.dragAndDrop(sourceObject, targetObject).build().perform();
		actions.clickAndHold(sourceObject).moveToElement(targetObject).release().build().perform();
		Thread.sleep(1000);
	
	}
}
