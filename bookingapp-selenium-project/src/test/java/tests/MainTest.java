package tests;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SignInPage;
import utils.TestBase;

public class MainTest extends TestBase{
	
	
	
	@Test
	public void pageNavigation() throws IOException {
		
		driver = initializerDriver();
		driver.get("https://www.booking.com");
		
		HomePage hp = new HomePage(driver);
	//	hp.searchPlace().sendKeys("Chicago");
	
		
		
		
		
		
		
		


	}


}
