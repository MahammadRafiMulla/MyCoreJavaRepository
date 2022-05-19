package com.collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapC {

		  public static void main(String[] args) {
			  
			  
			  String s= "RAFI";
			  String reverse="";
			  
			  for(int i=s.length()-1;i>=0;i--) {
				  reverse=reverse+s.charAt(i);
				 // System.out.println(" "+reverse);
			  }
			  System.out.println(" "+reverse);
	 
	        // create HashMap
	        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<Integer, String>();
	 
	        // put few items
	        map.put(1, "Google");
	        map.put(2, "Microsoft");
	        map.put(3, "Oracle");
	        map.put(4, "Apple");
	        map.put(5, "Facebook");
	 
	        // getting entrySet() into Set
	        Set<Entry<Integer, String>> entrySet = map.entrySet();
	 
	        // iterate and remove items simultaneously
	        for(Entry<Integer, String> entry : entrySet) {
	 
	            int key = entry.getKey();
	 
	            if(key == 8) {
	                // try to remove, while iterating
	                map.remove(key);
	            }
	            else {
	                System.out.println(entry.getKey() + "\t" + entry.getValue());
	            }
	        }
	    }
	}

