package com.Human.human;

import junit.framework.TestCase;

public class ComparatorTestByAge extends TestCase {
	
	public void testGreater() {
		
		Human h1 = new Human("Monem", 26, 20000); 
		
		Human h2 = new Human("Shajedul",25,25000);
		
		ageCompare ac = new ageCompare();
		
		int result = ac.compare(h1, h2);
		
		assertTrue("Expected to be greater than", result >= 0);
	}
	
	public void testLower() {
		
		Human h1 = new Human("Shajedul",25,25000); 
		
		Human h2 = new Human("Monem", 26, 20000); 
		
		ageCompare ac = new ageCompare();
		
		int result = ac.compare(h1, h2);
		
		assertTrue("Expected to be lower than", result <= 0);
	}
	
	public void testEqual() {
		
		Human h1 = new Human("Shajedul",25,25000); 
		
		Human h2 = new Human("Monem", 25, 20000); 
		
		ageCompare ac = new ageCompare();
		
		int result = ac.compare(h1, h2);
		
		assertTrue("Expected to be equal", result == 0);
	}

}
