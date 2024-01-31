package urlaunch;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class browserlaunch {

	// Launch chrome browser
	public static WebDriver d = new ChromeDriver();

	// Test 1- To check user has navigated to required webpage by passing right url

	@Test
	public static void browser() {

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

}
