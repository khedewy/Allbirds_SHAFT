package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchPage;

public class SearchTest extends TestBase {

	HomePage homePage;
	SearchPage search;

	@Test
	public void navigateToSearchPage() {
		homePage = new HomePage(driver);
		homePage.navigateToSearchPage();
	}

	@Test(priority = 1, enabled = true)
	public void searchForFirstProduct() {

		search = new SearchPage(driver);
		search.searchForFirstProductProducts("shirts");
		Assert.assertEquals(search.getFirstProductAssertionMessage(), "Showing results for shirts");
	}

	@Test(priority = 2)
	public void searchForSecondProduct() {
		search = new SearchPage(driver);
		search.searchForSecondProduct("shorts");
		Assert.assertEquals(search.getSecondProductSearchAssertion(), "Showing results for shorts");
	}

}
