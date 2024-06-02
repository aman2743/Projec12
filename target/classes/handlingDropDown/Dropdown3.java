package handlingDropDown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();{
			
		}
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(1000);
		WebElement we=driver.findElement(By.id("ide"));
		Select sl=new Select(we);
		List<WebElement>lst=sl.getOptions();
		Iterator<WebElement> itr=lst.iterator();
	    while(itr.hasNext()) {
             WebElement we1= itr.next();
             System.out.println(we1);
             String str=we1.getText();
             sl.selectByVisibleText(str);
	     
	    }
	}
}
