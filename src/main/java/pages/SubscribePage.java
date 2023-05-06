package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class SubscribePage {
	private SHAFT.GUI.WebDriver driver;

	public SubscribePage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private final By subscribeBox = By.id("EmailSignupModule__input");
	private final By subscribeButton = By.id("EmailSignupModule__submit-button");
	private final By assertionMessage = By
			.xpath("//*[@id=\"page-home\"]/div/div[2]/div[8]/div/div/div/div/div/div/div/h2");

	public void subscribe(String email) {
		driver.element().type(subscribeBox, email);
		driver.element().click(subscribeButton);
	}

	public String getAssertionMessage() {
		return driver.element().getText(assertionMessage);
	}

	public By getAssertionMessageLocator() {
		return assertionMessage;
	}

}
