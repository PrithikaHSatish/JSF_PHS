package QA_OpenCart.QA_Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pageObjects.HeaderPage;

public class BaseTest {

	protected WebDriver driver;
	public Properties prop;
//	private final String URL = "https://example.testproject.io/web/index.html";
	protected HeaderPage headerPage;
	private static Logger log=LogManager.getLogger(BaseTest.class.getName());

	@BeforeClass
	public void setUp() throws IOException {
		 prop = new Properties();

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties");

		prop.load(fs);
//			String browserName = prop.getProperty("browser");
		String browserName = System.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("test-type");
//			options.addArguments("headless");
			options.addArguments("ignore-certificate-errors");
			options.setAcceptInsecureCerts(true);
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\main\\java\\resources\\driver\\chrome\\chromedriver.exe");
			driver = new ChromeDriver(options);

		}
		if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("Webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\src\\main\\java\\resources\\driver\\gecko\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		log.info("Driver Initiated");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
//		return driver;
		driver.get(System.getProperty("url"));
		headerPage=new HeaderPage(driver);

	}
	@AfterClass
	public void tearDown() {
		driver.close();
		log.info("Driver Closed");
	}

}
