package com.Human.human;

import java.util.Comparator;

public class incomeCompare implements Comparator<Human> {

	public int compare(Human h1, Human h2) {
		
		return h1.getincome()>h2.getincome()? 1 : h1.getincome()<h2.getincome()? -1 : 0;
	}

}
