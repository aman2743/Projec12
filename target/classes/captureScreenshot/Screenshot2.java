package captureScreenshot;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(3000);
		File destFile = new File(".\\Screenshot\\QA1.png");
		String base64 = ts.getScreenshotAs(OutputType.BASE64);
		byte[] arrbyte = Base64.getDecoder().decode(base64);
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
