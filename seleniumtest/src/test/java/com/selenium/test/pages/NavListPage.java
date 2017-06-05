package com.selenium.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavListPage {
	
	@FindBy(xpath = "html/body/div[1]/header/div/nav/div/div[2]/div/ul/li[1]/a/span")
	private WebElement aboutLink;
	
	@FindBy(xpath = "html/body/div[1]/header/div/nav/div/div[2]/div/ul/li[2]/a/span")
	private WebElement workLink;

	@FindBy(xpath = "html/body/div[1]/header/div/nav/div/div[2]/div/ul/li[3]/a/span")
	private WebElement servLink;

	public WebElement getAboutLink() {
		return aboutLink;
	}

	public void setAboutLink(WebElement aboutLink) {
		this.aboutLink = aboutLink;
	}

	public WebElement getWorkLink() {
		return workLink;
	}

	public void setWorkLink(WebElement workLink) {
		this.workLink = workLink;
	}

	public WebElement getServLink() {
		return servLink;
	}

	public void setServLink(WebElement servLink) {
		this.servLink = servLink;
	}

	
}


