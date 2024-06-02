package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TransferFund {
 WebDriver driver;
 public TransferFund(WebDriver rDriver) {
	 driver=rDriver;
	 PageFactory.initElements(driver,this);
 }
 
 
 
 
 
	
	
}
