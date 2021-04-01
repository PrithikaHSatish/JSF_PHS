package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
	
	WebDriver driver;
	
//	TextBoxes
	private By txtboxBillingFName=By.xpath("//input[@id='input-payment-firstname']");
	private By txtboxBillingLName=By.xpath("//input[@id='input-payment-lastname']");
	private By txtboxBillingCompany=By.xpath("//input[@id='input-payment-company']");
	private By txtboxBillingAdd1=By.xpath("//input[@id='input-payment-address-1']");
	private By txtboxBillingAdd2=By.cssSelector("#input-payment-address-2");
	private By txtboxBillingCity=By.cssSelector("#input-payment-city");
	private By txtboxBillingPostCode=By.cssSelector("#input-payment-postcode");

//	Dropdowns
	private By drpdwnBillingCountry=By.cssSelector("#input-payment-country");
	private By drpdwnRegion=By.cssSelector("#input-payment-zone");
	
//	Buttons
	private By btnContinue=By.cssSelector("#button-payment-address");
	private By btnShippingAddress=By.cssSelector("#button-shipping-address");
	private By btnShippingMethod=By.cssSelector("#button-shipping-method");
	private By btnPaymentMethod=By.cssSelector("#button-payment-method");
	private By btnConfirm=By.cssSelector("#button-confirm");
	
//	Radio buttons
	private By radioShippingAddressExisting=By.xpath("//input[@value='existing']");
	private By radioShippingAddressNew=By.xpath("//input[@value='new']");
	
//	Checkboxes
	private By chkTerms= By.xpath("//input[@name='agree']");
	
	
	public CheckoutPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public WebElement txtboxFName() {
		return driver.findElement(txtboxBillingFName);
	}
	
	public WebElement txtboxLName() {
		return driver.findElement(txtboxBillingLName);
	}
	
	public WebElement txtboxCompany() {
		return driver.findElement(txtboxBillingCompany);
	}
	
	public WebElement txtboxAddress1() {
		return driver.findElement(txtboxBillingAdd1);
	}
	
	public WebElement txtboxAddress2() {
		return driver.findElement(txtboxBillingAdd2);
	}
	
	public WebElement txtboxCity() {
		return driver.findElement(txtboxBillingCity);
	}
	
	public WebElement txtboxPostcode() {
		return driver.findElement(txtboxBillingPostCode);
	}
	
	public WebElement drpdwnCountry() {
		return driver.findElement(drpdwnBillingCountry);
	}
	
	public WebElement drpdownRegion() {
		return driver.findElement(drpdwnRegion);
	}
	
	public WebElement btnContinue() {
		return driver.findElement(btnContinue);
	}
	
	public WebElement radioShippingAddressExisting() {
		return driver.findElement(radioShippingAddressExisting);
	}
	
	public WebElement radioShippingAddressNew() {
		return driver.findElement(radioShippingAddressNew);
	}
	
	public WebElement btnShippingAddress() {
		return driver.findElement(btnShippingAddress);
	}
	
	public WebElement btnShippingMethod() {
		return driver.findElement(btnShippingMethod);
	}
	
	public WebElement btnPaymentMethod() {
		return driver.findElement(btnPaymentMethod);
	}
	
	public WebElement chkTerms() {
		return driver.findElement(chkTerms);
	}
	
	public WebElement btnConfirmCheckout() {
		return driver.findElement(btnConfirm);
	}
	
}
