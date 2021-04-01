package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.HeaderPage;
import pageObjects.LoginPage;

public class base {
	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException {
		prop = new Properties();

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties");

		prop.load(fs);
//		String browserName = prop.getProperty("browser");
		String browserName = System.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("test-type");
			options.addArguments("headless");
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

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;

	}

	public String getScreenShot(String testname, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenShotSrc = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") + "\\reports\\" + testname + ".png";
		FileUtils.copyFile(screenShotSrc, new File(destinationFile));
		return destinationFile;
	}

//	public void LoginToCart() {
//
//		HeaderPage hp = new HeaderPage(driver);
//		hp.getMyAccount().click();
//		LoginPage objLoginPage = hp.getLogin(); // Create login page object within getLogin method
//
//		objLoginPage.getEmailAddress().sendKeys(prop.getProperty("username"));
//		objLoginPage.getPassword().sendKeys(prop.getProperty("password"));
//		objLoginPage.getLogin().click();
//
//	}

}
