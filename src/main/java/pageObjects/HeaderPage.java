package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPage extends BasePage{
	
	private By myAccountLink=By.xpath("//span[contains(text(),'My Account')]");
	private By loginlink= By.linkText("Login");
	private By register=By.linkText("Register");
	private By desktops=By.linkText("Desktops");
	private By allDesktops=By.xpath("//a[contains(text(),'Show All Desktops')]");
	private By checkout=By.xpath("//span[contains(text(),'Checkout')]");
	private By logoutLink=By.linkText("Logout");
	
	public HeaderPage(WebDriver driver) {		
		super(driver);
	}

	
	public LoginPage GotoLoginPage() {
		//Add comment
		 click(myAccountLink);
		 click(loginlink);
		 LoginPage lp = new LoginPage(driver);
		 return lp;
	}
	
	public void logout() {
		click(myAccountLink);
		click(logoutLink);
	}
	
	public RegisterPage getRegister() {
		driver.findElement(register).click();
		RegisterPage rp= new RegisterPage(driver);
		return rp;
	}
	
	public WebElement getNavDesktop() {
		return driver.findElement(desktops);
	}
	
	public ProductPage getAllDesktops(WebDriver driver) {
		driver.findElement(allDesktops).click();
		ProductPage pp=new ProductPage(driver);
		return pp;
	}
	public WebElement getCheckout() {
		 return driver.findElement(checkout);
		
		
		
	}
}

