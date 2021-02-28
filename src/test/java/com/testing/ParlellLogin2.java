package com.testing;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

import com.utilities.Base;

public class ParlellLogin2 extends Base {
@Test(retryAnalyzer = Failed.class)
	private void launchfirefox() {
	firefoxBrowser();
	driver.quit();
	}
	
	
}
