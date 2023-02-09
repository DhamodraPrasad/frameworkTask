package org.t.ing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReRunClsListener {
	@Test
	public void tc1() {
    System.out.println("Testcase 1...");
	}
	@Test
	public void tc2() {
		System.out.println(4/0);
     System.out.println("TestCase 2....");
	}
	@Test
	public void tc3() {
		Assert.assertTrue(10>100, "check tc3");
       System.out.println("Testcase 3....");
	}

}
