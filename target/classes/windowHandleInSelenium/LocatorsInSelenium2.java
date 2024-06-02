import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsInSelenium2 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		Thread.sleep(2000);
		WebElement we=driver.findElement(By.xpath("//label[normalize-space(text())='First Name'] "));
		System.out.println(we.getText());
		driver.findElement(By.xpath("//label[normalize-space(text())='First Name']/following-sibling::input[1]")).sendKeys("Ranjit");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Email']/preceding-sibling::input[1]")).sendKeys("Singh");
		Thread.sleep(2000);
//		Email
		driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type='text']")).sendKeys("eramank1@gmail.com");
//		password
		driver.findElement(By.xpath("(//div[@class='container']/descendant::input[@type='password'])[1]")).sendKeys("Test123");
//		Confirm password
		driver.findElement(By.xpath("(//div[@class='container']/descendant::input[@type='password'])[2]")).sendKeys("Test123");
		Thread.sleep(2000);
//		click on Register
		driver.findElement(By.xpath("//div[@class='buttons']/child::button[text()='Register']")).click();
		Thread.sleep(2000);
		
	}
}
