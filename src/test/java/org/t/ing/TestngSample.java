package org.t.ing;

import org.testng.annotations.Test;

public class TestngSample {
	
	@Test
	public void tc2() {
      System.out.println("Testcase-----2");
	}
	@Test(priority=-2)
	public void tc1() {
		System.out.println("Testcase-----1");
		
	}
	

}



