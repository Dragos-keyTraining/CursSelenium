package curs10;

import org.testng.annotations.Test;

public class PriorityExample {
	
	@Test(priority = 1)
	public void one() {
		System.out.println("first");
	}
	@Test(priority = 2)
	public void two() {
		System.out.println("second");
	}
	@Test(priority = 3)
	public void third() {
		System.out.println("third");
	}
	
	@Test(priority = 4)
	public void abc() {
		System.out.println("ABC");
	}
	

}
