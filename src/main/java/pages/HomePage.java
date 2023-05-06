package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class HomePage {
	private SHAFT.GUI.WebDriver driver;

	public HomePage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private final By registerBtn = By.xpath("//img[@class=' Lazy--loaded']");
	private final By registerPageAssertion = By.xpath("//h1[text()='Create an Account']");
	private final By loginButton = By.xpath("//img[@class=' ls-is-cached Lazy--loaded']");
	private final By searchButton = By.xpath("//div[@class='jsx-2022988330 Icon Icon--SEARCH_SKINNY']");

	public RegisterPage navigateToRegisterPage() {
		driver.element().click(registerBtn);
		return new RegisterPage(driver);
	}

	public String registerPageAssertionMessage() {
		return driver.element().getText(registerPageAssertion);
	}

	public By getRegisterPaageAssertionLocator() {
		return registerPageAssertion;
	}

	public LoginPage navigateToLoginPage() {

		driver.element().click(loginButton);
		return new LoginPage(driver);
	}

	public SearchPage navigateToSearchPage() {
		driver.element().click(searchButton);
		return new SearchPage(driver);
	}

}
