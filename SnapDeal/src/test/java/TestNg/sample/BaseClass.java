package TestNg.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	static WebDriver driver;
	
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\sai project\\sample\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	public static void getUrl(String url) {	
		driver.get(url);
}
	public static void winMax() {
		driver.manage().window().maximize();

	}
	
}
