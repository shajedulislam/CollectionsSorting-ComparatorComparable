package com.Human.human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;

public class ComparableTest extends TestCase {
	
	public void test()
	{
		Human h1 = new Human();
		
		h1.setName("Shajedul");
		h1.setAge(25);
		h1.setIncome(25000);
		
		Human h2 = new Human();
		
		h2.setName("Monem");
		h2.setAge(26);
		h2.setIncome(20000);
		
		List<Human> list = new ArrayList<Human>();
		
		list.add(h1);
		
		list.add(h2);
		
		Collections.sort(list);
		
		assertThat(list.get(1).getName(), is("Shajedul"));
		assertThat(list.get(0).getName(), is("Monem"));
		
	}
	


	
	
	

}
