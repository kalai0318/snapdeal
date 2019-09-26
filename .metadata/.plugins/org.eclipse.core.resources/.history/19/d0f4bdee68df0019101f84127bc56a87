package org.man.Train;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SearchPage {
	public static void main(String[] args) throws AWTException {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\sai project\\Train\\Driver\\chromedriver.exe");
	WebDriver driver =  new ChromeDriver(option);
	driver.get("https://www.air.irctc.co.in/");
	
	driver.manage().window().maximize();
	
	
	WebElement from = driver.findElement(By.id("stationFrom"));
	from.click();
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	
	WebElement to = driver.findElement(By.id("stationTo"));
	to.click();
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	
	WebElement depdate = driver.findElement(By.id("Departure-Date"));
	depdate.click();
	
	WebElement depmonth = driver.findElement(By.xpath("//*[@id=\"Departure-Date\"]/datepickermodifi/div/div[2]/div[1]/table/tbody/tr[6]/td/span[1]"));
	depmonth.click();
	
	WebElement depdate1 = driver.findElement(By.xpath("//*[@id=\"Departure-Date\"]/datepickermodifi/div/div[2]/div[2]/table/tbody/tr[2]/td[4]/span"));
	depdate1.click();
	
	WebElement search = driver.findElement(By.xpath("//button[text()='Search ']"));
	search.click();
	
	//booking page
	
	WebElement fdetail = driver.findElement(By.xpath("//*[@id=\"Flight_Details_tab\"]"));
	fdetail.click();
	
	WebElement faredetails = driver.findElement(By.cssSelector("#myTabJust > li:nth-child(3) > a"));
	faredetails.click();
	
	
	
	
	}

}
