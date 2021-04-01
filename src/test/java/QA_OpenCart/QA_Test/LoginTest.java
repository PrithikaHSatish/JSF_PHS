package QA_OpenCart.QA_Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.logging.log4j.*;


import pageObjects.LoginPage;

public class LoginTest extends BaseTest {
	private static Logger log=LogManager.getLogger(LoginTest.class.getName());
//	public WebDriver driver;    // driver is local and hence do not affect the parallel execution
	
//	@BeforeTest
//	public void setUp() throws IOException {
//		driver = initializeDriver();
//		log.info("Driver initialized");
//		driver.get(System.getProperty("url"));
//		
//	}
//
//	@AfterTest
//	public void tearDown() {
//		driver.close();
//		log.info("Driver Closed");
//	}

	@Test(dataProvider = "getData")
	public void Login(String Username, String password, String expected) throws IOException {
		LoginPage loginPage = headerPage.GotoLoginPage();

		loginPage.enterUsername(Username);
		loginPage.enterPassword(password);
		loginPage.clickLogin();
		
		log.info("Clicked Login Button");
		
		headerPage.logout();

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][3];
		data[0][0] = "phsLname@gmail.com";
		data[0][1] = "mypaswd";
		data[0][2] = "valid";
		data[1][0] = "phsLname@gmail.com";
		data[1][1] = "mypaswd";
		data[1][2] = "invalid";
		return data;
	}

}
