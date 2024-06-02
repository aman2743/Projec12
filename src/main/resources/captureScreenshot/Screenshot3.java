package captureScreenshot;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(3000);
		File destFile = new File("C:\\Users\\Aman\\eclipse-workspace2\\Projec12\\Screenshot\\QA2.png");
		byte[] arrbyte = ts.getScreenshotAs(OutputType.BYTES);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(destFile);
			fos.write(arrbyte);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
	   }
		driver.quit();
	}

}
