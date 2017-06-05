package com.selenium.test.pages;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Page {

	protected static WebDriver driver;

	@BeforeClass
	public static void setup() {
		driver = new SafariDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@AfterClass
	public static void clear() {
		//driver.quit();
	}
}