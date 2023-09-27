package Ecommerce.Facebook;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



 public class Baseclass {

	static WebDriver test;
	static Actions ac;
    static Select d;
    static Select m;
    static Select y;
	public static WebDriver launchbrower(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\White_Devil\\eclipse-workspace\\Amazontest\\webdriver\\chromedriver.exe");

			test = new ChromeDriver();
			test.manage().window().maximize();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\White_Devil\\eclipse-workspace\\Amazontest\\webdriver\\chromedriver.exe");

			test = new FirefoxDriver();
			test.manage().window().maximize();
		}
		return test;
	}

	public static void geturls(String url) {
			test.get(url);
	}

	public static void waits(String waiting) {
		test.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	public static void title(String webpageName) {
		test.getTitle();

	}

	public static void currentUrl(String webpagetUrl) {
		test.getCurrentUrl();

	}



	public static void alert(String alerts) {
		test.switchTo().alert().accept();

	}
	public static void Getback(WebElement element, String goback) throws Exception {
		ac = new Actions(test);
		ac.contextClick(element).build().perform();
		Robot r = new Robot();
		if(goback.equalsIgnoreCase("yes")) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		}
		
	}


	public static void SendKeysAction(WebElement getElement, String getEmailid) {
		 ac = new Actions(test);
		 ac.sendKeys(getElement, getEmailid).build().perform();
	}
	
	public static void Clickbutton(WebElement element, String elementname) {
		if(elementname.equalsIgnoreCase("click")) {
			ac = new Actions(test);
			ac.click(element).build().perform();
			
		}
		}
	
	public static void Close() {
		test.quit();
	}
	
	public static void ClickAnyButton(WebElement elelment) {
		ac = new Actions(test);
		ac.click(elelment).build().perform();
	}
	
	
	public static void Selectvalue(WebElement element, String birthdate) {
	
		d = new Select(element);
		d.selectByValue(birthdate);
		}
	
	public static void Selectbytext(WebElement element, String birthmonth) {
		m = new Select(element);
		m.selectByVisibleText(birthmonth);
		

	}
	
	public static void Selectbyvisibletext(WebElement element, String birthyear) {

		y = new Select(element);
        y.selectByVisibleText(birthyear);	
	}
	
	public static void Genderselect(WebElement element,  String gender) {
		
		ac = new Actions(test);
		if(gender.equalsIgnoreCase("male")) {
			ac.click(element).build().perform();
			
		}else if(gender.equalsIgnoreCase("female")) {
			ac.click(element).build().perform();
			
		}else if(gender.equalsIgnoreCase("custom")) {
			ac.click(element).build().perform();
			
		}

	}
	
	
	
	
	
	
	}
	
	
	
	

