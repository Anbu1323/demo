package Ecommerce.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;

import scala.compiletime.ops.string;

public class Testfacebook extends Baseclass {
	
	
	public static WebDriver test;
    public static 	FacebookManagerobj fbobject = new FacebookManagerobj(test);


	
	public static void main(String[] args) throws Exception{
		
		
		
		String browser = Readerfbmanager.Instant_reader().Instatnt_readerValue().getbrowsername();
		launchbrower(browser);
		
	 String geturl = Readerfbmanager.Instant_reader().Instatnt_readerValue().geturl();
		geturls(geturl);
		
		String getEmailid = Readerfbmanager.Instant_reader().Instatnt_readerValue().getmailid();
		SendKeysAction(fbobject.Home_page().getEmailid(), getEmailid);
		
		String getpassword = Readerfbmanager.Instant_reader().Instatnt_readerValue().getpassword();
		SendKeysAction(fbobject.Home_page().getPassword(), getpassword);
		
//		String back = Readerfbmanager.Instant_reader().Instatnt_readerValue().Goback();
//		Getback(fbobject.Home_page().getBack(), back);
		
	
            ///Register Account 
		
		String register = Readerfbmanager.Instant_reader().Instatnt_readerValue().createaccount();
		Clickbutton(fbobject.Home_page().getCreateaccount(), register);
		
		
		Thread.sleep(3000);
		
		String name = Readerfbmanager.Instant_reader().Instatnt_readerValue().firstname();
		SendKeysAction(fbobject.Register_account().getFirstname(), name);
		
		
		String lastname = Readerfbmanager.Instant_reader().Instatnt_readerValue().lastname();
		SendKeysAction(fbobject.Register_account().getLastname(), lastname);
		

		String mobnumber = Readerfbmanager.Instant_reader().Instatnt_readerValue().mobilenumber();
		SendKeysAction(fbobject.Register_account().getMailidOrmobilenumber(), mobnumber);
		
		String password = Readerfbmanager.Instant_reader().Instatnt_readerValue().regpassword();
		SendKeysAction(fbobject.Register_account().getPassword(), password);
		
		
		String birthday = Readerfbmanager.Instant_reader().Instatnt_readerValue().dateOfbirth();
		Selectvalue(fbobject.Register_account().getDateofbirth(), birthday);
		
		
		String birthmonth = Readerfbmanager.Instant_reader().Instatnt_readerValue().monthOfbirth();
		Selectbytext(fbobject.Register_account().getMonthofbirth(), birthmonth);
		
		String birthyear = Readerfbmanager.Instant_reader().Instatnt_readerValue().yearOfbirth();
        Selectbyvisibletext(fbobject.Register_account().getYearofbirth(), birthyear);
		
		String genderSelect = Readerfbmanager.Instant_reader().Instatnt_readerValue().genderMale();
         Genderselect(fbobject.Register_account().getMale(), genderSelect);
		
		
		String genderFemale = Readerfbmanager.Instant_reader().Instatnt_readerValue().genderFemale();
		Genderselect(fbobject.Register_account().getFemale(), genderFemale);
		
		String genderCustom = Readerfbmanager.Instant_reader().Instatnt_readerValue().genderCustom();
		Genderselect(fbobject.Register_account().getCustom(), genderCustom);
		
		
		Close();
		
		
		
	}








	




	


}
