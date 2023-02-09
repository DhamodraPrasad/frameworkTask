package org.t.ing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReRuncls {
	@Test(retryAnalyzer=ReRunExtendsClass.class)
	private void tc1() {
    System.out.println("Testcase 1....");
	}
	@Test
	private void tc2() {
    System.out.println("Testcase 2.....");
	}
	@Test(retryAnalyzer=ReRunExtendsClass.class)
	private void tc3() {
		Assert.assertTrue(10>100, "check tc3");
     System.out.println("Testcase 3.....");
	}
	

}
