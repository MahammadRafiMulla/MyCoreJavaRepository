package com.capg.Instancev;

public class InstanceDemo {
	
	 static int x=10;
	  int y=20;
	 public static void main(String[] args) {
		
		
		 int x=20;
		 int y=++x;
		 System.out.println(y);
		 //System.out.println(10==10);
		 String s1=new String("DURGA");
		 String s2=new String("DURGA");
		 System.out.println(s1.equals(s2));
		 Thread t=new Thread();
		 System.out.println(t instanceof Runnable);
		 System.out.println(true^false);
		 
		 //System.out.println(InstanceDemo.x);
		//System.out.println(id.x);
		
		 InstanceDemo id1=new InstanceDemo();
		 id1.x=888;
		 id1.y=999;
		 //id1.main();
		 InstanceDemo id2=new InstanceDemo();
		 System.out.println(id2.x+" "+id2.y);
		 InstanceDemo id3=new InstanceDemo();
		 System.out.println(id3.x+" "+id3.y);
		 
		 System.out.println("String[]");

if(x==3)
	System.out.println("HIII");
else
 System.out.println( "i am not available");

for(int i=0;i<10;i++) {
	System.out.println("NO BOSS YOU ARE ONLY SLEEPING");
}

int []a= {300,400,500};
 for(int i=0;i<a.length;i++) {
	 System.out.println(a[i]+"");
 }

 int []b= {500,500,350,600,500};
 for(int k:b) {
	 System.out.println(k+"");
 }

}

}