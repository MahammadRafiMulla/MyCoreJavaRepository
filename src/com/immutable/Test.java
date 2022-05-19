package com.immutable;

public final class Test {
	private int i;
	Test(int i){
		this.i=i;
	}
	
	public Test Modify(int i) {
		if(this.i==i) 
			return this;
			else
				return new Test(i);
				 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test t1=new Test(10);
		Test t2=t1.Modify(20);
		Test t3=t1.Modify(10);
		System.out.println(t1==t2);
		System.out.println(t1==t3);
	}

}
