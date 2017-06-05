package com.selenium.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ValtechPage {
	
	@FindBy(xpath = "html/body/div[1]/main/div[2]/div[3]/div[1]/header/h2")
	private WebElement latestNews;

	public WebElement getLatestNews() {
		return latestNews;
	}

	public void setLatestNews(WebElement latestNews) {
		this.latestNews = latestNews;
	}
}
