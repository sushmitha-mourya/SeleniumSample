package tests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import utils.TestBase;

public class HomePageTest extends TestBase {

	@BeforeTest
	public void pageNavigation() throws IOException {

		driver = initializerDriver();
		driver.get("https://www.booking.com");

	}

	@Test
	public void stayMenu() {

		HomePage hp = new HomePage(driver);
		// Stay Destination
		hp.searchPlace().sendKeys("Chi");

		for (int i = 1; i < 4; i++) {

			hp.searchPlace().sendKeys(Keys.ARROW_DOWN);

		}

		hp.searchPlace().sendKeys(Keys.ENTER);

		// calender dates

		hp.calender();

	}

}
