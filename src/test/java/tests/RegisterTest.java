package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.shaft.driver.SHAFT;
import com.shaft.driver.SHAFT.TestData.JSON;

import pages.HomePage;
import pages.RegisterPage;

public class RegisterTest extends TestBase {
	HomePage homePage;
	RegisterPage register;
	SHAFT.TestData.JSON registerData;
	String currentTime = String.valueOf(System.currentTimeMillis());

	@Test
	public void navigateToRegisterPage() {
		homePage = new HomePage(driver);
		homePage.navigateToRegisterPage();
		 Assert.assertEquals(homePage.registerPageAssertionMessage(),"CREATE AN ACCOUNT");
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

}
