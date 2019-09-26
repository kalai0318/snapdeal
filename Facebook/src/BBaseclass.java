import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBaseclass {
	
	static WebDriver driver;
	public  static WebDriver launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\sai project\\Facebook\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
		
	}
   public static void loadUrl(String url)
	{
		driver.get(url);
    }
   
   public static void windMax()
	{
		driver.manage().window().maximize();
	}
   public static void fill(WebElement e,String value)
	{
		e.sendKeys("value");
	}
	
	public static void btnclick(WebElement e)
	{
		e.click();
	}
	
	
}
