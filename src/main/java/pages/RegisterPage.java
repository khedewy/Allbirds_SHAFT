package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class RegisterPage {
	private SHAFT.GUI.WebDriver driver;

	public RegisterPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private final By firstNameTxt = By.id("FirstName");
	private final By lastNameTxt = By.id("LastName");
	private final By emailTxt = By.id("Email");
	private final By passwordTxt = By.id("CreatePassword");
	private final By confirmPasswordTxT = By.id("CustomerPasswordConfirmation");
	private final By registerButton = By.xpath("//input[@value='Register']");
	private final By assertionButton = By.xpath("//img[@class=' ls-is-cached Lazy--loaded']");
	private final By assertRegisterMessage = By.xpath("//h3[@class='name']");
	private final By logoutBtn = By.xpath("//a[@class='logout']");

	public void userInformation(String firstName, String lastName, String email, String password) {
		driver.element().type(firstNameTxt, firstName);
		driver.element().type(lastNameTxt, lastName);
		driver.element().type(emailTxt, email);
		driver.element().type(passwordTxt, password);
		driver.element().type(confirmPasswordTxT, password);
		driver.element().click(registerButton);
	}

	public void navigateToAssertionMessage() {
		driver.element().click(assertionButton);
	}

	public String getRegisterAssertionMessage() {
		return driver.element().getText(assertRegisterMessage);
	}

	public By getRegisterAssertionMessageLocator() {
		return assertRegisterMessage;
	}

	public void logout() {
		driver.element().click(logoutBtn);
	}

}
