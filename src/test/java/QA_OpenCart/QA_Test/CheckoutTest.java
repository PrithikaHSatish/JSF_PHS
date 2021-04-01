//package QA_OpenCart.QA_Test;
//
//import static org.testng.Assert.assertEquals;
//
//import java.io.IOException;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import pageObjects.CheckoutPage;
//import pageObjects.HeaderPage;
//import pageObjects.ProductPage;
//import resources.base;
//
//public class CheckoutTest extends base{
//	public WebDriver driver;
//	private static Logger log=LogManager.getLogger(AddToCartTest.class.getName());
//	
//	@BeforeTest
//	public void setup() throws IOException {
//		driver= initializeDriver();
//		log.info("Driver Initialised");
//		driver.get(prop.getProperty("url"));
//
//	}
//	
//	@AfterTest
//	public void tearDown(){
//		driver.close();
//	}
//	
//	@Test
//	public void checkout() throws InterruptedException {
//		LoginToCart();
//		HeaderPage hp=new HeaderPage(driver);
//		hp.getNavDesktop().click();
//		ProductPage objProdPage = hp.getAllDesktops(driver);
//		String pageHeader= objProdPage.txtPageHeader().getText();
//		assertEquals("Desktops", pageHeader);
//		objProdPage.leftNavMac().click();
//		pageHeader= objProdPage.txtPageHeader().getText();
//		assertEquals("Mac", pageHeader);
//		objProdPage.getAddtoCArt().click();
//		Thread.sleep(2000);
//		hp.getCheckout().click(); // click on checkout and create checkout page object
//		
//		CheckoutPage objCP= new CheckoutPage(driver);
////		Fill up Billing details
//		objCP.radioShippingAddressNew().click();
//		objCP.txtboxFName().sendKeys("PHS");
//		objCP.txtboxLName().sendKeys("HS");
//		objCP.txtboxCompany().sendKeys("tcccsd");
//		objCP.txtboxAddress1().sendKeys("whitrose");
//		objCP.txtboxAddress2().sendKeys("test road");
//		objCP.txtboxCity().sendKeys("Bengaluru");
//		objCP.txtboxPostcode().sendKeys("560067");
//
//		WebElement country= objCP.drpdwnCountry();
//		Select selectCountry = new Select(country);
//		selectCountry.selectByVisibleText("India");
//		
////		objCP.drpdownRegion().click();
//		WebElement region= objCP.drpdownRegion();
//		Select selectRegion = new Select(region);
//		selectRegion.selectByVisibleText("Goa");
//		
//		objCP.btnContinue().click();
//		
////		Fill Delivery Details & method
////		objCP.radioShippingAddressExisting().isSelected();
//		objCP.btnShippingAddress().click();
//		objCP.btnShippingMethod().click();
//		
////		Fill Payment method
//		objCP.chkTerms().click();
//		objCP.btnPaymentMethod().click();
//		
////		Confirm Checkout
//		objCP.btnConfirmCheckout().click();
//	}
//
//}
