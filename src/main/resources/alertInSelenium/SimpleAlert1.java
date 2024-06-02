package alertInSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleAlert1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		Alert al=driver.switchTo().alert();
		Thread.sleep(3000);
        al.accept();
        String expectedText="You selected alert popup"; 	
        WebElement we=driver.findElement(By.id("output"));
        String actualText=we.getText();
        System.out.println(actualText);
       if(actualText.equalsIgnoreCase(expectedText)) 
    	   System.out.println("Test case is pass");
       else
    	   System.out.println("Test case is failed");
	}

}
