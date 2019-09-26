import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	static WebDriver driver;
	
	public static  void launchBrowser()
	{
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\sai project\\Facebook\\driver\\chromedriver.exe");
	  driver = new ChromeDriver();	
	}
	public static void loadUrl(String url)
	{
		driver.get(url);
	}
	public static void winMax()
	{
		driver.manage().window().maximize();
	}
	public static void clickbtn(WebElement e)
	{
		e.click();
	}
	public static void fill(WebElement e, String value)
	{
		e.sendKeys(value);
	}
}
