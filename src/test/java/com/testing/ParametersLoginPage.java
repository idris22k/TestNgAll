package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pojo.LoginPage;
import com.utilities.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametersLoginPage  extends Base {
	
	
	@Parameters({ "email1" , "pass" })
 @Test
 public static void facebook(@Optional("india")String  username,@Optional("jshd")String password) {
	
		chromeBrowser();
		
	LoginPage	l = new LoginPage();
	WebElement txtEmail = l.getTxtEmail();
	txtEmail.sendKeys(username);
	
	 WebElement txtpass = l.getTxtpass();
	 
	 txtpass.sendKeys(password);
	 implicitly();
	WebElement btnLogin = l.getBtnLogin();
	btnLogin.click();
	 quit();
	 
}
 
	
	
	
}
