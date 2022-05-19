package com.capg.basic;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ExternalDemo implements Externalizable {

	 String s;
	 int i;
	 int j;
	
	public ExternalDemo() {
		
		System.out.println("no arg constructor");
	}

 public ExternalDemo(String s, int i, int j) {
	this.s = s;
	this.i = i;
	this.j = j;
}

public void writeExternal(ObjectOutput output) throws IOException {
	output.writeObject(s);
	output.writeInt(i);
	
}

public void readExternal(ObjectInput input) throws IOException, ClassNotFoundException {
	s=(String)input.readObject();
	i=input.readInt();
}
 
		public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
			ExternalDemo d=new ExternalDemo("RAFI",60,70);
			FileOutputStream fos=new FileOutputStream("abc.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(d);
			
			FileInputStream fis=new FileInputStream("abc.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			ExternalDemo d2= (ExternalDemo)ois.readObject();
			
			System.out.println(d2.s+"   "+d2.i+"   "+d2.j);
			
			System.out.println();
			}

}
