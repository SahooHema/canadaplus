package com.qa.base;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Base {	
	public static WebDriver driver;
	public static void initialization() {
		System.setProperty("WebDriver.chrome.driver","./Driver/Chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();		
	}

}
