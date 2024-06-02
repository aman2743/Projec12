package actionsClassInSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClickInSelenium {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(1000);
		WebElement we=driver.findElement(By.xpath("//span[text()='right click me']"));
		actions.contextClick(we).build().perform();
		Thread.sleep(1000);
		WebElement copyElement=driver.findElement(By.xpath("//span[text()='Copy']"));
		actions.click(copyElement).build().perform();
	    Alert al=driver.switchTo().alert();
	    String str=al.getText();
	    if(str.equalsIgnoreCase("clicked: copy")) {
	    	System.out.println("Test Case is Pass");
	    }
	    else {
	    	System.out.println("Test case is failed");
	    }
		
	}

}
