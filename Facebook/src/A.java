import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A extends BBaseclass  {
	public static void main(String[] args) throws AWTException {
		
	launchBrowser();
		
    loadUrl("https://www.facebook.com/");
    windMax();
    
    WebElement usertxt = driver.findElement(By.id("email"));
	fill(usertxt,"sashi");
	
	WebElement passtxt = driver.findElement(By.id("pass"));
	fill(passtxt,"sashi@123");
	
	WebElement btn = driver.findElement(By.id("loginbutton"));
	btnclick(btn);
    
		
		
		
	}

}
