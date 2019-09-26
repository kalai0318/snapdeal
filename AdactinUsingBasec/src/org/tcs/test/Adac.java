package org.tcs.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Adac extends Base {
	public static void main(String[] args) {
		launchBrowser();
		loadUrl("https://adactin.com/HotelApp/");
		winMax();
		
		WebElement uname = driver.findElement(By.xpath("//input[@id='username']"));
		fill(uname,"usha0102");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		fill(pwd,"usha@1993");
		
		WebElement logbtn = driver.findElement(By.xpath("//input[@id='login']"));
		btnclick(logbtn);
		
		WebElement locsel = driver.findElement(By.xpath("//select[@id='location']"));
		selectdrop(locsel,"Melbourne");
		
		WebElement hotsel = driver.findElement(By.xpath("//select[@id='hotels']"));
		selectdrop(hotsel,"Hotel Sunshine");
		
		WebElement roomsel = driver.findElement(By.xpath("//select[@id='room_type']"));
		selectdrop(roomsel,"Double");

		WebElement nosel = driver.findElement(By.xpath("//select[@id='room_nos']"));
		selectdrop(nosel,"3");
		
		WebElement datepickin = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		fill(datepickin,"14/09/2019");
		
		
		WebElement datepickout = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		fill(datepickout,"15/09/2019");
		
	    WebElement adlutroom = driver.findElement(By.id("adult_room"));
	    selectdrop(adlutroom,"3");
	    
	    WebElement childroom = driver.findElement(By.id("child_room"));
	    selectdrop(childroom,"4");
	    
	    WebElement subtn = driver.findElement(By.id("Submit"));
	    btnclick(subtn);
	    
	    WebElement radioclk = driver.findElement(By.id("radiobutton_0"));
	    btnclick(radioclk);
	    
	    WebElement contbtn = driver.findElement(By.id("continue"));
	    btnclick(contbtn);
	    
	    WebElement fname = driver.findElement(By.id("first_name"));
	    fill(fname,"usha rathi");
	    
	    WebElement lname = driver.findElement(By.id("last_name"));
	    fill(lname,"sivashankar");
	    
	    WebElement billadd = driver.findElement(By.id("address"));
	    fill(billadd,"No19, Mariamman Koil st");
	    
	    WebElement cardno = driver.findElement(By.id("cc_num"));
	    fill(cardno,"4567 3456 8907 5674");
	    
	    WebElement cctype = driver.findElement(By.id("cc_type"));
	    selectdrop(cctype,"VISA");
	    
	    WebElement expmnth = driver.findElement(By.id("cc_exp_month"));
	    selectdrop(expmnth,"3");
	    
	    WebElement expyear = driver.findElement(By.id("cc_exp_year"));
	    selectdrop(expyear,"2020");
	    
	    
	    WebElement cvv = driver.findElement(By.id("cc_cvv"));
	    fill(cvv,"234");
	    
	    WebElement bnowbtn = driver.findElement(By.id("book_now"));
	    btnclick(bnowbtn);
	    
	    
	    
	    
	    
	    
	
	}

}
