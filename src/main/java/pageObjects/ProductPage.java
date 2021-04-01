package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

	public WebDriver driver;
	private By txtPageHeader=By.xpath("//div[@id='content']/h2");
	private By leftNavMac=By.xpath("//a[contains(text(),'- Mac')]");
	private By addtocart=By.xpath("//span[contains(text(),'Add to Cart')]");
	private By txtsuccess= By.xpath("//div[@class='alert alert-success alert-dismissible']");
	
	public ProductPage(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public WebElement txtPageHeader() {
		return driver.findElement(txtPageHeader);
	}
	public WebElement leftNavMac() {
		return driver.findElement(leftNavMac);
	}
	
	public WebElement getAddtoCArt() {
		return driver.findElement(addtocart);
	}
	public WebElement getSuccessMgs() {
		return driver.findElement(txtsuccess);
	}

}
