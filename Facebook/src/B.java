import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class B extends Base {
	public static void main(String[] args) {
		launchBrowser();
		loadUrl("https://adactin.com/HotelApp/");
		winMax();
		
		WebElement nuser = driver.findElement(By.linkText("New User Register Here"));
		clickbtn(nuser);
		
		WebElement uname = driver.findElement(By.xpath("//input[@id='username']"));
		fill(uname,"sashi");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		fill(pass,"sashi@123");
		
		WebElement cpass = driver.findElement(By.id("re_password"));
		fill(cpass,"sashi@123");
		
		WebElement fname = driver.findElement(By.id("full_name"));
		fill(fname,"sashi Naina");
		
		WebElement eadd = driver.findElement(By.id("email_add"));
		fill(eadd,"kallai0318@gmail.com");
		
		WebElement checkbox = driver.findElement(By.id("tnc_box"));
		clickbtn(checkbox);
		
		WebElement reg = driver.findElement(By.className("reg_button"));
		clickbtn(reg);
		
		//WebElement usertxt = driver.findElement(By.id("username"));	
		//fill(usertxt,"sashi");
	}

	

	

}
