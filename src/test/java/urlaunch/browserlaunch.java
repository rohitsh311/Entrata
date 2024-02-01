package urlaunch;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class browserlaunch {

	// Launch chrome browser
	public static WebDriver d = new ChromeDriver();

	// Test 1- To check user has navigated to required webpage by passing right url
	// @Test
	public static void browser() {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("disable-infobars");
		opt.addArguments("--start-maximized");
		opt.addArguments("--disable-extensions");
		// Open url
		d.get("https://www.entrata.com");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		/*
		 * WebElement cookies =
		 * d.findElement(By.xpath("//button[@id='rcc-confirm-button']"));
		 * cookies.click();
		 */

		// Validate Url Hard assertions
		System.out.println("Verifying Url....");
		String expectedurl = "https://www.entrata.com/";
		String actualurl = d.getCurrentUrl();
		Assert.assertEquals(expectedurl, actualurl);
		System.out.println("Url verified");
	}

	// Test 3 - Navigating to different page and verifying the navigation.

	@Test(priority = 2)
	public static void nav() throws InterruptedException {
		d.navigate().to("https://www.entrata.com");
		d.manage().window().maximize();
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
