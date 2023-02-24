package com.qa.orangepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.orangebase.BaseClass;

public class LoginPage extends BaseClass{
	
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement Username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Submit;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	public void AddUsername(String username) {
		Username.sendKeys(username);
	}
	public void AddPassword(String password ) {
		Password.sendKeys(password);
	}
	public void ClickSubmit() {
		Submit.click();
	}
	
}
