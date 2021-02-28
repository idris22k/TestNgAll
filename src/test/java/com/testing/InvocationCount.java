package com.testing;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pojo.LoginPage;
import com.utilities.Base;

public class InvocationCount extends Base {
	@Test(invocationCount = 3)
	private void launch1() {
		chromeBrowser();
		
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
}
