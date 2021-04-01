//package QA_OpenCart.QA_Test;
//
//import static org.testng.Assert.assertEquals;
//
//import java.io.IOException;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import pageObjects.HeaderPage;
//import pageObjects.ProductPage;
//import resources.base;
//
//
//public class AddToCartTest extends base{
//	public WebDriver driver;
//	private static Logger log=LogManager.getLogger(AddToCartTest.class.getName());
//	
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
//	public void AddtoCart() {
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
////		Assert.assertEquals("Success: You have added iMac to your shopping cart!", objProdPage.getSuccessMgs().getText());  
//		
//		
//	}
//	
//	@Test
//	public void AddtoCartWithoutlogin() {
////		LoginToCart();
//		HeaderPage hp=new HeaderPage(driver);
//		hp.getNavDesktop().click();
//		ProductPage objProdPage = hp.getAllDesktops(driver);
//		String pageHeader= objProdPage.txtPageHeader().getText();
//		assertEquals("Desktops", pageHeader);
//		objProdPage.leftNavMac().click();
//		pageHeader= objProdPage.txtPageHeader().getText();
//		assertEquals("Mac", pageHeader);
//		objProdPage.getAddtoCArt().click();
////		Assert.assertEquals("Success: You have added iMac to your shopping cart!", objProdPage.getSuccessMgs().getText());  
//		
//		
//	}
//
//}
