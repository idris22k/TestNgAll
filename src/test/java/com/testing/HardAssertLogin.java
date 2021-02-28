package com.testing;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pojo.LoginPage;
import com.utilities.Base;

public class HardAssertLogin extends Base {
@Test
	private void launch1() {
		chromeBrowser();
		Assert.assertTrue(driver.getCurrentUrl().equals("https://www.facebook.com/"));
		
		LoginPage l = new LoginPage();
		
		WebElement txtEmail = l.getTxtEmail();
		type(txtEmail, "india");
		Assert.assertEquals("india", txtEmail.getAttribute("value"));
		
		
		WebElement txtpass = l.getTxtpass();
     type(txtpass, "tamilnadu");
     
     WebElement btnLogin = l.getBtnLogin();
     btnLogin.click();
     
		driver.close();
		
		
		
		
		
	}
	
	
@Test
private void launch2() {
	chromeBrowser();
	
	SoftAssert s = new SoftAssert();
String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	LoginPage l = new LoginPage();
	
	WebElement txtEmail = l.getTxtEmail();
	type(txtEmail, "india");

	WebElement txtpass = l.getTxtpass();
 type(txtpass, "tamilnadu");
 
 WebElement btnLogin = l.getBtnLogin();
 btnLogin.click();
 
	driver.close();
	
	
	
	
	
}




}
