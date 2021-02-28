package com.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pojo.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
public static WebDriver driver;


public static void maximixe() {
	driver.manage().window().maximize();
	
}

public static  void quit() {
	driver.quit();
}

public static void implicitly() {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}


public static void loadUrl() {
	driver.get("https://www.facebook.com/");
}

	public static void chromeBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
		loadUrl();
		maximixe();
		implicitly();
		
	}
	
	
	public static void firefoxBrowser() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver(); 
		loadUrl();
		maximixe();
		implicitly();
		
	}
	
	
	
	
	
	
	public static void  btnclick(WebElement element) {
		element.click();
	}
	
	
	
		
	
	
	public static void type(WebElement element,String data) {
		element.sendKeys(data);

	}
	
	
	
	
	
	
	
	
	
	
	
}
