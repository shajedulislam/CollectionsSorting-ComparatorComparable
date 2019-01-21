package com.Human.human;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	//-------------Comparable----------------
    	
    	/*System.out.println("Sort by Name using Comparable:\n");
    	
        ArrayList<Human> list1 = new ArrayList<Human>();
        
        list1.add(new Human("Shajedul", 25, 25000));
        list1.add(new Human("Monem", 26, 24000));
        list1.add(new Human("Partho", 24, 23000));
        
        Collections.sort(list1);
        
        for(Human h : list1)
        {
        	System.out.println("Name: "+h.getName()+"\tAge: "+h.getAge()+"\tIncome: "+h.getincome());
        }
        */
        
        
        
        //-------------Comparator with same class where comparable is----------------
        
        /*System.out.println("\nSort by age using Comparator:\n");
        
        ArrayList<Human> list2 = new ArrayList<Human>();
        
        list2.add(new Human("Shajedul", 25, 10000));
        list2.add(new Human("Monem", 26, 25000));
        list2.add(new Human("Partho", 24, 25000));
        
        
        Human hh = new Human();
        
        Collections.sort(list2, hh);
        
        for(Human h : list2)
        {
        	System.out.println("Name: "+h.getName()+"\tAge: "+h.getAge()+"\tIncome: "+h.getincome());
        }*/
        
        
        
        
        //-------------Comparator at different class by required data----------------
        
        /*System.out.println("\nSort by name using Comparator:\n");
        
        ArrayList<Human> list2 = new ArrayList<Human>();
        
        list2.add(new Human("Shajedul", 25, 25000));
        list2.add(new Human("Monem", 26, 24000));
        list2.add(new Human("Partho", 24, 23000));
        
        nameCompare nc = new nameCompare();
        
        Collections.sort(list2, nc);
        
        for(Human h : list2)
        {
        	System.out.println("Name: "+h.getName()+"\tAge: "+h.getAge()+"\tIncome: "+h.getincome());
        }
        
        
        
        System.out.println("\nSort by income using Comparator:\n");
        
        ArrayList<Human> list3 = new ArrayList<Human>();
        
        list3.add(new Human("Shajedul", 25, 25000));
        list3.add(new Human("Monem", 26, 24000));
        list3.add(new Human("Partho", 24, 23000));
        
        incomeCompare ic = new incomeCompare();
        
        Collections.sort(list3, ic);
        
        for(Human h : list3)
        {
        	System.out.println("Name: "+h.getName()+"\tAge: "+h.getAge()+"\tIncome: "+h.getincome());
        }*/
        
        
    }
}
