package com.capg.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo1 implements Serializable{
	
	 int a=30;
	 transient String b="VIKRAM BETHALUDU";
	}

public class SrlDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Demo1 d1= new Demo1();
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);//serialization
		
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Demo1 d2=(Demo1)ois.readObject();
		System.out.println(d2.a+"    "+d2.b);	
		System.out.println("EVERYTHING ABOUT SERILIZATION AND DESERIALIZATION");
		}
     
}
