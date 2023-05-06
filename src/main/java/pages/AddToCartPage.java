package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class AddToCartPage {
	private SHAFT.GUI.WebDriver driver;

	public AddToCartPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private final By navyNightProduct = By.xpath("//img[@alt='Navy Night ']");
	private final By navyNightPageAssertion = By.xpath("//span[@class='jsx-2878726709 Overview__name']");
	private final By sizeButton = By.xpath("//*[@id=\"pdp-size-selector\"]/ul/li[4]/button/span");
	private final By addToCartButton = By.id("add-to-cart");
	private final By addToCartAssertion = By
			.xpath("//p[@class='jsx-2717702063 jsx-3420466266 CartLineItem__master-product-name']");

	public void navigateToNavyProduct() {
		driver.element().click(navyNightProduct);

	}

	public String getAssertionMessage() {
		return driver.element().getText(navyNightPageAssertion);
	}

	public By getNavyProductPageAssertionLocator() {
		return navyNightPageAssertion;
	}

	public void addToCart() {
		driver.element().click(sizeButton);
		driver.element().click(addToCartButton);
	}

	public String getAddToCartAssertionMessage() {
		return driver.element().getText(addToCartAssertion);
	}

	public By getAddToCartAssertionLocator() {
		return addToCartAssertion;
	}

}
