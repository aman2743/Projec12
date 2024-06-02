package windowHandleInSelenium;

import java.util.Set;

import org.bouncycastle.util.Arrays.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);
		String pWindid=driver.getWindowHandle();
		driver.findElement(By.id("name")).sendKeys("At main page");
        driver.findElement(By.id("newWindowBtn")).sendKeys(Keys.ENTER);
        Set<String> cWindid=driver.getWindowHandles();
         for(String str:cWindid) {
             String st=str;
             if(!st.equals(pWindid)) {
             driver.switchTo().window(str);
             System.out.println(driver.getCurrentUrl());
             Thread.sleep(3000);
           driver.close();
          }
         }
      driver.switchTo().window(pWindid);
      driver.findElement(By.id("name")).clear();
      driver.findElement(By.id("name")).sendKeys("At main page second Time");      
	}

}
