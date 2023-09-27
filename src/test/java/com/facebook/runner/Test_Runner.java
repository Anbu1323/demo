package com.facebook.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Ecommerce.Facebook.Baseclass;
import Ecommerce.Facebook.FacebookManagerobj;
import Ecommerce.Facebook.Readerfbmanager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="src//test//java//com//facebook//feature", glue = "com.facebook.stepdefines")

public class Test_Runner  {
	
	public static WebDriver test;
    public static 	FacebookManagerobj fbobject = new FacebookManagerobj(test);

	@BeforeClass
	public static void set_up() {

		test = Baseclass.launchbrower("chrome");
		
	}

	@AfterClass
	public static  void tearDown() {

		test.close();
	}
}
