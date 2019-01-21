package com.Human.human;

import java.util.Comparator;

public class ageCompare implements Comparator<Human> {

	public int compare(Human h1, Human h2) {
		
		return h1.getAge()>h2.getAge()? 1 : h1.getAge()<h2.getAge()? -1 : 0;
	}

}
