package com.qa.orangepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
		
	WebDriver driver;
	
	@FindBy(xpath="//h6[//text()='Dashboard']")
	private WebElement dashboard;
	
	public Dashboard(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String GetText()
	{	
		String Text=dashboard.getText();
		return Text;
	}
	public boolean IsTextPresent()
	{		
		boolean isPresent= dashboard.isDisplayed();
		return isPresent;
	}

}
