package com.testing;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;

public class Sample {
public static WebDriver driver;
	
	@BeforeClass
	
	public  void launchBrowser() {
	
System.out.println("launchbrowser");
	
	}
	
	
	@Parameters({"browser"})
	@Test
	public static void launch(String  browserName) {
		if (browserName.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.close();
			
		}
		else if (browserName.equals("ie")) {
			WebDriverManager.iedriver().setup();
		driver= new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();
		}
		
		else {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.close();
		}
		
	
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\MOHAMAD IDRIS\\eclipse-workspace\\SampleTestNg\\src\\test\\resources\\Drivers\\chromedriver.exe");
	
	//WebDriverManager.iedriver().setup();
	}
	
	/*          
	<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Suite"   thread-count = "5">
  <test name="chromeTest">
 <parameter name = "browser"  value = "chrome">
 <classes>
 <class name = "com.testing.Sample">
 </class>
 </classes>
 </parameter>
  

  </test> 
  <test name="ieTest">
 <parameter name = "browser"  value = "ie">
 <classes>
 <class name = "com.testing.Sample">
 </class>
 </classes>
 </parameter>
  

  </test> 
  <test name="firefoxTest">
 <parameter name = "browser"  value = "firefox">
 <classes>
 <class name = "com.testing.Sample">
 </class>
 </classes>
 </parameter>
  

  </test> 
  
  
  
  
</suite> <!-- Suite -->

	 
	 
	 
	 
	 
	  
	  
	  
	  
	 * */
	
	
	
	
}
