package com.qa.pages;

import org.openqa.selenium.support.PageFactory;


import com.qa.base.Base;

public class HomePage extends Base{
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

}
