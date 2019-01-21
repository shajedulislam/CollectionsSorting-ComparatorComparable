package com.Human.human;

import java.util.Comparator;

public class Human implements Comparable<Human>/*, Comparator<Human>*/{
	
	private String name;
	private int age;
	private Float income;
	
	public Human() {
		
		
		
	}
	
	public Human(String n, int a, float i) {
		
		this.name = n;
		this.age = a;
		this.income = i;
		
	}
	
	public void setName(String n)
	{
		this.name = n;
	}
	
	public void setAge(int a)
	{
		this.age = a;
	}
	
	public void setIncome(float i)
	{
		this.income = i;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public float getincome() {
		return income;
	}
	
	//Comparable
	public int compareTo(Human h1) {
		return this.name.compareTo(h1.name);
	}
	
	//Comparator
	/*public int compare(Human h2, Human h3) {
		return h2.age>h3.age? 1 : h2.age<h3.age? -1 : 0;
		
	}*/

}
