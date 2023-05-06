package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class LoginPage {
	private SHAFT.GUI.WebDriver driver;

	public LoginPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private By emailTxt = By.name("customer[email]");
	private By passwordTxt = By.name("customer[password]");
	private By loginButton = By.xpath("//input[@value='Sign In']");
	private By assertionMessage = By.xpath("//h3[@class='name']");

	public void loginInformation(String email, String password) {
		driver.element().type(emailTxt, email);
		driver.element().type(passwordTxt, password);
		driver.element().click(loginButton);
	}

	public String getSuccessfulLoginAssertionMessage() {
		return driver.element().getText(assertionMessage);
	}

	public By getSuccessfullLoginAssertionMessageLocator() {
		return assertionMessage;
	}

}
