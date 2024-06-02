package handlingDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(2000);
		WebElement we=driver.findElement(By.id("course"));
		Select sl=new Select(we);
	    List<WebElement> lst=sl.getOptions();
	    for(WebElement we1:lst) {
	    	String str=we1.getText();
	    	System.out.println(str);
	    	sl.selectByVisibleText(str);
	    	Thread.sleep(2000);
	    }

	}

}
