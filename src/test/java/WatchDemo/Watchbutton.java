package WatchDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import urlaunch.browserlaunch;

public class Watchbutton extends browserlaunch {

	// Test -2 Click on Watch demo button and fill the details and verify the
	// details entered are correct or not

	@Test(priority = 1)
	public static void Watch() throws InterruptedException {
		browser();
		Thread.sleep(3000);

		WebElement sig = d.findElement(By.xpath("//a[@class='button-default solid-dark-button']"));

		// Assertion for checking watch demo button is enabled
		Assert.assertTrue(sig.isEnabled());
		System.out.println("Watchdemo button is enabled");
		sig.click();

		// Entering details and checking by using assertions whether details are correct

		d.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Rohit");

		// Assertion for checking First name entered is correct
		Assert.assertEquals(d.findElement(By.xpath("//input[@id='FirstName']")).getAttribute("value"), "Rohit");
		System.out.println("First  name is correct");

		d.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Havale");

		// Assertion for checking Last name entered is correct
		Assert.assertEquals(d.findElement(By.xpath("//input[@id='LastName']")).getAttribute("value"), "Havale");
		System.out.println("Last  name is correct");

		Select s = new Select(d.findElement(By.xpath("//select[@id='Unit_Count__c']")));
		s.selectByVisibleText("1 - 10");

		// Assertion for checking DOM selected is correct
		Assert.assertEquals(s.getFirstSelectedOption().getText(), "1 - 10");
		System.out.println("Selected value is correct");
	}

}
