package com.testing;

import org.testng.annotations.Test;

public class IncludeAndExclude {

	@Test(groups = "sanity")
private void test1() {
	System.out.println("Test1");
}	
	

	@Test
private void test2() {
	System.out.println("Test2");
}	


	@Test
private void test3() {
	System.out.println("Test3");
}	


	@Test(groups = "sanity")
private void test4() {
	System.out.println("Test4");
}	

	
	
	
	
	
	
	
	
	
}
