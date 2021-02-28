package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.Base;

public class LoginPage extends Base {

	public LoginPage() {
		PageFactory.initElements(driver, this);
			
			}
	
	
	@FindBy(id = "email")
	private WebElement txtEmail;
	

	@FindBy(id = "pass")
	private WebElement txtpass;
	

	@FindBy(xpath = "//button[@name = 'login']")
	private WebElement btnLogin;


	public WebElement getTxtEmail() {
		return txtEmail;
	}


	public void setTxtEmail(WebElement txtEmail) {
		this.txtEmail = txtEmail;
	}


	public WebElement getTxtpass() {
		return txtpass;
	}


	public void setTxtpass(WebElement txtpass) {
		this.txtpass = txtpass;
	}


	public WebElement getBtnLogin() {
		return btnLogin;
	}


	public void setBtnLogin(WebElement btnLogin) {
		this.btnLogin = btnLogin;
	}
		
	
}
