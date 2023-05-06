package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class SearchPage {
	private SHAFT.GUI.WebDriver driver;

	public SearchPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private By searchBox = By.id("SearchBarMinimal__input");
	private By firstProductAssertion = By.xpath("//p[text()='Showing results for shirts']");
	private By secondProductAssertion = By.xpath("//p[text()='Showing results for shorts']");

	public void searchForFirstProductProducts(String product) {
		driver.element().type(searchBox, product);
	}

	public String getFirstProductAssertionMessage() {
		return driver.element().getText(firstProductAssertion);
	}

	public By getFirstProductAssertionLocator() {
		return firstProductAssertion;
	}

	public void searchForSecondProduct(String product) {
		driver.element().type(searchBox, product);
	}

	public String getSecondProductSearchAssertion() {
		return driver.element().getText(secondProductAssertion);
	}
	public By getSecondProductAsseryionLocator() {
		return secondProductAssertion;
	}

}
