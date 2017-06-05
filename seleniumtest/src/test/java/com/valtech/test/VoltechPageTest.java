package com.valtech.test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import com.selenium.test.pages.*;

public class VoltechPageTest extends BaseTest{

	private static String url = "https://www.valtech.com/";
	
	@Test
	public void verifyHappyScenario() throws InterruptedException
	{
		driver.get(url);
		ValtechPage valtechPage = PageFactory.initElements(driver, ValtechPage.class);
		assertEquals("Latest news", valtechPage.getLatestNews().getText());
		
		NavPage navPage = PageFactory.initElements(driver, NavPage.class);
		navPage.getNav().click();
		
		Thread.sleep(5000);
		NavListPage navListPage = PageFactory.initElements(driver, NavListPage.class);
		navListPage.getAboutLink().clear();
		navListPage.getAboutLink().click();
		
		Thread.sleep(5000);
		AboutPage aboutPage = PageFactory.initElements(driver, AboutPage.class);
		
		assertEquals("About", aboutPage.getPageHeader().getText());
		
		Thread.sleep(5000);
		navPage.getNav().click();
		Thread.sleep(5000);
		navListPage.getWorkLink().click();
		
		Thread.sleep(5000);
		WorkPage workPage = PageFactory.initElements(driver, WorkPage.class);
		assertEquals("Work", workPage.getWorkHeader().getText());
		
		Thread.sleep(5000);
		navPage.getNav().click();
		Thread.sleep(5000);
		navListPage.getServLink().click();
		
		Thread.sleep(5000);
		ServicePage servPage = PageFactory.initElements(driver, ServicePage.class);
		assertEquals("Services", servPage.getServHeader().getText());
		
		navPage.getContactUs().click();
		
		
		Thread.sleep(5000);
		ContactPage contactPage = PageFactory.initElements(driver, ContactPage.class);
		assertEquals(14, contactPage.getContactList().size());
	}
	
	@Test
	public void verifyFailureScenario() throws InterruptedException
	{
		driver.get(url);
		ValtechPage valtechPage = PageFactory.initElements(driver, ValtechPage.class);
		Assert.assertNotEquals("Latests news", valtechPage.getLatestNews().getText());
		
		Thread.sleep(5000);
		NavPage navPage = PageFactory.initElements(driver, NavPage.class);
		navPage.getContactUs().click();
		Thread.sleep(5000);
		ContactPage contactPage = PageFactory.initElements(driver, ContactPage.class);
		Assert.assertNotEquals(10, contactPage.getContactList().size());
	}
}
