package Ecommerce.Facebook;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AlterTestfb extends Baseclass {
	public WebDriver test;
	FacebookManagerobj fbob = new FacebookManagerobj(test);
	
	
	
  @Test(priority = 1,invocationCount = 2, description = "Driver Launched Succesfully")
  public void browser() throws Exception {
	  String getbrowser = Readerfbmanager.Instant_reader().Instatnt_readerValue().getbrowsername();
	  launchbrower( getbrowser);
	  String url = Readerfbmanager.Instant_reader().Instatnt_readerValue().geturl();
	  geturls(url);
	  
  }
  
  @Test(priority = 2)
  public void New_User() throws Exception {
	  String register = Readerfbmanager.Instant_reader().Instatnt_readerValue().createaccount();
		Clickbutton(fbob.Home_page().getCreateaccount(), register);
  
  }
  
}
