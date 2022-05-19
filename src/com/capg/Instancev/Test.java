package com.capg.Instancev;

public class Test implements Cloneable {

private static Test t;

private Test() {
	
}

public static Test GetInstance() {
	if(t==null)
		t=new Test();
	return t;
	
}
public Object Clone() {
	return this;
	
}
public static void main(String[] args) {
	Test t1=Test.GetInstance();
	Test t2=Test.GetInstance();
	System.out.println(t1.hashCode());
	System.out.println(t2.hashCode());
	if(t1==t2) {
		return;
	}
}
}
