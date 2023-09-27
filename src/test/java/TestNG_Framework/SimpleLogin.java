package TestNG_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import Ecommerce.Facebook.FacebookManagerobj;
import Ecommerce.Facebook.Readerfbmanager;
import io.github.bonigarcia.wdm.WebDriverManager;
import scala.compiletime.ops.string;

public class SimpleLogin {
	static WebDriver test;
    public static 	FacebookManagerobj fbobject = new FacebookManagerobj(test);

	@Test(dataProvider = "sendkeys", description = "New register clicked succesfully")
	public void LaunchBrowser(String username, String password) throws Exception {

//		ChromeOptions chrome = new ChromeOptions();
//		WebDriverManager.chromedriver().setup();

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\White_Devil\\eclipse-workspace\\Facebook\\Webdriver\\chromedriver.exe");

		test = new ChromeDriver();

		test.get("https://www.facebook.com/");
		test.findElement(By.id("email")).sendKeys(username);
		test.findElement(By.id("pass")).sendKeys(password);
		test.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
	
	}


	@DataProvider(name  = "sendkeys")
	public Object[][] values() {
		Object  sendkeys[][] = new Object[1][2];
		sendkeys[0][0]= "anbu";
		sendkeys[0][1]= "Abcd123";
		return sendkeys;
		
	}
	
	@Test
	@Parameters({"firstname","lastname","mailid","password"})
	public void New_Register(String firstname, String lastname, String mailid, String password) throws Exception {
		
		test.findElement(By.name("firstname")).sendKeys(firstname);
		test.findElement(By.name("lastname")).sendKeys(lastname);
		test.findElement(By.name("reg_email__")).sendKeys(mailid);
		test.findElement(By.id("password_step_input")).sendKeys(password);
		
		WebElement Element = test.findElement(By.id("day"));
		Select s = new Select(Element);
		s.selectByValue("20");
		test.quit();
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Ignore
	@DataProvider(name = "input")
	public Object[][] Values() {

		Object input[][] = new Object[2][2];

		input[0][0] = "abcd";
		input[0][1] = "A1234";
		
		input[1][0] = "xyz";
		input[1][1] = "123A";
		return input;
	}

}
