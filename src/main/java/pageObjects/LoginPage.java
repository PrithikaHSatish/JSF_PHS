package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
//	public WebDriver driver;

//	Locators for Login page
	private By UserNameField=By.cssSelector("#input-email12345");
	private By passwordField=By.cssSelector("#input-password-now");
	private By loginButton=By.xpath("//input[@value='Login']");

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void enterUsername(String username) {
		type(username, UserNameField);
	}
	
	public void enterPassword(String password) {
		type(password, passwordField);
	}

	public void clickLogin() {
		click(loginButton);
	}
	
	
//	public WebElement getEmailAddress() {
//		return driver.findElement(emailaddress);
//	}
//	public WebElement getPassword() {
//		return driver.findElement(password);
//	}
//	public WebElement getLogin() {
//		return driver.findElement(btnlogin);
//	}

}
