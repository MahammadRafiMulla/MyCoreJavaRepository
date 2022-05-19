package com.capg.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Serializable{
	transient String i="MAHAMMAD";
	 int j=20;
}
public class SerialDemo {
public static void main(String[] args) throws Exception{
	
Demo d1=new Demo();
FileOutputStream fos=new FileOutputStream("abc.txt");
ObjectOutputStream obs= new ObjectOutputStream(fos);
obs.writeObject(d1);

FileInputStream fis= new FileInputStream("abc.txt");
ObjectInputStream ois= new ObjectInputStream(fis);

Demo d2=(Demo)ois.readObject();
System.out.println(d2.i+"    "+d2.j);
}
}