package br.com.oitavo.fluentlenium.test;

import org.fluentlenium.adapter.FluentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class FluentTestBase extends FluentTest{
	protected static final String URL = "http://www.google.com";
	
	@Override
	public WebDriver getDefaultDriver() { 
		System.setProperty("webdriver.chrome.driver", "/home/olandim/Downloads/Selenium/chromedriver");		
        return new ChromeDriver();
    } 
}
