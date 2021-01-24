package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// stay option
	@FindBy(id = "ss")
	WebElement destination;

	@FindBy(className = "bui-calendar__date")
	// css ="[class='bui-calendar'][class='bui-calendar__month']",xpath
	// ="//*[@class='bui-calendar']//*[@class='bui-calendar__control
	// bui-calendar__control--next']")
	List<WebElement> date;
	WebElement month;
	WebElement next;

	public WebElement searchPlace() {
		return destination;
	}

	public List<WebElement> calender() {

//		
//	while(!month.getText().contains("March 2021")) {
//		
//		next.click();
//	}

		int count = date.size();

		for (int i = 0; i < count; i++) {

			String calenderText = date.get(i).getText();

			if (calenderText.equalsIgnoreCase("29")) {

				date.get(i).click();
				break;

			}

		}

		return date;

	}
}
