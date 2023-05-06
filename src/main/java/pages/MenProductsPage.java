package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class MenProductsPage {
	private SHAFT.GUI.WebDriver driver;

	public MenProductsPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private final By menProducts = By.xpath("//p[text()='Men']");
	private final By treeRunner = By.xpath("//p[text()='Tree Runner']");
	private final By treeRunnerAssertionMessage = By.xpath("//span[@class='jsx-2878726709 Overview__name']");
	private final By hats = By.xpath("//p[text()='Hats']");
	private final By hatsAssertionMessage = By
			.xpath("//h1[@class='jsx-188808599 typography--breadcrumbs-primary-heading']");

	public void clickMenProducts() {
		driver.element().click(menProducts);
	}

	public void navigateToTreeRunner() {
		driver.element().click(treeRunner);
	}

	public String getTreeRunnerAssertionMessage() {
		return driver.element().getText(treeRunnerAssertionMessage);
	}

	public By getTreeRuunerAssertionLocator() {
		return treeRunnerAssertionMessage;
	}

	public void navigateToHatsProducts() {
		driver.element().click(hats);
	}

	public String getHatsAssertionMessage() {

		return driver.element().getText(hatsAssertionMessage);
	}
	
	public By getHatsAssertionLocator() {
		return hatsAssertionMessage;
	}

}
