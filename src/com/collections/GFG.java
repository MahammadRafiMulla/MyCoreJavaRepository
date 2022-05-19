package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GFG {
	
	public static void countFrequencies(ArrayList<String > list) {
		
	/*	//hashmap to store the frequency of element
		
		Map<String, Integer> hm= new HashMap<String,Integer>();
		
		for(String i: list) {
			Integer j=hm.get(i);
			hm.put(i,(j==null)?1:j+1);
			
		}
		// displaying the occurrence of elements in the arraylist
        for (Map.Entry<String, Integer> val : hm.entrySet()) {
            System.out.println("Element " + val.getKey() + " "
                               + "occurs"
                               + ": " + val.getValue() + " times");
        } */
    
		//take hashset and add list into it
		
		Set<String> st=new HashSet<String>(list);
		
		for(String s:st)
			System.out.println(s+":"+Collections.frequency(list, s));
			
		
		
 	
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<String> list = new ArrayList<String>();
        list.add("java");
        list.add("java");
        list.add("java");
        list.add("c++");
        list.add("c++");
        list.add("c++");
        list.add("Geeks");
        list.add("Geeks");
        list.add("Geeks");
        
        countFrequencies(list);
	}

}
