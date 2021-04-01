//package QA_OpenCart.QA_Test;
//
//import java.io.IOException;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import pageObjects.HeaderPage;
//import pageObjects.RegisterPage;
//import resources.base;
//
//public class RegisterTest extends base{
//	public WebDriver driver;
//	private static Logger log=LogManager.getLogger(RegisterTest.class.getName());
//	
//	HeaderPage objectHeaderPage;
//	
//	@BeforeTest
//	public void setup() throws IOException {
//		driver= initializeDriver();
//		log.info("Driver Initialised");
//		driver.get(prop.getProperty("url"));
//	}
//	@AfterTest 
//	public void tearDown(){
//		driver.close();
//	}
//	
//	@Test
//	public void registerUser() throws IOException {
//		log.info("TEST: Register User test Begins");
//		objectHeaderPage=new HeaderPage(driver);
//		objectHeaderPage.getMyAccount().click();
//		RegisterPage objRegisterPage= objectHeaderPage.getRegister();
//		//Fill register page
//		
//		objRegisterPage.txtboxFirstName().sendKeys("prithika");
//		objRegisterPage.txtboxLastName().sendKeys("hs");
//		objRegisterPage.txtboxEmail().sendKeys("pp@test.com");
//		objRegisterPage.txtboxTele().sendKeys("9876543234");
//		objRegisterPage.txtboxPassword().sendKeys("PP@Test12");
//		objRegisterPage.txtboxConfirmPswd().sendKeys("PP@Test12");
//		objRegisterPage.chkboxPrivacy().click();
//		objRegisterPage.btnContinue().click();		
//		log.info("User Registered");
//		Assert.assertEquals("Your Account Has Been Created!", objRegisterPage.txtConfirmation().getText());
//		Assert.assertEquals("Congratulations! Your new account has been successfully created!", objRegisterPage.txtCongrats().getText());
//		log.info("TEST: Register User test ends");
//	}
//	
//	@Test
//	public void registerUserwithoutFillingMandatoryFields() {
//		log.info("TEST: Register User without Mandatory fields test Begins");
//		
//		objectHeaderPage.getMyAccount().click();
//		RegisterPage objRegisterPage= objectHeaderPage.getRegister();
//		//Fill register page
//		objRegisterPage.chkboxPrivacy().click();
//		objRegisterPage.btnContinue().click();
//		log.info("Register without mandatory fields");
//		Assert.assertTrue(objRegisterPage.txtFNameValidation().isDisplayed());
//		Assert.assertTrue(objRegisterPage.txtLNameValidation().isDisplayed());
//		Assert.assertTrue(objRegisterPage.txtEmailValidation().isDisplayed());
//		Assert.assertTrue(objRegisterPage.txtTeleValidation().isDisplayed());
//		Assert.assertTrue(objRegisterPage.txtPaswdValidation().isDisplayed());	
//		log.info("TEST: Register User without Mandatory fields test Ends");
//	}
//	
//	@Test
//	public void registerUserWithPasswordmismatch() {
//		log.info("TEST: Register page Password mismatch test begins");
//		HeaderPage objectHeaderPage=new HeaderPage(driver);
//		objectHeaderPage.getMyAccount().click();
//		RegisterPage objRegisterPage= objectHeaderPage.getRegister();
//		//Fill register page
//		objRegisterPage.txtboxFirstName().sendKeys("prithika");
//		objRegisterPage.txtboxLastName().sendKeys("hs");
//		objRegisterPage.txtboxEmail().sendKeys("pp@test.com");
//		objRegisterPage.txtboxTele().sendKeys("9876543234");
//		objRegisterPage.txtboxPassword().sendKeys("PP@Test12");
//		objRegisterPage.txtboxConfirmPswd().sendKeys("PP@Test1234");
//		objRegisterPage.chkboxPrivacy().click();
//		objRegisterPage.btnContinue().click();
//		
//		Assert.assertTrue(objRegisterPage.txtMisMatchValidation().isDisplayed());
//		log.info("TEST: Register page Password mismatch test ends");
//	}
//
//}
