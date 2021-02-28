package com.testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {

	@Test
	private void test1() {
	System.out.println("Test1");
	}
	
	@Test(dependsOnMethods = {"test3"}  )
	private void test2() {
	System.out.println("Test2");
	}
	
	@Test(dependsOnMethods = {"test5"},alwaysRun=true  )
	private void test3() {
		Assert.assertTrue(false,"Assert Failure test3");
	System.out.println("Test3");
	}
	
	@Test
	private void test4() {
	System.out.println("Test4");
	}
	
	
	@Test
	private void test5() {
	System.out.println("Test5");
	}
	
	
	
	
	
	
	
}
