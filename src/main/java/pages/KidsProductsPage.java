package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class KidsProductsPage {
	private SHAFT.GUI.WebDriver driver;

	public KidsProductsPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private final By kidsProductsButton = By.xpath("//p[text()='Kids']");
	private final By accessoriesProducts = By.xpath("//p[text()='Accessories']");
	private final By accessoriesAssertionMessage = By.xpath("//span[@class='jsx-2878726709 Overview__name']");
	private final By slipOnsProducts = By.xpath("//*[@id=\"top-navigation-drawer-desktop\"]/div/div/div/ul/li[1]/div/ul/li[2]/a/p");
	private final By slipOnsAssertionMessage = By.xpath("//span[@class='jsx-2878726709 Overview__name']");

	public void clickOnKidsProducts() {
		driver.element().click(kidsProductsButton);
	}

	public void navigateToAccessoriesProducts() {
		driver.element().click(accessoriesProducts);
	}

	public String getAccessoriesAssertionMessage() {
		return driver.element().getText(accessoriesAssertionMessage);
	}

	public By getAccessoriesAssertionLocator() {
		return accessoriesAssertionMessage;
	}

	public void navigateToSlipOnsProducts() {
		driver.element().click(slipOnsProducts);
	}

	public String getSlipOnsAssertionMessage() {
		return driver.element().getText(slipOnsAssertionMessage);
	}

	public By getSlipOnsAssertionLocator() {
		return slipOnsAssertionMessage;
	}

}
