package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	
	public LoginPage(WebDriver rDriver) {
		driver=rDriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="uid")
	WebElement uname;
	
	@FindBy(id="passw")
	WebElement pwd;
	
	@FindBy(name="btnSubmit")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[@id='LoginLink']")
	WebElement SignOff;
	
	@FindBy(linkText="Transfer Funds")
	WebElement trnsFund;
	
	public void enterUsername(String username) {
		uname.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		pwd.sendKeys(password);
	}
	
	public void btnClick() {
		loginBtn.click();
	}
	
	public boolean isVisible() {
		return SignOff.isDisplayed();
	}

//	public TransferFund transferFund() {
//		 trnsFund.click();
//		return new TransferFund(driver);
//	}
	
	public void userLogin(String userName, String passWord) {
		uname.sendKeys(userName);
		pwd.sendKeys(passWord);
		loginBtn.click();
	}
	
  }

