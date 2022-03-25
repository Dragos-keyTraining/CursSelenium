package curs10;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AssertionExample {

	
	String unu = "Test";
	String doi = "Test1";
	
	//@Test
	public void checkStringsAreEqual() {
		
		if(unu.equals(doi)) {
			System.out.println("Test passed");
		}else {
			System.out.println("Test Failed");
		}
	}
	@Test
	public void checkStringEquality() {
		assertEquals(unu, doi);
		
		
		
	}
	
	
	
	
	
}
