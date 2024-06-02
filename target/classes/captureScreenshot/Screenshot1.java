package captureScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot)driver;
		driver.get("https://google.co.in");
        Thread.sleep(2000);
//        File destFile=new File("C:\\Users\\Aman\\eclipse-workspace2\\Projec12\\Screenshot\\test.png");
        File destFile=new File(".\\Screenshot\\test.png");
        File sourceFile=ts.getScreenshotAs(OutputType.FILE);
        try {
			FileUtils.copyFile(sourceFile,destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
        driver.quit();
	}

}
