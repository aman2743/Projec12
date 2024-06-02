package dataProviderInSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLogin_DataProvider2 {
	SoftAssert softAssert;
	WebDriver driver;

	@Test(dataProvider = "dp02")
	public void TestFire(String str1,String str2) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		softAssert = new SoftAssert();
		System.out.println("inside testfire");
		driver.get("https://demo.testfire.net/login.jsp");
		driver.findElement(By.id("uid")).sendKeys(str1);
		driver.findElement(By.id("passw")).sendKeys(str2);
		driver.findElement(By.name("btnSubmit")).click();
		Thread.sleep(3000);
		Boolean b = driver.findElement(By.xpath("//a[@id='LoginLink']")).isDisplayed();
//	    Assert.assertFalse(b);
		softAssert.assertTrue(b);

		String expectedText = "Hello John Smith";
		WebElement we = driver.findElement(By.xpath("//h1[contains(text(),'Hello')]"));
		String actualText = we.getText();

//	    Assert.assertEquals(actualText, expectedText,"Text not shown");
		softAssert.assertEquals(actualText, expectedText, "Text not shown");
		softAssert.assertAll();
		driver.close();
	}
	
	@DataProvider(name="dp02",parallel = true)
	public Object[][] dataSupplier() {
		Object[][] obj = new Object[][] { 
			{"jsmith","demo1234"},
			{"jsmith","demo1234"}, 
			{"jsmith","demo1234"},
			{"jsmith","demo1234"} 
			};
        return obj;

	}

	
	

}
