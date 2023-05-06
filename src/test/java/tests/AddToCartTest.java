package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AddToCartPage;
import pages.HomePage;
import pages.SearchPage;

public class AddToCartTest extends TestBase {

	HomePage homePage;
	SearchPage search;
	AddToCartPage add;

	@Test
	public void navigateToSearchPage() {
		homePage = new HomePage(driver);
		homePage.navigateToSearchPage();

	}

	@Test(priority = 1)
	public void searchForFirstProduct() {

		search = new SearchPage(driver);
		search.searchForFirstProductProducts("shirts");
		Assert.assertEquals(search.getFirstProductAssertionMessage(), "Showing results for shirts");
	}

	@Test(priority = 2)
	public void navigateToProducts() {

		add = new AddToCartPage(driver);
		add.navigateToNavyProduct();
		Assert.assertEquals(add.getAssertionMessage(), "Navy Night");
	}

	@Test(priority = 3)
	public void addToCart() {
		add = new AddToCartPage(driver);
		add.addToCart();
		Assert.assertEquals(add.getAddToCartAssertionMessage(), "Men's Sea Tee");
	}



}
