package edu.ipl.techmanagement;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTestExample {
	
	@Test
	public void testmultiply() {
		System.out.println("This is my test to multiplication");
		int a = 3;
	    int b = 2;
		//Assert.fail("Test Case Failed");
		Assert.assertEquals(App.multiply(a,b),"6");
		
		
	}

}
