package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	WebDriver driver;

	public SignInPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "username")
	WebElement username;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button")
	WebElement submit;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div/div/div/div/form/button")
	WebElement login;

	public WebElement username() {
		return username;
	}

	public WebElement submit() {
		return submit;
	}

	public WebElement password() {
		return password;
	}

	public WebElement login() {
		return login;
	}

}
