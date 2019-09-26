package DataDriven.q1;

public class AdactinUsingPOM extends BaseCLASS{
	public static void main(String[] args) {
		
		launchBrowser();
		loadUrl("https://adactin.com/HotelApp/");
		LoginPojoClass p = new LoginPojoClass();
		fill(p.getUname(),"usha0102");
		fill(p.getPwd(),"usha@1993");
		clickbtn(p.getLogbtn());
		
	
	}
	

}
