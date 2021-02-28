package com.testing;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class FailedAll implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		IRetryAnalyzer r = annotation.getRetryAnalyzer();
		while (r == null) {
			
			annotation.setRetryAnalyzer(Failed.class);
			
		}
		
		
		
		
	}

}
