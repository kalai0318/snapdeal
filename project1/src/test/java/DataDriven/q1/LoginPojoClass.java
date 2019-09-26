package DataDriven.q1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojoClass extends BaseCLASS {
	public LoginPojoClass() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement uname;
	
	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(id="login")
	private WebElement logbtn;
	public WebElement getUname() {
		return uname;
	}

	
	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLogbtn() {
		return logbtn;
	}

	
	
	

}
