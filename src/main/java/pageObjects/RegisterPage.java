package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {

	public WebDriver driver;
	
	private By firstName= By.cssSelector("#input-firstname");
	private By lastName=By.cssSelector("#input-lastname");
	private By email= By.cssSelector("#input-email");
	private By tele=By.cssSelector("#input-telephone");
	private By password=By.cssSelector("#input-password");
	private By confirmPassword=By.cssSelector("#input-confirm");
	private By privacyCheck=By.xpath("//input[@type='checkbox']");
	private By btnContinue=By.xpath("//input[@value='Continue']");
	private By txtConfirmation= By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
	private By txtCongrts=By.xpath("//p[contains(text(),'Congratulations! Your new account has been success')]");
	private By txtFNameValidation=By.xpath("//div[contains(text(),'First Name must be between 1 and 32 characters!')]");
	private By txtLnameValidation=By.xpath("//div[contains(text(),'Last Name must be between 1 and 32 characters!')]");
	private By txtEmailValidation=By.xpath("//div[contains(text(),'E-Mail Address does not appear to be valid!')]");
	private By txtTeleValidation=By.xpath("//div[contains(text(),'Telephone must be between 3 and 32 characters!')]");
	private By txtPassValidation=By.xpath("//div[contains(text(),'Password must be between 4 and 20 characters!')]");
	private By txtPassMismatch=By.xpath("//div[contains(text(),'Password confirmation does not match password!')]");
	
	
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement txtboxFirstName() {
		return driver.findElement(firstName);
	}
	
	public WebElement txtboxLastName() {
		return driver.findElement(lastName);
	}
	
	public WebElement txtboxEmail() {
		return driver.findElement(email);
	}
	
	public WebElement txtboxTele() {
		return driver.findElement(tele);
	}

	public WebElement txtboxPassword() {
		return driver.findElement(password);
	}
	
	public WebElement txtboxConfirmPswd() {
		return driver.findElement(confirmPassword);
	}
	
	public WebElement chkboxPrivacy() {
		return driver.findElement(privacyCheck);
	}
	
	public WebElement btnContinue() {
		return driver.findElement(btnContinue);
	}
	
	public WebElement txtConfirmation() {
		return driver.findElement(txtConfirmation);
	}
	
	public WebElement txtCongrats() {
		return driver.findElement(txtCongrts);
	}
	
	public WebElement txtFNameValidation() {
		return driver.findElement(txtFNameValidation);
	}
	
	public WebElement txtLNameValidation() {
		return driver.findElement(txtLnameValidation);
	}
	public WebElement txtEmailValidation() {
		return driver.findElement(txtEmailValidation);
	}
	public WebElement txtTeleValidation() {
		return driver.findElement(txtTeleValidation);
	}
	public WebElement txtPaswdValidation() {
		return driver.findElement(txtPassValidation);
	}
	public WebElement txtMisMatchValidation() {
		return driver.findElement(txtPassMismatch);
	}
}
