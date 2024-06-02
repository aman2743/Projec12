package actionsClassInSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementInSelenium {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		driver.get("https://www.flipkart.com/");
		WebElement fashion=driver.findElement(By.xpath("//span[text()='Fashion']"));
		actions.moveToElement(fashion).build().perform();
		Thread.sleep(1000);
        WebElement menFootwear=driver.findElement(By.xpath("//div[@class='_16rZTH']/descendant::a[text()='Men Footwear']"));
        actions.moveToElement(menFootwear).build().perform();
        Thread.sleep(1000);
        WebElement mensSportShoes=driver.findElement(By.linkText("Men's Sports Shoes"));
        actions.moveToElement(mensSportShoes).click(mensSportShoes).build().perform();
        Thread.sleep(2000);
	}

}
