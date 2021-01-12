package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public WebDriver driver;

	public WebDriver initializerDriver() throws IOException {
		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream(
				"/Users/smourya/eclipse-workspace/bookingapp-selenium-project/src/main/java/config/config.properties");

		prop.load(fis);
		String browserNmae = prop.getProperty("browser");

		if (browserNmae.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
			driver = new ChromeDriver();

		}

		else if (browserNmae.equals("Firefox")) {

			// execute with firefox browser

		}

		else if (browserNmae.equals("IE")) {
			// execute with IE browser
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;

	}

}
