package org.tcs.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	
	static WebDriver driver;
	
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\sai project\\Adactin\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public static void winMax() {
		driver.manage().window().maximize();

	}
	
	public static void loadUrl(String url) {
		driver.get(url);
    }
	
	public static void fill(WebElement e, String value) {
		e.sendKeys(value);
	}
	
	public static void btnclick(WebElement e) {
		e.click();
	}
	
	public static void selectdrop(WebElement d, String value) {
      
		Select s = new Select(d);
		
		s.selectByValue(value);
		

	}
	

}
