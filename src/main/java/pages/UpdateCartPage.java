package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class UpdateCartPage {
	private SHAFT.GUI.WebDriver driver;

	public UpdateCartPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private final By plusButton = By
			.xpath("//button[@class='jsx-250421924 NumberStepper__button NumberStepper__button--step-up']");
	private final By plusAssertionMessage = By.xpath("//span[text()='2']");
	private final By deleteButton = By.xpath("//span[@class='jsx-4160761852 CloseIcon CloseIcon--hoverable']");
	private final By deleteAssertionMessage = By
			.xpath("//p[@class='jsx-3554908711 jsx-3341288278 CartEmptyState__heading']");

	public void clickPlusButton() {
		driver.element().click(plusButton);
	}

	public String getPlusAssertionMessage() {
		return driver.element().getText(plusAssertionMessage);
	}

	public By getPlusAssertionMessageLocator() {
		return plusAssertionMessage;
	}

	public void deleteProduct() {
		driver.element().click(deleteButton);
	}

	public String getDeleteProductAssertionMessage() {
		return driver.element().getText(deleteAssertionMessage);
	}

	public By getDeleteAssertionMessagelcoator() {
		return deleteAssertionMessage;
	}

}
