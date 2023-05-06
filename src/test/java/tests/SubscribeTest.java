package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.shaft.driver.SHAFT;
import com.shaft.driver.SHAFT.TestData.JSON;

import pages.SubscribePage;

public class SubscribeTest extends TestBase {

	SubscribePage subscribePage;
	String currentTime = String.valueOf(System.currentTimeMillis());
	SHAFT.TestData.JSON registerData;

	@Test
	public void userCanSubscribe() {
		registerData = new JSON("registerData.json");
		subscribePage = new SubscribePage(driver);
		subscribePage.subscribe(registerData.getTestData("email") + currentTime + "@gmail.com");
		Assert.assertEquals(subscribePage.getAssertionMessage(), "It's Official");
	}
}
