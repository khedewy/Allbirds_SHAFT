package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.shaft.driver.SHAFT;
import com.shaft.driver.SHAFT.TestData.JSON;

import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class LoginTest extends TestBase {

	HomePage homePage;
	RegisterPage register;
	LoginPage log;
	SHAFT.TestData.JSON registerData;
	String currentTime = String.valueOf(System.currentTimeMillis());

	@Test
	public void navigateToRegisterPage() {
		homePage = new HomePage(driver);
		homePage.navigateToRegisterPage();
		Assert.assertEquals(homePage.registerPageAssertionMessage(), "CREATE AN ACCOUNT");
	}

	@Test(priority = 1)
	public void completeRegister() {
		registerData = new JSON("registerData.json");
		register = new RegisterPage(driver);
		register.userInformation(registerData.getTestData("firstName"), registerData.getTestData("lastName"),
				registerData.getTestData("email") + currentTime + "@gmail.com", registerData.getTestData("password"));
	}

	@Test(priority = 2)
	public void assertRegisterSuccessfully() {
		register = new RegisterPage(driver);
		register.navigateToAssertionMessage();
		Assert.assertEquals(register.getRegisterAssertionMessage(), "MAHMOUD KHEDEWY");

	}

	@Test(priority = 3)
	public void logoutAndNavigateToLogin() {
		register = new RegisterPage(driver);
		register.logout();
		homePage = new HomePage(driver);
		homePage.navigateToLoginPage();
	}

	@Test(priority = 4)
	public void enterLoginInformation() {
		registerData = new JSON("registerData.json");
		log = new LoginPage(driver);
		log.loginInformation(registerData.getTestData("email") + currentTime + "@gmail.com",
				registerData.getTestData("password"));
		Assert.assertEquals(log.getSuccessfulLoginAssertionMessage(), "MAHMOUD KHEDEWY");
	}

}
