package com.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pojo.LoginPage;
import com.utilities.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderLogin extends Base {
	public static WebDriver driver;
	
@DataProvider(name = "smoke")
public Object[][] getData(){
	return new Object[][] {
		
		{"data","india"},{"india","data"}};
		
		
		
		
	}

@Test(dataProvider="smoke")
public static void launch(String s1 , String s2) {


	
		chromeBrowser();
		LoginPage l = new LoginPage();
		
		WebElement txtEmail = l.getTxtEmail();
		type(txtEmail, s1);
		
		WebElement txtpass = l.getTxtpass();
     type(txtpass, s2);
     WebElement btnLogin = l.getBtnLogin();
     btnLogin.click();
     
		driver.close();
		
	}








}	
	
	
	

