import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsInSelenium {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.testfire.net/login.jsp");
		Thread.sleep(2000);
//		WebElement username=driver.findElement(By.id("uid"));
//		WebElement username=driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[1]/td[2]/input"));
		WebElement username=driver.findElement(By.xpath("//input[@id='uid']"));
		username.sendKeys("jsmith");
		driver.findElement(By.id("passw")).sendKeys("demo1234");
		driver.findElement(By.name("btnSubmit")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
//		driver.findElement(By.linkText("Get your copy from GitHub")).click();
		driver.findElement(By.partialLinkText("GitHub")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		String str=driver.findElement(By.className("sidebar")).getTagName();
		System.out.println(str);
		String str1=driver.findElement(By.tagName("h1")).getText();
		System.out.println("Tag name:"+str1);		
//		Click on Personal Link
		driver.findElement(By.xpath("//a[text()='PERSONAL']")).click();
		Thread.sleep(2000);
//		click on Investment and Insurance Options
		driver.findElement(By.xpath("//a[contains(text(),'Investments & Insurance')]")).click();
		                             
//      Click on Investors relations
		driver.findElement(By.xpath("//a[starts-with(text(),'Investor')]")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}
}
