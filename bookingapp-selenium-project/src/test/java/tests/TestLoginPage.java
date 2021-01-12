package tests;

import java.io.IOException;


import org.testng.annotations.Test;

import pages.HomePage;
import pages.SignInPage;
import utils.TestBase;

public class TestLoginPage extends TestBase {

	
	
	@Test
	public void pageNavigation() throws IOException {
		
		driver = initializerDriver();
		driver.get("https://www.booking.com");
		
		HomePage hp = new HomePage(driver);
		hp.signIn().click();
		
		SignInPage sp = new SignInPage(driver);
		sp.username().sendKeys("sushmithamj2@gmail.com");
		sp.submit().click();
		sp.password().sendKeys("Sushmitha@123");
		sp.login().click();
		

	}

}
