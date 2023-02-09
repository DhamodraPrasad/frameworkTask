package org.t.ing;

import org.testng.annotations.Test;

public class ClassC {
	@Test
	private void tc6() {
     System.out.println("Testcase------6");
	}
	@Test(priority=32)
	private void tc8() {
   System.out.println("Testcase-------8");
	}
	@Test
	private void tc7() {
   System.out.println("Testcase-------7");
	}

}
