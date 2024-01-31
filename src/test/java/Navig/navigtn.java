package Navig;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import urlaunch.browserlaunch;

public class navigtn extends browserlaunch {

	// Test 3 - Navigating to various pages and verifying the navigation.

	@Test(priority = 2)
	public static void nav() throws InterruptedException {
		d.navigate().to("https://www.entrata.com");
		WebElement erm = d.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > div > footer > div:nth-child(1) > div > div:nth-child(1) > a:nth-child(10)"));
		JavascriptExecutor j = (JavascriptExecutor) d;
		j.executeScript("arguments[0].click();", erm);
		Thread.sleep(3000);

		// Assertion for checking navigation is to desired page

		Assert.assertEquals(d.getCurrentUrl(), "https://www.entrata.com/products/revenue-management");
		System.out.println("Navigated to Revenue management");

	}

}
