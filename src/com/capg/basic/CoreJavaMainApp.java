package com.capg.basic;

public class CoreJavaMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int[] x=new int[5];
	//int[] y=new int[10];
	x[0]=10;
	x[1]=20;
	x[2]=30;
	x[3]=40;
	x[4]=50;
	//x[5]=500;
	System.out.println(x);
	int[] j= {12,23,34,45,50,67,80,70,50};	
	System.out.println(j.length);
	//System.out.println(y.length);

	
	
	String s1=new String("RAJA VIKRAMARKA");
	String s2=new String("BHAIRVA DEEPAM");
	System.out.println(s1.length());
	StringBuffer b1=new StringBuffer("MONA SINGH");
	System.out.println(b1.reverse());
	
	
  String reverse="";
  
  for(int i=s1.length()-1;i>=0;--i) {
	  reverse=reverse+s1.charAt(i);
  }
	  System.out.println(reverse);
	  
	String reversedString="";
	 for(int i=s2.length()-1;i>=0;--i) {
		 
		 reversedString=reversedString+s2.charAt(i);
           }
	
	System.out.println(reversedString);
	
	
	String s="MY NAME IS RAFI";
	String rever="";
	
	for(int i=s.length()-1;i>=0;--i) {
		rever=rever+s.charAt(i);
	}
	System.out.println(rever);
	
	int[] y=new int[30];
	System.out.println(y.length);
	}
	
}