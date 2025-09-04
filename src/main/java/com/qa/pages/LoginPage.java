package com.qa.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.pages.HomePage;
import com.qa.base.Base;

public class LoginPage extends Base{
	
	@FindBy(xpath="//input[@placeholder=\"Email address or phone number\"]")
	WebElement userid;

	@FindBy(xpath="//input[@placeholder=\"Password\"]")
	WebElement pwd;

	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement button;
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	public HomePage Textbox(String id, String pswd) throws Exception  {
		userid.sendKeys(id);
		pwd.sendKeys(pswd);
		button.click();
		return new HomePage();	
	}
	

}
