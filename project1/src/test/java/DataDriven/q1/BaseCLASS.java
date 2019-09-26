package DataDriven.q1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseCLASS {
	static WebDriver driver;
	
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\sai project\\project1\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public static void loadUrl(String url) {
		driver.get(url);

	}
	
	public static void fill(WebElement e,String value) {
		e.sendKeys(value);

	} 
	
	public static void clickbtn(WebElement e) {
		e.click();

	}

}
