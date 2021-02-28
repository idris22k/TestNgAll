package com.testing;

import org.testng.annotations.Test;

import com.utilities.Base;

public class ParlellLogin extends Base {

	@Test
	private void launchChromeBrowser() {
	chromeBrowser();
	driver.quit();
	}
	
	
	
	
	
	
}
