package org.t.ing;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class FailedTc implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation test, Class testClass, Constructor testConstructor, Method testMethod) {
     IRetryAnalyzer res = test.getRetryAnalyzer();		
     if (res==null) {
    	 test.setRetryAnalyzer(ReRunExtendsClass.class);
		
	}
	}
	

}
