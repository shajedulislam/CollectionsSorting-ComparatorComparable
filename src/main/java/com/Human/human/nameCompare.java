package com.Human.human;

import java.util.Comparator;

public class nameCompare implements Comparator<Human> {

	public int compare(Human h1, Human h2) {
		
		return h1.getName().compareTo(h2.getName());
	}

}
