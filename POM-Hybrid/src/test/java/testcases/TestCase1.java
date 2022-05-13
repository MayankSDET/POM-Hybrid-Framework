package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.base;

public class TestCase1 extends base {

	@Test
	public void search_test() throws InterruptedException {

		driver.findElement(By.xpath(OR.getProperty("searchtext"))).sendKeys(config.getProperty("Seach"));
		driver.findElement(By.xpath(OR.getProperty("searchclick"))).click();

		Thread.sleep(5000);



	}
}